package r.gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SigninPanel extends JPanel {
	private JLabel accountL;
	private JLabel passwordL;
	
	private JButton sbtn;
	
	private JTextField accountF;
	private JPasswordField passwordF;
	
	private SigninListener slistener;
	
	public SigninPanel() {
		accountL = new JLabel("Account: ");
		passwordL = new JLabel("Password: ");
		
		sbtn = new JButton("Sign In");
		
		accountF = new JTextField(10);
		passwordF = new JPasswordField(10);
		
		accountL.setLabelFor(accountF);
		passwordL.setLabelFor(passwordF);
		
		sbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String account =  accountF.getText();
				String password = passwordF.getText();
			SigninEvent se = new SigninEvent(this,account,password);
			if(slistener!=null)
				slistener.SigninEventOccured(se);
			
			}
			
		});
		
		setLayout(new BorderLayout());
		setSize(300,200);
		
		layoutComponents();
		
	}
	public void layoutComponents() {

		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		// ////////// First row ///////////////////////////////////

		gc.gridy = 0;

		gc.weightx = 1;
		gc.weighty = 0.2;

		gc.gridx = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(accountL, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(accountF, gc);

		// //////////Second row ///////////////////////////////////

		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 0.2;

		gc.gridx = 0;
		gc.insets = new Insets(0, 0, 0, 5);
		gc.anchor = GridBagConstraints.LINE_END;
		add(passwordL, gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(passwordF, gc);
		
		// //////////Next row ///////////////////////////////////

				gc.gridy++;

				gc.weightx = 1;
				gc.weighty = 0.2;

				gc.gridx = 1;
				gc.anchor = GridBagConstraints.FIRST_LINE_START;
				gc.insets = new Insets(0, 0, 0, 0);
				add(sbtn, gc);
	}
	public void setSigninListener(SigninListener listener) {
		this.slistener = listener;
	}
}
