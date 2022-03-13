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

public class AddAnDetailOrder extends JFrame {
	private JLabel lbCode = new JLabel("  Mã hàng hóa: ");
	private JLabel lbName = new JLabel("  Tên hàng hóa: ");
	private JLabel lbUnit = new JLabel("  DVT: ");
	private JLabel lbSell = new JLabel("  Giá bán: ");
	private JLabel lbAmount = new JLabel("  Số lượng: ");
	private JLabel lbCate = new JLabel("  Loại hàng hóa: ");
	private JLabel lbPromotion = new JLabel("  Tiền KM: ");
	

	private JComboBox jcbCode = new JComboBox();
	private JComboBox jcbName = new JComboBox();
	private JTextField txtUnit = new JTextField();
	private JTextField txtSell = new JTextField();
	private JTextField txtAmount = new JTextField();
	private JTextField txtCate = new JTextField();
	private JTextField txtPromotion = new JTextField();
	
	private JPanel container1 = new JPanel();
	private JPanel container2 = new JPanel();
	private JButton btAdd = new JButton("Thêm vào");
	private JButton btCancel = new JButton("Hủy");
	
	private Border lineBorder = new LineBorder(new Color(0, 144, 255), 2);
	private Border lineBorder2 = new LineBorder(new Color(238,238,238), 10);

	public AddAnDetailOrder() {
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(gridbag);

		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0;
		c.weighty = 0.9;
		c.gridwidth = GridBagConstraints.REMAINDER; // end row
		
		container1.setLayout(new GridLayout(7, 2, 8, 4));
		container1.add(lbCode); container1.add(jcbCode); 
		container1.add(lbName); container1.add(jcbName);
		txtUnit.setEditable(false);
		container1.add(lbUnit); container1.add(txtUnit);
		txtSell.setEditable(false);
		container1.add(lbSell); container1.add(txtSell); 
		container1.add(lbAmount); container1.add(txtAmount); 
		txtCate.setEditable(false);
		container1.add(lbCate); container1.add(txtCate); 
		container1.add(lbPromotion); container1.add(txtPromotion);
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
		
		
		setTitle("Thêm hàng hóa vào chi tiết hàng hóa để bán");
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
		AddAnDetailOrder frame = new AddAnDetailOrder();
		frame.setTitle("Thêm hàng hóa vào chi tiết hàng hóa để bán");
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
