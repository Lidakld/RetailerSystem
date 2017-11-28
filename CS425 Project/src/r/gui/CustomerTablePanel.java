package r.gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import r.beans.Customer;
import r.util.LinkedList;

public class CustomerTablePanel extends JPanel {
	private JTable table;
	private CustomerTableModel tableModel;
	private JScrollPane scrollPane;
	
	public CustomerTablePanel() {
		tableModel = new CustomerTableModel();
		table = new JTable(tableModel);
		scrollPane = new JScrollPane(table);
		
		setLayout(new BorderLayout());
		
		add(scrollPane,BorderLayout.CENTER);
	}
	
	public void setData(LinkedList<Customer> db) {
		tableModel.setData(db);
	}
	
	public void refresh() {
		tableModel.fireTableDataChanged();
	}
}
