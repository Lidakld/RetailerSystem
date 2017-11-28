package r.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Apply {
	public static void main(String[] arg) {
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				JFrame frame = new JFrame("Welcome to Walmart!");
				//new CustomerFrame();
				new EmployeeFrame();
	
			}
			
		});
	}
}
