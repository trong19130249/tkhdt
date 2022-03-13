package view4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import com.toedter.calendar.JDateChooser;

public class MnCollectDebt extends JPanel {
	private JButton btnAdd = new JButton("Thêm ");
	private JButton btnFix = new JButton("Sửa ");
	private JButton btnDelete = new JButton("Xóa ");
	private Border lineBorder = new LineBorder(new Color(0, 144, 255), 2);
	private Border lineBorder2 = new LineBorder(new Color(238, 238, 238), 6);
	private Border lineBorder3 = new LineBorder(new Color(238, 238, 238), 8);

	private JLabel lbFilterTitle1 = new JLabel("Theo tên khách hàng");
	private JTextField jtfFilter = new JTextField();
	private JButton btFilter = new JButton(" Lọc ");
	private JButton btCancel = new JButton(" Hủy ");


	private JLabel lbFilterTitle2 = new JLabel("Theo ngày thu tiền");

	private JLabel lbSince = new JLabel("Từ ngày ");

	private JDateChooser chooseSince = new JDateChooser();

	private JLabel lbUntil = new JLabel("Đến ngày ");

	private JDateChooser chooseUntil = new JDateChooser();

	private JButton btFilterDate = new JButton(" Lọc ");
	private JButton btCancelDate = new JButton(" Hủy ");

	private JPanel panelBtns0 = new JPanel();
	private JPanel panelBtns1 = new JPanel();
	private JPanel panelBtns3 = new JPanel();

	private JPanel panelTable = new JPanel();
	private JPanel panelTableIn2 = new JPanel();
	private JPanel panelTableIn22 = new JPanel();
	private JPanel panelTableIn21 = new JPanel();

	private JPanel panelTableIn23 = new JPanel();
	private JPanel panelIn1 = new JPanel();

	private JPanel panelTableIn24 = new JPanel();
	private JPanel panelIn2 = new JPanel();
	private JPanel panelIn3 = new JPanel();

	private String[] columnNames;
	private Object[][] rowData;
	private JTable jTable;
	private MyTableModel tableModel;
	private JTableHeader header;
	private TableRowSorter<TableModel> sorter;

	private float[] columnWidthPercentage = { 0.03f, 0.22f, 0.1f, 0.1f, 0.12f, 0.18f, 0.1f, 0.1f };
	double rateWidthTable = 1.0;

