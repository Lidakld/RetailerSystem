package r.gui;

import javax.swing.table.AbstractTableModel;
import r.beans.Customer;
import r.util.LinkedList;

public class CustomerTableModel extends AbstractTableModel {
	private LinkedList<Customer> db;
	private String[] colNames = {"Customer Name","Account Id","Password","Email","CreditCard1","CreditCard2","Address"};
	
	public CustomerTableModel() {
		db = new LinkedList<Customer>();
	};
	
	@Override
	public String getColumnName(int column) {
		return colNames[column];
	}
	@Override
	public int getRowCount() {
		return db.size();
	}

	@Override
	public int getColumnCount() {
		return 7;
	}
	
	public void setData(LinkedList<Customer> db) {
		this.db = db;
	}

	@Override
	public Object getValueAt(int row, int col) {
		Customer customer = db.get(row);

		switch (col) {
		case 0:
			return customer.getName();
		case 1:
			return customer.getAccountid().getAccount();
		case 2:
			return customer.getAccountid().getPwd();		
		case 3:
			return customer.getEmail();
		case 4:
			return customer.getCreditCard().getCcn1();
		case 5:
			return customer.getCreditCard().getCcn2();
		case 6:
			return customer.getCreditCard().getAddress();

		}
		return "Null";
	}

}
