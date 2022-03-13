package view4;

import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class MyTableModel extends DefaultTableModel {
	public MyTableModel() {
		
	}
	public MyTableModel(Object[][] data, Object[] columnNames) {
		super(data, columnNames);
	}

	public Class getColumnClass(int column) {
		return getValueAt(0, column).getClass();
	}

	public boolean isCellEditable(int row, int column) {
		Class columnClass = getColumnClass(column);
		return columnClass != ImageIcon.class && columnClass != Date.class
				&& columnClass != JButton.class;
	}

}