	public MnCollectDebt(String[] columnNames, Object[][] rowData) {
		this.columnNames = columnNames;
		this.rowData = rowData;

		// bắt đầu set property cho button
		btnAdd.setIcon(new ImageIcon("F:\\SwingIcon\\Button-Add-icon.png"));
		btnAdd.setBackground(null);
		btnAdd.setBorder(lineBorder);

		btnFix.setIcon(new ImageIcon("F:\\SwingIcon\\SuaIcon.png"));
		btnFix.setBackground(null);
		btnFix.setBorder(lineBorder);

		btnDelete.setIcon(new ImageIcon("F:\\SwingIcon\\XoaIcon.png"));
		btnDelete.setBackground(null);
		btnDelete.setBorder(lineBorder);

		btFilter.setIcon(new ImageIcon("F:\\SwingIcon\\FilterIcon.png"));
		btFilter.setBackground(Color.WHITE);
		btFilter.setBorder(lineBorder);

		btCancel.setIcon(new ImageIcon("F:\\SwingIcon\\CancelIcon.png"));
		btCancel.setBackground(Color.WHITE);
		btCancel.setBorder(lineBorder);

		btFilterDate.setIcon(new ImageIcon("F:\\SwingIcon\\FilterIcon.png"));
		btFilterDate.setBackground(Color.WHITE);
		btFilterDate.setBorder(lineBorder);

		btCancelDate.setIcon(new ImageIcon("F:\\SwingIcon\\CancelIcon.png"));
		btCancelDate.setBackground(Color.WHITE);
		btCancelDate.setBorder(lineBorder);

		jtfFilter.setPreferredSize(new Dimension(200, 20));
		// kết thúc set property cho button

		// set layout cho bố cục tổng thể
		setLayout(new BorderLayout());

		// bắt đầu đặt các nút thêm, xóa, sửa và label dm hàng hóa
		panelBtns1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		panelBtns1.add(btnAdd);
		panelBtns1.add(btnFix);
		panelBtns1.add(btnDelete);
		panelBtns1.setBackground(Color.WHITE);

		panelBtns3.setLayout(new BorderLayout());
		panelBtns3.add(new JLabel("  Thao tác thu nợ"), BorderLayout.NORTH);
		panelBtns3.add(panelBtns0, BorderLayout.CENTER);
		panelBtns0.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		panelBtns0.add(panelBtns1);
		// kết thúc đặt các nút thêm, xóa, sửa và label dm hàng hóa
		add(panelBtns3, BorderLayout.NORTH);

		// bắt đầu thiết lập data, header, sorter và gọi lại resizeColumns() cho bảng
		tableModel = new MyTableModel(this.rowData, this.columnNames);
		jTable = new JTable(tableModel);


		header = jTable.getTableHeader();
		header.setReorderingAllowed(false);
		header.setBackground(new Color(0, 144, 218));
		header.setForeground(new Color(255, 255, 255));

		sorter = new TableRowSorter<TableModel>(jTable.getModel());
		jTable.setRowSorter(sorter);

		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		for (int x = 0; x < jTable.getColumnCount(); x++) {
			if ((jTable.getColumnModel().getColumn(x).getClass() != null && x != 0)) {
				jTable.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);
			} 
		}
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				resizeColumns();
			}
		});

		resizeColumns();
		// kết thúc thiết lập data, header, sorter và gọi lại resizeColumns() cho bảng

		// bắt đầu setlayout của panelTable thành gridbag và thêm các component vào
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		panelTable.setLayout(gridbag);
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 0.9;
		c.weighty = 1.0;
		JScrollPane crollpane = new JScrollPane(jTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		gridbag.setConstraints(crollpane, c);
		crollpane.setBorder(lineBorder);
		panelTable.add(crollpane);

		// bắt đầu thiết kế phần bên phải bảng
		panelTableIn2.setBorder(lineBorder);
		panelTableIn2.setLayout(new GridLayout(7, 1));

		panelTableIn22.setLayout(new GridLayout(2, 1));
		panelTableIn22.add(lbFilterTitle1);
		panelTableIn22.add(jtfFilter);
		panelTableIn22.setBorder(lineBorder3);
		panelTableIn22.setPreferredSize(new Dimension(90, 30));

		panelTableIn21.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
		panelTableIn21.add(btFilter);
		panelTableIn21.add(btCancel);

		panelTableIn2.add(panelTableIn22);
		panelTableIn2.add(panelTableIn21);

		panelIn1.setLayout(new BorderLayout());
		panelIn1.add(lbSince, BorderLayout.WEST);
		panelIn1.add(chooseSince, BorderLayout.CENTER);

		panelTableIn23.setLayout(new GridLayout(2, 1, 0, 4));
		panelTableIn23.add(lbFilterTitle2);
		panelTableIn23.add(panelIn1);
		panelTableIn23.setBorder(lineBorder3);
		panelTableIn23.setPreferredSize(new Dimension(90, 30));

		panelIn2.setLayout(new BorderLayout());
		panelIn2.add(lbUntil, BorderLayout.WEST);
		panelIn2.add(chooseUntil, BorderLayout.CENTER);

		panelIn3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
		panelIn3.add(btFilterDate);
		panelIn3.add(btCancelDate);

		panelTableIn24.setLayout(new GridLayout(2, 1, 0, 4));
		panelTableIn24.add(panelIn2);
		panelTableIn24.add(panelIn3);
		panelTableIn24.setBorder(lineBorder3);
		panelTableIn24.setPreferredSize(new Dimension(90, 30));

		panelTableIn2.add(panelTableIn23);
		panelTableIn2.add(panelTableIn24);
		// kết thúc thiết kế phần bên phải bảng

		c.gridwidth = GridBagConstraints.REMAINDER; // end row
		c.weightx = 0.1;
		gridbag.setConstraints(panelTableIn2, c);
		panelTable.add(panelTableIn2);

		panelTable.setBorder(lineBorder2);
		// kết thúc setlayout của panelTable thành gridbag và thêm các component vào
		add(panelTable);

		btFilter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = jtfFilter.getText();
				if (text.trim().length() == 0) {
					sorter.setRowFilter(null);
				} else {
					sorter.setRowFilter(RowFilter.regexFilter(text));
				}
			}
		});
		btCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = "";
				if (text.trim().length() == 0) {
					sorter.setRowFilter(null);
				} else {
					sorter.setRowFilter(RowFilter.regexFilter(text));
				}

			}

		});
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				new DetailAnOrder(new AnOrderData().getColumnNames(), new AnOrderData().getRowData());
				new AddCollect();
			}
		});

		btnFix.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FixCollect();
			}
		});

		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jTable.getSelectedRow() >= 0)
					tableModel.removeRow(jTable.getSelectedRow());
			}
		});

	}

	// thiết lập tỉ lệ của các cột trong bảng
	public void resizeColumns() {
		jTable.setRowHeight(24);
		int widthTable = jTable.getWidth();
		for (int i = 0; i < columnNames.length; i++) {
			jTable.getColumnModel().getColumn(i).setPreferredWidth(Math.round(columnWidthPercentage[i] * widthTable));
		}
	}
}
