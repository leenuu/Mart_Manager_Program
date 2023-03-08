package program.frontend;

import java.awt.EventQueue;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JButton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class frontEndMain {
	private ApplicationContext applicationContext = new GenericXmlApplicationContext("/penelContext.xml");
	private JFrame frame;
	private JButton Product_Btn;
	private JButton Sales_Btn;
	private JButton Stock_Btn;
	private JButton Purchase_Btn;
	private JButton Accounting_Btn;
	private JButton Statistics_Btn;
	private JButton Member_Btn;
	private Product_Pane ProductPenel;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					main window = new main();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	/**
	 * Create the application.
	 */
//	public frontEndMain() {
//		initialize();
//		Init_Component_Connection();
//	}
	public static void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frontEndMain window = new frontEndMain();
					window.initialize();
					window.Init_Component_Connection();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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

		ProductPenel = applicationContext.getBean("ProductPanel", program.frontend.Product_Pane.class);
		ProductPenel.setBounds(106, 6, 1174, 678);
		frame.getContentPane().add(ProductPenel);

	}

	private void Init_Component_Connection() {
		Init_Btn_Connection();
	}
	private void Init_Btn_Connection() {
		Product_Btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ProductPenel.setVisible(true);
        	}
		});
		Sales_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductPenel.setVisible(false);
			}
		});
	}

}
