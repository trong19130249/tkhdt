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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

public class AddCollect extends JFrame {
	private JLabel lbName = new JLabel("  Tên khách hàng: ");
	private JLabel lbMoney = new JLabel("  Số tiền: ");
	private JLabel lbDate = new JLabel("  Ngày thu: ");
	private JLabel lbPhone = new JLabel("  Số ĐT: ");
	private JLabel lbAddress = new JLabel("  Địa chỉ: ");
	private JLabel lbNote = new JLabel("  Ghi chú: ");

	private JComboBox jcbName = new JComboBox();
	private JTextField txtMoney = new JTextField();
	private JDateChooser dateCollect = new JDateChooser();
	private JTextField txtPhone = new JTextField();
	private JTextField txtAddress = new JTextField();
	private JTextField txtNote = new JTextField();
	

	private JPanel container1 = new JPanel();
	private JPanel container2 = new JPanel();
	private JButton btAdd = new JButton("Thêm vào");
	private JButton btCancel = new JButton("Hủy");

	private Border lineBorder = new LineBorder(new Color(0, 144, 255), 2);
	private Border lineBorder2 = new LineBorder(new Color(238, 238, 238), 10);

	public AddCollect() {
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(gridbag);

		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 0.9;
		c.gridwidth = GridBagConstraints.REMAINDER; // end row
		
		container1.setLayout(new GridLayout(6, 2, 8, 4));
		container1.add(lbName); container1.add(jcbName); 
		container1.add(lbMoney);container1.add(txtMoney); 
		container1.add(lbDate); container1.add(dateCollect);
		txtPhone.setEditable(false);
		container1.add(lbPhone); container1.add(txtPhone); 
		txtAddress.setEditable(false);
		container1.add(lbAddress); container1.add(txtAddress); 
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
		
		
		setTitle("Thêm phiếu thu nợ");
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
		AddCollect frame = new AddCollect();
		frame.setTitle("Thêm phiếu thu nợ");
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
