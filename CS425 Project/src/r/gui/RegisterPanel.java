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
import javax.swing.JTextField;

public class RegisterPanel extends JPanel {
	private JLabel nameL;
	private JLabel emailL;
	private JLabel pwdL;
	private JLabel creditcL1;
	private JLabel creditcL2;
	private JLabel addressL;
	
	private JButton rbtn;
	
	private JTextField nameF;
	private JTextField emailF;
	private JTextField pwdF;
	private JTextField creditc1F;
	private JTextField creditc2F;
	private JTextField addressF;
	
	private RegisterListener registerListener;
	
	public RegisterPanel() {
		nameL = new JLabel("Name: ");
		emailL = new JLabel("Email: ");
		pwdL = new JLabel("Password: ");
		creditcL1 = new JLabel("CreditCard Number 1: ");
		creditcL2 = new JLabel("CreditCard Number 2: ");
		addressL = new JLabel("Address：");
		
		rbtn = new JButton("Register");
		
		nameF = new JTextField(10);
		emailF = new JTextField(15);
		pwdF = new JTextField(15);
		creditc1F = new JTextField(15);
		creditc2F = new JTextField(15);
		addressF = new JTextField(15);
		
		nameL.setLabelFor(nameF);
		emailL.setLabelFor(emailF);
		creditcL1.setLabelFor(creditc1F);
		creditcL2.setLabelFor(creditc2F);
		addressL.setLabelFor(addressF);
		
		rbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameF.getText();
				String email = emailF.getText();
				String pwd = pwdF.getText();
				String credit1 = creditc1F.getText();
				String credit2 = creditc2F.getText();
				String address = addressF.getText();
				
				
				RegisterEvent re = new RegisterEvent(this,name,email,pwd,credit1,credit2,address);
				if(registerListener!=null)
					registerListener.RegisterEventOccured(re);
			}
			
		});
		setLayout(new BorderLayout());
		setSize(500,400);
		
		layoutComponents();
		
	}
	public void layoutComponents() {

		setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();

		// ////////// First row ///////////////////////////////////

		gc.gridy = 0;

		gc.weightx = 1;
		gc.weighty = 0.5;

		gc.gridx = 0;
		gc.fill = GridBagConstraints.NONE;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(nameL, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(nameF, gc);

		// //////////Second row ///////////////////////////////////

		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 0.5;

		gc.gridx = 0;
		gc.insets = new Insets(0, 0, 0, 5);
		gc.anchor = GridBagConstraints.LINE_END;
		add(emailL, gc);

		gc.gridx = 1;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(emailF, gc);
		// //////////Next row ///////////////////////////////////

				gc.gridy++;

				gc.weightx = 1;
				gc.weighty = 0.5;

				gc.gridx = 0;
				gc.insets = new Insets(0, 0, 0, 5);
				gc.anchor = GridBagConstraints.FIRST_LINE_END;
				add(pwdL, gc);

				gc.gridx = 1;
				gc.anchor = GridBagConstraints.FIRST_LINE_START;
				gc.insets = new Insets(0, 0, 0, 0);
				add(pwdF, gc);


		// //////////Next row ///////////////////////////////////

		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 0.5;

		gc.gridx = 0;
		gc.insets = new Insets(0, 0, 0, 5);
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		add(creditcL1, gc);

		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(creditc1F, gc);

		// //////////Next row ///////////////////////////////////

		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 0.5;

		gc.gridx = 0;
		gc.insets = new Insets(0, 0, 0, 5);
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		add(creditcL2, gc);

		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(creditc2F, gc);

		// //////////Next row ///////////////////////////////////

		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 0.5;

		gc.gridx = 0;
		gc.insets = new Insets(0, 0, 0, 5);
		gc.anchor = GridBagConstraints.FIRST_LINE_END;
		add(addressL, gc);

		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(addressF, gc);
		// //////////Next row ///////////////////////////////////

		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 1.0;

		gc.gridx = 1;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(rbtn, gc);
	}
	public void setRegisterListener(RegisterListener listener) {
		this.registerListener = listener;
	}
}
