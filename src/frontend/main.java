package frontend;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class main {

	private JFrame frame;
	private JButton Product_Btn;
	private JButton Sales_Btn;
	private JButton Stock_Btn;
	private JButton Purchase_Btn;
	private JButton Accounting_Btn;
	private JButton Statistics_Btn;
	private JButton Member_Btn;
	
	
	private JPanel Product_P;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(1281, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Product_Btn = new JButton("상품");
		Product_Btn.setBounds(6, 6, 88, 88);
		frame.getContentPane().add(Product_Btn);
		
		Sales_Btn = new JButton("매출");
		Sales_Btn.setBounds(6, 206, 88, 88);
		frame.getContentPane().add(Sales_Btn);
		
		Stock_Btn = new JButton("재고");
		Stock_Btn.setBounds(6, 106, 88, 88);
		frame.getContentPane().add(Stock_Btn);
		
		Purchase_Btn = new JButton("매입");
		Purchase_Btn.setBounds(6, 306, 88, 88);
		frame.getContentPane().add(Purchase_Btn);
		
		Accounting_Btn = new JButton("회계");
		Accounting_Btn.setBounds(6, 406, 88, 88);
		frame.getContentPane().add(Accounting_Btn);
		
		Statistics_Btn = new JButton("통계");
		Statistics_Btn.setBounds(6, 506, 88, 88);
		frame.getContentPane().add(Statistics_Btn);
		
		Member_Btn = new JButton("회원");
		Member_Btn.setBounds(6, 606, 88, 88);
		frame.getContentPane().add(Member_Btn);
		
		Product_P = new Product_Pane().Product_P;
		Product_P.setBounds(106, 6, 1174, 678);
		frame.getContentPane().add(Product_P);
		
		Init_Btn_Connection();
		

	}
	
	public void Init_Btn_Connection() {
		Product_Btn.addActionListener(new ActionListener(){	      
		public void actionPerformed(ActionEvent e) {
			Product_P.setVisible(false);
        	}
		});
	}
}
