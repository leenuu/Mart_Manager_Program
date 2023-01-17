package backend;

import java.util.HashMap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class product_DAO {
	
	private Connection C;
	private String url = "jdbc:mysql://localhost:3306/";
	private String dbName = "testDB";
	private String ID = "root";
	private String PW = "test";
	
	public void add(product P) {
		
	}
	
	public void update() {
		
	}
	
	 
	public HashMap<String, product> get_all_P() {
		HashMap<String, product> all_P = new HashMap<String, product>();
		
		return all_P;
	}
	
}
