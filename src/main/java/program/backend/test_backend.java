package program.backend;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.sql.SQLException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/productDaoContext.xml")
public class test_backend {
	@Autowired
	private Product_DAO productDao;
	HashMap<String, Product> P_Info = new HashMap<String, Product>();
	private HashMap<String, String> P_Name_Code = new HashMap<String, String>();

	private Product pro1;
	private Product pro2;
	private Product pro3;

	@Before
	public void set_Up() {
		this.pro1 = new Product("test1", "1", "10g", "test classification", "test", 1000, 0, 0.5f, 100, 100, true, false, false, "Rounds");
		this.pro2 = new Product("test2", "2", "20g", "test classification", "test", 1000, 0, 0.6f, 50, 100, true, false, true, "Up");
		this.pro3 = new Product("test3", "3", "30g", "test classification", "test", 1000, 0, 0.7f, 120, 100, true, true, false, "Down");
	}
	@Test
	public void test() {
		System.out.println("hello ");
		assertThat(3, is(3));
	}
	@Test
	public void product_Test()  throws SQLException {
		productDao.reset();
		productDao.add(pro1);
		productDao.add(pro2);
		productDao.add(pro3);

		List<Product> proList = productDao.get_All();
		Check_Same_Product(proList.get(0), pro1);
		Check_Same_Product(proList.get(1), pro2);
		Check_Same_Product(proList.get(2), pro3);
	}
	@Test
	public void Product_Get_By_Name() throws SQLException {
		productDao.reset();
		productDao.add(pro1);
		productDao.add(pro2);
		productDao.add(pro3);

		Product P1 = productDao.get_Product_By_Name(pro1.get_name());
		Check_Same_Product(pro1, P1);
	}
	@Test
	public void Product_Get_By_Names() throws SQLException {
		productDao.reset();
		productDao.add(pro1);
		productDao.add(pro2);
		productDao.add(pro3);

		List<Product> proList = productDao.get_Products_By_Name("te");
		Check_Same_Product(proList.get(0), pro1);
		Check_Same_Product(proList.get(1), pro2);
		Check_Same_Product(proList.get(2), pro3);
	}
	@Test
	public void Product_Get_By_Code() throws SQLException {
		productDao.reset();
		productDao.add(pro1);


		Product P1 = productDao.get_Product_By_Code("1");
		Check_Same_Product(P1, pro1);
	}
	@Test
	public void Product_Get_By_Codes() throws SQLException {
		productDao.reset();
		pro1.set_code("123");
		pro2.set_code("234");
		pro3.set_code("356");
		productDao.add(pro1);
		productDao.add(pro2);
		productDao.add(pro3);

		List<Product> proList = productDao.get_Products_By_Code("3");
		Check_Same_Product(proList.get(0), pro1);
		Check_Same_Product(proList.get(1), pro2);
		Check_Same_Product(proList.get(2), pro3);
	}
	private void Check_Same_Product(Product product1, Product product2) {
		assertThat(product1.get_name(), is(product2.get_name()));
		assertThat(product1.get_code(), is(product2.get_code()));
		assertThat(product1.get_size(), is(product2.get_size()));
		assertThat(product1.get_classification(), is(product2.get_classification()));
		assertThat(product1.get_source(), is(product2.get_source()));
		assertThat(product1.get_UPP(), is(product2.get_UPP()));
		assertThat(product1.get_USP(), is(product2.get_USP()));
		assertThat(product1.get_profit(), is(product2.get_profit()));
		assertThat(product1.get_stock(), is(product2.get_stock()));
		assertThat(product1.get_PS(), is(product2.get_PS()));
		assertThat(product1.get_ND(), is(product2.get_ND()));
		assertThat(product1.get_NR(), is(product2.get_NR()));
		assertThat(product1.get_UN(), is(product2.get_UN()));
	}
}