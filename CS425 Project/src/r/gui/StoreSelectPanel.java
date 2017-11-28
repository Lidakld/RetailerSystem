package r.gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class StoreSelectPanel extends JPanel {
	protected JRadioButton store1;
	protected JRadioButton store2;
	protected JRadioButton store3;
	protected JButton okbtn;
	protected ButtonGroup group;
	protected RequestListener requestListener;
	
	public StoreSelectPanel() {
		store1 = new JRadioButton("Store 1");
		store2 = new JRadioButton("Store 2");
		store3 = new JRadioButton("Store 3");
		okbtn = new JButton("OK");
		
		group = new ButtonGroup();
		
		group.add(store1);
		group.add(store2);
		group.add(store3);
		
		okbtn.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
			if(store1.isSelected()) {		
				RequestEvent re = new RequestEvent(this,1);
				if(requestListener!=null)
					requestListener.RequestEventOccured(re);		
			}else if(store2.isSelected()) {

				RequestEvent re = new RequestEvent(this,2);
				if(requestListener!=null)
					requestListener.RequestEventOccured(re);		
			}else if(store3.isSelected()) {
				RequestEvent re = new RequestEvent(this,3);
				if(requestListener!=null)
					requestListener.RequestEventOccured(re);		
			}else;
									
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
		gc.weighty = 0.5;

		gc.gridx = 0;
		gc.fill = GridBagConstraints.NONE;
		//gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(store1, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		gc.anchor = GridBagConstraints.LINE_START;
		add(store2, gc);
		
		gc.gridx = 2;
		gc.gridy = 0;
		gc.insets = new Insets(0, 0, 0, 0);
		//gc.anchor = GridBagConstraints.LINE_END;
		add(store3, gc);

		
		// //////////Next row ///////////////////////////////////

		gc.gridy++;

		gc.weightx = 1;
		gc.weighty = 0.1;

		gc.gridx = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(okbtn, gc);
	}
	public void setSSPListener(RequestListener listener) {
		this.requestListener = listener;
	}
}
