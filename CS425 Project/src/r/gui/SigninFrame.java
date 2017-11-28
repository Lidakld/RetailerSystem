package r.gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SigninFrame extends JFrame {
	protected SigninPanel sp;
	public SigninFrame() {
		sp = new SigninPanel();
		
		
		setLayout(new BorderLayout());
		setSize(300,200);
		add(sp,BorderLayout.CENTER);
		setVisible(true);
	
	}
	
}
