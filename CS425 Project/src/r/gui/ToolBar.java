package r.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ToolBar extends JPanel {
	protected JButton registerbtn;
	protected JButton signinbtn;
//	protected JComboBox storeCat;
	
	public ToolBar() {
		registerbtn = new JButton("Register");
		signinbtn = new JButton("Sign In");
//		storeCat = new JComboBox();
		
		DefaultComboBoxModel storeModel = new DefaultComboBoxModel();
		storeModel.addElement("Store 1");
		storeModel.addElement("Store 2");
		storeModel.addElement("Store 3");
		
//		storeCat.setModel(storeModel);
//		storeCat.setSelectedIndex(0);
//		storeCat.setEditable(true);
//		
		
		setBorder(BorderFactory.createEtchedBorder());
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(registerbtn);
		add(signinbtn);
//		add(storeCat);
	

		
//		signinbtn.addActionListener(new ActionListener() {
//
//			public void actionPerformed(ActionEvent e) {
//				SigninFrame sf = new SigninFrame();
//				sf.setVisible(true);
//			}
//			
//		});
	}
}
