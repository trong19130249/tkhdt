package view4;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import model2.CollectDebtData;
import model2.CustomerData;
import model2.OrdersData;
import model2.PayDebtData;
import model2.ProductsData;
import model2.PurchasesData;
import model2.StaffData;
import model2.SupplierData;

public class Demo extends JFrame {
	private JMenuBar menuBar = new JMenuBar();
	private JMenu mnHome = new JMenu("Trang chủ");

	private JMenu mnCate = new JMenu("Danh mục");
	private JMenuItem cateProduct = new JMenuItem("Danh mục hàng hóa");
	private JMenuItem cateCustomer = new JMenuItem("Danh mục khách hàng");
	private JMenuItem cateSupplier = new JMenuItem("Danh mục nhà cung cấp");
	private JMenuItem cateStaff = new JMenuItem("Danh mục nhân viên");
	
	private JMenu mnActivites = new JMenu("Thao tác");
	private JMenuItem actSales = new JMenuItem("Thao tác bán hàng");
	private JMenuItem actPurchase = new JMenuItem("Thao tác nhập hàng");
	private JMenuItem actCollectD = new JMenuItem("Thao tác thu nợ");
	private JMenuItem actPayDebt = new JMenuItem("Thao tác trả nợ");
	
	private JMenu mnAccount = new JMenu("Tài khoản");

	private CardLayout cardLayout = new CardLayout();
	private JPanel mainPanel = new JPanel(cardLayout);

	private Home homePage = new Home();
	private MnProduct mnProduct = new MnProduct(new ProductsData().getColumnNames(), new ProductsData().getRowData());
	private MnCustomer mnCustomer = new MnCustomer(new CustomerData().getColumnNames(), new CustomerData().getRowData());
	private MnSupplier mnSupplier = new MnSupplier(new SupplierData().getColumnNames(), new SupplierData().getRowData());
	private MnStaff mnStaff = new MnStaff(new StaffData().getColumnNames(), new StaffData().getRowData());
	private OrdersData ordersData = new OrdersData();
	private MnOrders mnOrders = new MnOrders(ordersData.getColumnNames(), ordersData.getRowData());
	private CollectDebtData collectDData = new CollectDebtData();
	private MnCollectDebt mnCollectD = new MnCollectDebt(collectDData.getColumnNames(), collectDData.getRowData());
	private PurchasesData purchasesData = new PurchasesData();
	private MnPurchases mnPurchases = new MnPurchases(purchasesData.getColumnNames(), purchasesData.getRowData());
	private PayDebtData payDebtData = new PayDebtData();
	private MnPayDebt mnPayDebt = new MnPayDebt(payDebtData.getColumnNames(), payDebtData.getRowData());
	public Demo() {
		menuBar.add(mnHome);

		menuBar.add(mnCate);
		mnCate.add(cateProduct);
		mnCate.add(cateStaff);
		mnCate.add(cateCustomer);
		mnCate.add(cateSupplier);
		
		menuBar.add(mnActivites);
		mnActivites.add(actSales);
		mnActivites.add(actPurchase);
		mnActivites.add(actCollectD);
		mnActivites.add(actPayDebt);
		
		menuBar.add(mnAccount);
		// thiết lập thanh menu
		setJMenuBar(menuBar);

		mnHome.addMenuListener(new MenuListener() {
			@Override
			public void menuSelected(MenuEvent e) {
				cardLayout.show(mainPanel, "Trang chủ");

			}

			@Override
			public void menuDeselected(MenuEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void menuCanceled(MenuEvent e) {
				// TODO Auto-generated method stub

			}
		});
		cateProduct.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Danh mục hàng hóa");
			}
		});
		cateStaff.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Danh mục nhân viên");
			}
		});
		cateCustomer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Danh mục khách hàng");
			}
		});
		cateSupplier.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Danh mục nhà cung cấp");
			}
		});
		actSales.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Thao tác bán hàng");
			}
		});
		actPurchase.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Thao tác nhập hàng");
			}
		});
		actCollectD.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Thao tác thu nợ");
			}
		});
		actPayDebt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Thao tác trả nợ");
			}
		});
		mainPanel.add(homePage, "Trang chủ");
		mainPanel.add(mnProduct, "Danh mục hàng hóa");
		mainPanel.add(mnStaff, "Danh mục nhân viên");
		mainPanel.add(mnCustomer, "Danh mục khách hàng");
		mainPanel.add(mnSupplier, "Danh mục nhà cung cấp");
		mainPanel.add(mnOrders, "Thao tác bán hàng");
		mainPanel.add(mnPurchases, "Thao tác nhập hàng");
		mainPanel.add(mnCollectD, "Thao tác thu nợ");
		mainPanel.add(mnPayDebt, "Thao tác trả nợ");
		
		add(mainPanel);

	}

	public static void main(String[] args) {
		Demo frame = new Demo();
		frame.setTitle("Ứng dụng quản lí vật liệu xây dựng");
		frame.setSize(880, 580);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
