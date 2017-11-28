package r.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import r.controller.Controller;

public class CustomerFrame extends JFrame {
	protected ToolBar toolBar;
	protected OrderTablePanel ordertable;
	protected Controller controller;
	protected StoreSelectFrame ssframe;
	
	public CustomerFrame() {
		super("Welcome to Warlmart!");
		setToolBar(new ToolBar());
		ordertable = new OrderTablePanel();
		controller = new Controller();
		//ssframe = new StoreSelectFrame();
		
		
		setLayout(new BorderLayout());
		
		add(getToolBar(),BorderLayout.NORTH);
		add(ordertable,BorderLayout.CENTER);
		//ordertable.setData(controller.selectStore(1));
		//ordertable.setData(controller.listAllStock());
//		ssframe.setRequestListener(new RequestListener() {
//
//			public void RequestEventOccured(RequestEvent rq) {	
//				System.out.println(rq.type);
//				ordertable.setData(controller.selectStore(rq));	
//				ordertable.refresh();
//			}
//		
//		}
//);
		
		setSize(1000,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public OrderTablePanel getOrdertable() {
		return ordertable;
	}

	public void setOrdertable(OrderTablePanel ordertable) {
		this.ordertable = ordertable;
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public ToolBar getToolBar() {
		return toolBar;
	}

	public void setToolBar(ToolBar toolBar) {
		this.toolBar = toolBar;
	}
}
