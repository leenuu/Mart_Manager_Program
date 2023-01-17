package program.backend;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Product_DAO {
	private JdbcTemplate jdbcTemplate;
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	private RowMapper<Product> userMappper = new RowMapper<Product>() {
		public Product mapRow(ResultSet resultSet, int i) throws SQLException {
			Product product = new Product();
//			product.setid(resultSet.getString("id"));
//			product.setname(resultSet.getString("name"));
//			product.setpassword(resultSet.getString("password"));

			return product;
		}
	};
	public void add(final Product product) throws SQLException {
		this.jdbcTemplate.update("insert into users() values(?,?,?)", product.get_code(), product.get_name(), product.get_classification());
	}
	public List<Product> getAll() {
		return this.jdbcTemplate.query("select * from users order by id", this.userMappper);
	}
//	public HashMap<String, Product> get_all_P() {
//		HashMap<String, Product> all_P = new HashMap<String, Product>();
//
//		return all_P;
//	}
	
}
