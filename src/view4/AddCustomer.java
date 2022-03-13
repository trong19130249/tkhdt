package view4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class AddCustomer extends JFrame {
	private JLabel lbCode = new JLabel("  Mã khách hàng: ");
	private JLabel lbName = new JLabel("  Tên khách hàng: ");
	private JLabel lbPhone = new JLabel("  Số điện thoại: ");
	private JLabel lbAddress = new JLabel("  Địa chỉ: ");
	private JLabel lbDebt = new JLabel("  Số tiền nợ: ");
	private JLabel lbNote = new JLabel("  Ghi chú: ");

	private JTextField txtCode = new JTextField();
	private JTextField txtName = new JTextField();
	private JTextField txtPhone = new JTextField();
	private JTextField txtAddress = new JTextField();
	private JTextField txtDebt = new JTextField();
	private JTextField txtNote = new JTextField();
	
	private JPanel container1 = new JPanel();
	private JPanel container2 = new JPanel();
	private JButton btAdd = new JButton("Thêm vào");
	private JButton btCancel = new JButton("Hủy");
	
	private Border lineBorder = new LineBorder(new Color(0, 144, 255), 2);
	private Border lineBorder2 = new LineBorder(new Color(238,238,238), 10);

	public AddCustomer() {
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(gridbag);

		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 0.9;
		c.gridwidth = GridBagConstraints.REMAINDER; // end row
		
		container1.setLayout(new GridLayout(6, 2, 8, 4));
		container1.add(lbCode); container1.add(txtCode); 
		container1.add(lbName); container1.add(txtName); 
		container1.add(lbPhone); container1.add(txtPhone); 
		container1.add(lbAddress); container1.add(txtAddress); 
		container1.add(lbDebt); container1.add(txtDebt); 
		container1.add(lbNote); container1.add(txtNote); 
		gridbag.setConstraints(container1, c);
		add(container1);
		
		btAdd.setPreferredSize(new Dimension(90, 26));
		btCancel.setPreferredSize(new Dimension(90, 26));
		container2.setLayout(new FlowLayout(FlowLayout.CENTER, 24, 0));
		btAdd.setIcon(new ImageIcon("F:\\SwingIcon\\CheckIcon2.png"));
		btAdd.setBackground(Color.WHITE);
		btAdd.setBorder(lineBorder);
		
		btCancel.setIcon(new ImageIcon("F:\\SwingIcon\\CancelIcon.png"));
		btCancel.setBackground(Color.WHITE);
		btCancel.setBorder(lineBorder);
		container2.add(btAdd); container2.add(btCancel);
		container2.setBorder(lineBorder2);
		c.gridwidth = 1; // reset to the default
		c.gridheight = 1;
		c.weighty = 0.1;
		gridbag.setConstraints(container2, c);
		add(container2);
		
		
		setTitle("Thêm khách hàng");
		setSize(500, 300);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		btCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                dispose();
			}

		});
	}

	public static void main(String[] args) {
		AddCustomer frame = new AddCustomer();
		frame.setTitle("Thêm khách hàng");
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
