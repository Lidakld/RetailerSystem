package r.gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import r.beans.Stock;
import r.util.LinkedList;

public class StockTablePanel extends JPanel {
	private JTable table;
	private StockTableModel tableModel;
	private JScrollPane scrollPane;
	
	public StockTablePanel() {
		tableModel = new StockTableModel();
		table = new JTable(tableModel);
		scrollPane = new JScrollPane(table);
		
		setLayout(new BorderLayout());
		
		add(scrollPane,BorderLayout.CENTER);
	}
	
	public void setData(LinkedList<Stock> db) {
		tableModel.setData(db);
	}
	public void refresh() {
		tableModel.fireTableDataChanged();
	}
	
}
