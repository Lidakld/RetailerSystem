package r.gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import r.controller.*;

public class RegisterFrame extends JFrame {
	protected RegisterPanel rp;
	//private Controller controller;
	//private CustomerTablePanel tablePanel;
	
	
	public RegisterFrame() {
		rp = new RegisterPanel();

		setLayout(new BorderLayout());
		setSize(500,400);
		setVisible(true);
		add(rp,BorderLayout.CENTER);
	}
}
