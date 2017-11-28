package r.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import r.controller.Controller;

public class StoreSelectFrame extends JFrame {
	protected StoreSelectPanel storePanel;
	protected Controller controller;
	protected RequestListener requestListener;
	
	public StoreSelectFrame() {
		storePanel = new StoreSelectPanel();
		controller = new Controller();
		
//		storePanel.setSSPListener(new RequestListener() {
//
//			public void RequestEventOccured(RequestEvent rq) {
//				controller.selectStore(rq);		
//			}
//			
//		});
		setLayout(new BorderLayout());
		setSize(500,400);
		add(storePanel,BorderLayout.CENTER);
		setVisible(true);
	}
	
}
