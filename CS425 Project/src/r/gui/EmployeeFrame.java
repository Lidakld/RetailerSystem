package r.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.util.Iterator;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

import r.beans.Customer;
import r.beans.Stock;
import r.controller.Controller;

public class EmployeeFrame extends JFrame {
	private JFileChooser fileChooser;
	private JTabbedPane tabbedPane;
	private CustomerTablePanel customertable;
	private StockTablePanel stocktable;
	private Controller controller;
	private CustomerFrame cf;
	private RequestListener requestListener;

	
	public EmployeeFrame() {
		super("Welcome to Warlmart!");
		
		fileChooser = new JFileChooser();
		tabbedPane = new JTabbedPane();
		customertable = new CustomerTablePanel();
		stocktable = new StockTablePanel();
		controller = new Controller();
		cf = new CustomerFrame();
		
		
		setLayout(new BorderLayout());
		
		tabbedPane.add("Customer Table", customertable);
		tabbedPane.add("Inventory Table", stocktable);
	
		cf.getToolBar().registerbtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				RegisterFrame rf = new RegisterFrame();
				rf.setVisible(true);
				
				rf.rp.setRegisterListener(new RegisterListener() {

					public void RegisterEventOccured(RegisterEvent re) {
					
						System.out.println(re);
						controller.addCustomer(re);
						customertable.refresh();		
					}
					
				});
			}
			
		});
		
		cf.getToolBar().signinbtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				SigninFrame sf = new SigninFrame();
				sf.setVisible(true);
				
				sf.sp.setSigninListener(new SigninListener() {

					public void SigninEventOccured(SigninEvent se) {
							controller.searchCustomer(se);					
					}
					
				});
			}
			
		});
		//cf.getOrdertable().setData(controller.selectStore(1));
		controller.setResultListener(new ResultListener() {

			public void ResultEventsOccured(ResultEvent re) {
				if(re.getInfo() == 1) {
					int action = JOptionPane.showOptionDialog(cf, re.getStr(), "Sign in Message", JOptionPane.OK_CANCEL_OPTION, 
							JOptionPane.INFORMATION_MESSAGE, null, null, null);
					if(action == JOptionPane.OK_OPTION) {
						StoreSelectFrame ssf = new StoreSelectFrame();
						ssf.setVisible(true);
						
//						ssf.storePanel.okbtn.addActionListener(new ActionListener() {
//
//									public void actionPerformed(ActionEvent e) {
//										if(ssf.storePanel.store1.isSelected()) {
//											RequestEvent re = new RequestEvent(this,1);
//											System.out.println("SSP: "+re.getType());
//											
//											if(ssf.storePanel.requestListener!=null)
//												ssf.storePanel.requestListener.RequestEventOccured(re);
//										}else if(ssf.storePanel.store2.isSelected()) {
//											RequestEvent re = new RequestEvent(this,2);
//											System.out.println("SSP: "+re.getType());
//											if(ssf.storePanel.requestListener!=null)
//												ssf.storePanel.requestListener.RequestEventOccured(re);
//										}else if(ssf.storePanel.store3.isSelected()) {
//											RequestEvent re = new RequestEvent(this,3);
//											System.out.println("SSP: "+re.getType());
//											if(ssf.storePanel.requestListener!=null)
//												ssf.storePanel.requestListener.RequestEventOccured(re);
//										}
//										else;
//										
//									}
//									
//								});
						
						ssf.storePanel.setSSPListener(new RequestListener() {
							public void RequestEventOccured(RequestEvent rq) {
								System.out.println("CF: "+rq.getType());
								cf.ordertable.setData(controller.listAllStock());
//								cf.ordertable.setData(controller.selectStore(rq));
//								cf.ordertable.refresh();
							}
							
						});
					
					}
				}else{
					JOptionPane.showMessageDialog(cf, re.getStr());
				}
			}
		});
		
		

		customertable.setData(controller.listAllCustomer());
		stocktable.setData(controller.listAllStock());
		
		add(tabbedPane,BorderLayout.CENTER);
		
		setSize(1000,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setJMenuBar(createMenu());
		
	
		
	}
	
	public JMenuBar createMenu() {
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("File");
		JMenuItem importItem = new JMenuItem("Import Data...");
		JMenuItem exportItem = new JMenuItem("Export Data...");
		JMenuItem exitItem = new JMenuItem("Exit");
		
		fileMenu.add(importItem);
		fileMenu.add(exportItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		
		importItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(fileChooser.showOpenDialog(EmployeeFrame.this) == JFileChooser.APPROVE_OPTION) {
					System.out.println(fileChooser.getSelectedFile());
				}
			}
		});
		
		exportItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(fileChooser.showSaveDialog(EmployeeFrame.this) == JFileChooser.APPROVE_OPTION) {
					System.out.println(fileChooser.getSelectedFile());
				}	
			}
		});
		
		exitItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int action = JOptionPane.showConfirmDialog(EmployeeFrame.this,
						"Do you really want to exit?","Confirm Exit",JOptionPane.OK_CANCEL_OPTION);
				if(action == JOptionPane.OK_OPTION)
					System.exit(0);
			}	
		});
		
		return menuBar;
	}
}

