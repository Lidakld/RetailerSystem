package r.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import r.beans.Stock;
import r.util.LinkedList;

public class OrderTablePanel extends JPanel {
	private JTable table;
	private OrderTableModel tableModel;
	private JScrollPane scrollPane;
	private JButton checkoutbtn;
	
	public OrderTablePanel() {
		tableModel = new OrderTableModel();
		table = new JTable(tableModel);
		scrollPane = new JScrollPane(table);
		checkoutbtn = new JButton("Check Out");
		
		setLayout(new BorderLayout());
		
		add(scrollPane, BorderLayout.CENTER);
		add(checkoutbtn,BorderLayout.SOUTH);
	}
	
	public void setData(LinkedList<Stock> db) {
	
		tableModel.setData(db);
	}
	public void refresh() {
		tableModel.fireTableDataChanged();
	}
}
