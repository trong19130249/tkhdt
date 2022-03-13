package view4;

import com.toedter.calendar.JDateChooser;
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


public class AddAnOrder extends JFrame {
	private JLabel lbCode = new JLabel("  Mã đơn hàng: ");
	private JLabel lbName = new JLabel("  Tên khách hàng: ");
	private JLabel lbPhone = new JLabel("  Số ĐT: ");
	private JLabel lbDeliverTo = new JLabel("  Địa chỉ giao hàng: ");
	private JLabel lbDateSet = new JLabel("  Ngày lập: ");
	private JLabel lbDateDeliver = new JLabel("  Ngày giao: ");

	private JTextField txtCode = new JTextField();
	private JComboBox jcbName = new JComboBox();
	private JTextField txtPhone = new JTextField();
	private JTextField txtDeliverTo = new JTextField();
	private JDateChooser dateSet = new JDateChooser();
	private JDateChooser dateDeliver = new JDateChooser();
	
	private JPanel container1 = new JPanel();
	private JPanel container2 = new JPanel();
	private JButton btAdd = new JButton("Thêm vào");
	private JButton btCancel = new JButton("Hủy");
	
	private Border lineBorder = new LineBorder(new Color(0, 144, 255), 2);
	private Border lineBorder2 = new LineBorder(new Color(238,238,238), 10);

	public AddAnOrder() {
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(gridbag);

		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 0.9;
		c.gridwidth = GridBagConstraints.REMAINDER; // end row
		
		container1.setLayout(new GridLayout(6, 2, 8, 4));
		container1.add(lbCode); container1.add(txtCode); 
		container1.add(lbName); container1.add(jcbName); 
		txtPhone.setEditable(false);
		container1.add(lbPhone); container1.add(txtPhone); 
		container1.add(lbDeliverTo);container1.add(txtDeliverTo); 
		container1.add(lbDateSet); container1.add(dateSet); 
		container1.add(lbDateDeliver); container1.add(dateDeliver); 

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
		
		
		setTitle("Thêm đơn hàng");
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
		AddAnOrder frame = new AddAnOrder();
		frame.setTitle("Thêm đơn hàng");
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
