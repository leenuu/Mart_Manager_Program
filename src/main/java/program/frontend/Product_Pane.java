package program.frontend;

import program.backend.Product_DAO;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import program.backend.*;
public class Product_Pane extends JPanel {
	private Product_DAO productDao;
	public void setProductDao(Product_DAO productDao) {
		this.productDao = productDao;
	}
	private String Header[];
	private DefaultTableModel model;

	private JPanel P_1;
	private JPanel P_2;
	private JPanel P_3;
	private JPanel P_4;
	
	private JTextField Search_Text;
	private JTable Search_Table;
	private JScrollPane Search_Table_Scroll;
	private JComboBox Search_Combo;
	private JComboBox P_Rounds_Combo;
	private JButton Search_Btn;
	private JTextField P_Name_Text;
	private JTextField P_Code_Text;
	private JTextField P_Size_Text;
	private JTextField P_Classification_Text;
	private JTextField P_Soruce_Text;
	private JTextField P_Unit_Purchase_Price_Text;
	private JTextField P_Unit_Sales_Price_Text;
	private JTextField P_Profit_Text;
	private JTextField P_Stock_Text;
	private JTextField P_Proper_Stock_Text;

	private JCheckBox P_Non_Refundable_Cheack;
	private JCheckBox P_Non_Discount_Cheack;
	private JCheckBox P_Under_NineTeen_Cheack;

	private List<Product> productsList;

	/**
	 * Create the panel.
	 */
	public Product_Pane() {
		this.setBounds(106, 6, 1174, 678);
		this.setLayout(null);

		Header = new String[] {"바코드", "상품명", "분류", "유통사", "재고", "매입가", "판매가"};
		model = new DefaultTableModel(Header,0);
		Search_Table = new JTable(model) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		Search_Table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
//		Contents = new String[][] {};
//		Search_Table = new JTable(Contents, Header);
		Search_Table_Scroll = new JScrollPane(Search_Table);
		Search_Table.setBorder(new LineBorder(new Color(0, 0, 0)));
		Search_Table.setBounds(6, 346, 1162, 326);
		Search_Table_Scroll.setBounds(6, 346, 1162, 326);
		this.add(Search_Table_Scroll);

		P_1 = new JPanel();
		P_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		P_1.setBounds(6, 6, 390, 326);
		this.add(P_1);
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
		this.add(P_2);
		P_2.setLayout(null);

		JLabel L_P_Soruce = new JLabel("거래처");
		L_P_Soruce.setBounds(29, 0, 60, 55);
		P_2.add(L_P_Soruce);
		L_P_Soruce.setHorizontalAlignment(SwingConstants.CENTER);

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

		P_Rounds_Combo = new JComboBox();
		P_Rounds_Combo.addItem("올림");
		P_Rounds_Combo.addItem("반올림");
		P_Rounds_Combo.addItem("버림");
		P_Rounds_Combo.setBounds(292, 137, 90, 55);
		P_2.add(P_Rounds_Combo);

		P_Soruce_Text = new JTextField();
		P_Soruce_Text.setBounds(89, 0, 293, 55);
		P_2.add(P_Soruce_Text);
		P_Soruce_Text.setColumns(10);

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
		this.add(P_3);
		P_3.setLayout(null);

		JLabel L_P_Stock = new JLabel("재고량");
		L_P_Stock.setBounds(0, 0, 60, 55);
		P_3.add(L_P_Stock);
		L_P_Stock.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel L_P_Proper_Stock = new JLabel("적정 재고량");
		L_P_Proper_Stock.setBounds(0, 67, 70, 55);
		P_3.add(L_P_Proper_Stock);
		L_P_Proper_Stock.setHorizontalAlignment(SwingConstants.CENTER);

		P_Non_Refundable_Cheack = new JCheckBox("반품 불가");
		P_Non_Refundable_Cheack.setBounds(0, 134, 150, 27);
		P_3.add(P_Non_Refundable_Cheack);

		P_Non_Discount_Cheack = new JCheckBox("할인 불가");
		P_Non_Discount_Cheack.setBounds(0, 162, 150, 27);
		P_3.add(P_Non_Discount_Cheack);

		P_Under_NineTeen_Cheack = new JCheckBox("19세 미만 판매 금지");
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
		this.add(P_4);
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

		Init_Component_Connection();
	}
	private void Init_Component_Connection() {
		Init_Btn_Connection();
		Init_Table_Connection();
	}
	private void Init_Btn_Connection() {
		Search_Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked");
				Search_Product((String)Search_Combo.getSelectedItem(), Search_Text.getText());
	        }
		});

	}
	private void Init_Table_Connection() {
		Search_Table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getClickCount() == 2)
					{
//						System.out.println(Search_Table.getValueAt(Search_Table.getSelectedRow(), 0).toString());
						Product P = productsList.get(Search_Table.getSelectedRow());
//						System.out.println(P.get_code());
						Set_Text(P);
					}
				}
			}
		);
	}
	private void Set_Text(Product P) {
		P_Name_Text.setText(P.get_name());
		P_Code_Text.setText(P.get_code());
		P_Size_Text.setText(P.get_size());
		P_Classification_Text.setText(P.get_classification());
		P_Soruce_Text.setText(P.get_source());
		P_Unit_Purchase_Price_Text.setText(Float.toString(P.get_UPP()));
		P_Unit_Sales_Price_Text.setText(Float.toString(P.get_UPP()));
		P_Profit_Text.setText(Float.toString(P.get_profit()));
		P_Stock_Text.setText(Integer.toString(P.get_stock()));
		P_Proper_Stock_Text.setText(Integer.toString(P.get_PS()));

		P_Non_Refundable_Cheack.setSelected(P.get_NR());
		P_Non_Discount_Cheack.setSelected(P.get_ND());
		P_Under_NineTeen_Cheack.setSelected(P.get_UN());

		if(P.get_Rounds().equals("Up"))
			P_Rounds_Combo.setSelectedIndex(0);
		else if(P.get_Rounds().equals("Rounds"))
			P_Rounds_Combo.setSelectedIndex(1);
		else if(P.get_Rounds().equals("Down"))
			P_Rounds_Combo.setSelectedIndex(2);
	}
	private void Search_Product(String Combo, String search_text) {
		DefaultTableModel model=(DefaultTableModel)Search_Table.getModel();
		model.setNumRows(0);
		if(Combo.equals("바코드"))
			productsList = productDao.get_Products_By_Code(search_text);
		else if(Combo.equals("상품명"))
			productsList = productDao.get_Products_By_Name(search_text);

//		System.out.println(productsList.size());
//		System.out.println(productDao.get_Products_By_Name(search_text).get(0).get_code());
//		System.out.println(productDao.get_Product_By_Name(search_text).get_code());

		for(Product P : productsList) {
			String[] row = {P.get_code(), P.get_name(), P.get_classification(), P.get_source(), Integer.toString(P.get_stock()), Float.toString(P.get_UPP()), Float.toString(P.get_USP())};
			System.out.print(row);
			model.addRow(row);
		}

//		String test[] = {"0", "1", "2", "3", "4", "5", "6", "7"};

//		model.addRow(test);
	}

}
