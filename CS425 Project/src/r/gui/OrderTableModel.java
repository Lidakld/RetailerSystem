package r.gui;

import javax.swing.table.AbstractTableModel;

import r.beans.Customer;
import r.beans.Stock;
import r.util.LinkedList;

public class OrderTableModel extends AbstractTableModel {
	protected LinkedList<Stock> db;
	protected String[] colNames = {"Stock id","Product Name","Product Price","Amount"};
	
	public OrderTableModel() {
		db = new LinkedList<Stock>();
	}
	
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
		return 4;
	}
	
	public void setData(LinkedList<Stock> db) {
		this.db = db;
	}
	@Override
	public Object getValueAt(int row, int col) {
		Stock stock = db.get(row);

		switch (col) {
		case 0:
			return stock.getStockid();
		case 1:
			return stock.getProduct().getProductName();
		case 2:
			return stock.getPrice();
		case 3:
			return stock.getRequantity();////change to amount which customer choose
		}
		return "Null";
	}

}
