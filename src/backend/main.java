package backend;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class main {
	
	private HashMap<String, HashMap<String, String>> Product_Data_Map = new HashMap<String, HashMap<String, String>>();
	private HashMap<String, String> Product_Code_Map = new HashMap<String, String>();
	private String[] Product_Data_Map_Innermap_Keys = {"바코드", "상품명", "규격", "분류", "거래처", "매입단가", "이익률", "10원이하", "판매단가", "재고량", "적정재고량", "반품불가", "환불불가", "19세미만금지"};
	
	public static void main(String[] args) {
		main M = new main();
		M.read("/Volumes/T7/workspace/Mart_Manager_Program/program_windowbuilder/program/src/testfile/test.csv", "euc-kr");
		for(String Key : M.Product_Data_Map_Innermap_Keys)
			System.out.println(M.Product_Data_Map.get("1").get(Key));
	}
	
	public void setUp() {

	}
	
	public void read(String path, String encoding) {
        BufferedReader br = null;
        String line;
        String cvsSplitBy = ",";
        int Fist_L = 0;

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path), encoding));
            while ((line = br.readLine()) != null) {
            	Fist_L++;
            	if(Fist_L == 1)
            		continue;
                String[] field = line.split(cvsSplitBy);
                HashMap<String, String> innerMap = new HashMap<String, String>();
                for(int i = 0; i < field.length; i++)
                	innerMap.put(Product_Data_Map_Innermap_Keys[i], field[i]);
                Product_Code_Map.put(innerMap.get("상품명"), innerMap.get("바코드"));
                Product_Data_Map.put(field[0],innerMap);
                
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
