package backend;

public class product_Info {
	
	String name;
	String code;
	String size;
	String classification;
	String source;
	float UPP; // Unit_Purchase_Price
	float USP; // Unit_Sales_Price
	float profit;
	int stock;
	int PS; // Proper_Stock
	boolean NR; // Non_Refundable
	boolean ND; // Non_Discount
	boolean UN; // Under_NineTeen
	
	public product_Info() {
		
	}
	
	public product_Info(String name, String code, String size, String classification, String source, float UPP, float USP, float profit, int stock, int PS, boolean NR, boolean ND, boolean UN) {
		this.name = name;
		this.code = code;
		this.size = size;
		this.classification = classification;
		this.source = source;
		this.UPP = UPP;
		this.USP = USP;
		this.profit = profit;
		this.stock = stock;
		this.PS = PS;
		this.NR = NR;
		this.ND = ND;
		this.UN = UN;
	}
	
	public String get_name() {
		return this.name;
	}
	
	public String get_code() {
		return this.code;
	}
	
	public String get_size() {
		return this.size;
	}
	
	public String get_classification() {
		return this.classification;
	}
	
	public String get_source() {
		return this.source;
	}
	
	public float get_UPP() {
		return this.UPP;
	}
	
	public float get_USP() {
		return this.USP;
	}
	
	public float get_profit() {
		return this.profit;
	}
	
	public int get_stock() {
		return this.stock;
	}
	
	public int get_PS() {
		return this.PS;
	}
	
	public boolean get_NR() {
		return this.NR;
	}
	
	public boolean get_ND() {
		return this.ND;
	}
	
	public boolean get_UN() {
		return this.UN;
	}
	
	public void set_name(String name) {
		this.name = name;
	}
	
	public void set_code(String code) {
		this.code = code;
	}
	
	public void set_size(String size) {
		this.size = size;
	}
	
	public void set_classification(String classification) {
		this.classification = classification;
	}
	
	public void set_source(String source) {
		this.source = source;
	}
	
	public void set_UPP(float UPP) {
		this.UPP = UPP;
	}
	
	public void set_USP(float USP) {
		this.USP = USP;
	}
	
	public void set_profit(float profit) {
		this.profit = profit;
	}
	
	public void set_stock(int stock) {
		this.stock = stock;
	}
	
	public void set_PS(int PS) {
		this.PS = PS;
	}
	
	public void set_NR(boolean NR) {
		this.NR = NR;
	}
	
	public void set_ND(boolean ND) {
		this.ND = ND;
	}
	
	public void set_UN(boolean UN) {
		this.UN = UN;
	}
	
}

