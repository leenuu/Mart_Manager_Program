package frontend;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Product_Pane extends JPanel {
	
	public JPanel Product_P;
	private JPanel P_1;
	private JPanel P_2;
	private JPanel P_3;
	private JPanel P_4;
	
	private JTextField Search_Text;
	private JTable Search_Table;
	private JComboBox Search_Combo;
	private JButton Search_Btn;
	private JTextField P_Name_Text;
	private JTextField P_Code_Text;
	private JTextField P_Size_Text;
	private JTextField P_Classification_Text;
	private JTextField P_Account_Text;
	private JTextField P_Unit_Purchase_Price_Text;
	private JTextField P_Unit_Sales_Price_Text;
	private JTextField P_Profit_Text;
	private JTextField P_Stock_Text;
	private JTextField P_Proper_Stock_Text;

	/**
	 * Create the panel.
	 */
	public Product_Pane() {
		setLayout(null);
		
		Product_P = new JPanel();
		Product_P.setBounds(106, 6, 1174, 678);
		add(Product_P);
		Product_P.setLayout(null);
		
		Search_Table = new JTable();
		Search_Table.setBorder(new LineBorder(new Color(0, 0, 0)));
		Search_Table.setBounds(6, 346, 1162, 326);
		Product_P.add(Search_Table);
		
		P_1 = new JPanel();
		P_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		P_1.setBounds(6, 6, 390, 326);
		Product_P.add(P_1);
		P_1.setLayout(null);
		
		Search_Combo = new JComboBox();
		Search_Combo.setBounds(0, 0, 90, 55);
		P_1.add(Search_Combo);
		Search_Combo.addItem("바코드");
		Search_Combo.addItem("상품명");
		
		Search_Text = new JTextField();
		Search_Text.setBounds(88, 0, 220, 55);
		P_1.add(Search_Text);
		Search_Text.setColumns(10);
		
		Search_Btn = new JButton("검색");
		Search_Btn.setBounds(304, 0, 80, 55);
		P_1.add(Search_Btn);
		
		JLabel L_P_Name = new JLabel("상품명");
		L_P_Name.setBounds(0, 67, 60, 55);
		P_1.add(L_P_Name);
		L_P_Name.setHorizontalAlignment(SwingConstants.CENTER);
		
		P_Name_Text = new JTextField();
		P_Name_Text.setBounds(55, 67, 329, 55);
		P_1.add(P_Name_Text);
		P_Name_Text.setColumns(10);
		
		P_Code_Text = new JTextField();
		P_Code_Text.setBounds(55, 134, 329, 55);
		P_1.add(P_Code_Text);
		P_Code_Text.setColumns(10);
		
		P_Size_Text = new JTextField();
		P_Size_Text.setBounds(55, 201, 329, 55);
		P_1.add(P_Size_Text);
		P_Size_Text.setColumns(10);
		
		P_Classification_Text = new JTextField();
		P_Classification_Text.setBounds(55, 268, 329, 55);
		P_1.add(P_Classification_Text);
		P_Classification_Text.setColumns(10);
		
		JLabel L_P_Code = new JLabel("바코드");
		L_P_Code.setBounds(0, 134, 60, 55);
		P_1.add(L_P_Code);
		L_P_Code.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel L_P_Size = new JLabel("규격");
		L_P_Size.setBounds(0, 201, 60, 55);
		P_1.add(L_P_Size);
		L_P_Size.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel L_P_Classification = new JLabel("분류");
		L_P_Classification.setBounds(0, 268, 60, 55);
		P_1.add(L_P_Classification);
		L_P_Classification.setHorizontalAlignment(SwingConstants.CENTER);
		
		P_2 = new JPanel();
		P_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		P_2.setBounds(405, 6, 388, 328);
		Product_P.add(P_2);
		P_2.setLayout(null);
		
		JLabel L_P_Account = new JLabel("거래처");
		L_P_Account.setBounds(29, 0, 60, 55);
		P_2.add(L_P_Account);
		L_P_Account.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel L_P_UPP = new JLabel("매입 단가");
		L_P_UPP.setBounds(29, 69, 60, 55);
		P_2.add(L_P_UPP);
		L_P_UPP.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel L_P_Profit = new JLabel("이익률");
		L_P_Profit.setBounds(29, 136, 60, 55);
		P_2.add(L_P_Profit);
		L_P_Profit.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel L_P_USP = new JLabel("판매 단가");
		L_P_USP.setBounds(29, 203, 60, 55);
		P_2.add(L_P_USP);
		L_P_USP.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel L_P_Rounds = new JLabel("10원 이하 가격");
		L_P_Rounds.setBounds(192, 136, 100, 55);
		P_2.add(L_P_Rounds);
		L_P_Rounds.setHorizontalAlignment(SwingConstants.CENTER);
		
		JComboBox P_Rounds_Combo = new JComboBox();
		P_Rounds_Combo.setBounds(292, 137, 90, 55);
		P_2.add(P_Rounds_Combo);
		
		P_Account_Text = new JTextField();
		P_Account_Text.setBounds(89, 0, 293, 55);
		P_2.add(P_Account_Text);
		P_Account_Text.setColumns(10);
		
		P_Unit_Purchase_Price_Text = new JTextField();
		P_Unit_Purchase_Price_Text.setBounds(89, 67, 293, 55);
		P_Unit_Purchase_Price_Text.setColumns(10);
		P_2.add(P_Unit_Purchase_Price_Text);
		
		P_Unit_Sales_Price_Text = new JTextField();
		P_Unit_Sales_Price_Text.setBounds(89, 203, 293, 55);
		P_Unit_Sales_Price_Text.setColumns(10);
		P_2.add(P_Unit_Sales_Price_Text);
		
		P_Profit_Text = new JTextField();
		P_Profit_Text.setBounds(89, 136, 100, 55);
		P_Profit_Text.setColumns(10);
		P_2.add(P_Profit_Text);
		
		P_3 = new JPanel();
		P_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		P_3.setBounds(802, 6, 366, 212);
		Product_P.add(P_3);
		P_3.setLayout(null);
		
		JLabel L_P_Stock = new JLabel("재고량");
		L_P_Stock.setBounds(0, 0, 60, 55);
		P_3.add(L_P_Stock);
		L_P_Stock.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel L_P_Proper_Stock = new JLabel("적정 재고량");
		L_P_Proper_Stock.setBounds(0, 67, 70, 55);
		P_3.add(L_P_Proper_Stock);
		L_P_Proper_Stock.setHorizontalAlignment(SwingConstants.CENTER);
		
		JCheckBox P_Non_Refundable_Cheack = new JCheckBox("반품 불가");
		P_Non_Refundable_Cheack.setBounds(0, 134, 150, 27);
		P_3.add(P_Non_Refundable_Cheack);
		
		JCheckBox P_Non_Discount_Cheack = new JCheckBox("할인 불가");
		P_Non_Discount_Cheack.setBounds(0, 162, 150, 27);
		P_3.add(P_Non_Discount_Cheack);
		
		JCheckBox P_Under_NineTeen_Cheack = new JCheckBox("19세 미만 판매 금지");
		P_Under_NineTeen_Cheack.setBounds(162, 134, 150, 27);
		P_3.add(P_Under_NineTeen_Cheack);
		
		P_Stock_Text = new JTextField();
		P_Stock_Text.setColumns(10);
		P_Stock_Text.setBounds(67, 0, 293, 55);
		P_3.add(P_Stock_Text);
		
		P_Proper_Stock_Text = new JTextField();
		P_Proper_Stock_Text.setColumns(10);
		P_Proper_Stock_Text.setBounds(67, 67, 293, 55);
		P_3.add(P_Proper_Stock_Text);
		
		P_4 = new JPanel();
		P_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		P_4.setBounds(802, 221, 366, 113);
		Product_P.add(P_4);
		P_4.setLayout(null);
		
		JButton P_Change_Info_Btn = new JButton("정보 변경");
		P_Change_Info_Btn.setBounds(21, 29, 100, 55);
		P_4.add(P_Change_Info_Btn);
		
		JButton P_Save_Btn = new JButton("저장");
		P_Save_Btn.setBounds(133, 29, 100, 55);
		P_4.add(P_Save_Btn);
		
		JButton P_Cancel_Btn = new JButton("취소");
		P_Cancel_Btn.setBounds(243, 29, 100, 55);
		P_4.add(P_Cancel_Btn);

	}
	public void init_btn_connection() {
		Search_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked");
				if(Search_Combo.getSelectedItem().equals("바코드")) {
					System.out.println("바코드");
				}
				else if(Search_Combo.getSelectedItem().equals("상품명")) {
					System.out.println("상품명");
				}
	        }
		});
		
	}

}
