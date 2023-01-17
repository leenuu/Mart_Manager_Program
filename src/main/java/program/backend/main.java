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


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/context.xml")
public class main {
	@Autowired
	private Product_DAO dao;
	HashMap<String, Product> P_Info = new HashMap<String, Product>();
	private HashMap<String, String> P_Name_Code = new HashMap<String, String>();

	@Before
	public void setUp() {

	}

	@Test
	public void test() {
		System.out.println("hello ");
		assertThat(3, is(3));
	}

}