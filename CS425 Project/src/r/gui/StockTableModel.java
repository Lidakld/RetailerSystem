package r.gui;

import javax.swing.table.AbstractTableModel;

import r.beans.Customer;
import r.beans.Stock;
import r.util.LinkedList;

public class StockTableModel extends AbstractTableModel {

	protected LinkedList<Stock> db;
	protected String[] colNames = {"Stock id","Product UPC","Product Brand","Product Remain","Product Capacity",
			"Product ReorderTime","Product Reorder Quantity"};
	
	public StockTableModel() {
		db = new LinkedList<Stock>();
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
			return stock.getProduct().getUpc();
		case 2:
			return stock.getProduct().getBrand().getBrandName();
		case 3:
			return stock.getRemain();
		case 4:
			return stock.getCapacity();
		case 5:
			return stock.getReordertime();
		case 6:
			return stock.getRequantity();

		}
		return "Null";
	}

}
