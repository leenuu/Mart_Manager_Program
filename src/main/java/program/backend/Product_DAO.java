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
			product.set_name(resultSet.getString("name"));
			product.set_code(resultSet.getString("code"));
			product.set_size(resultSet.getString("size"));
			product.set_classification(resultSet.getString("classification"));
			product.set_source(resultSet.getString("source"));
			product.set_UPP(resultSet.getFloat("upp"));
			product.set_USP(resultSet.getFloat("usp"));
			product.set_profit(resultSet.getFloat("profit"));
			product.set_stock(resultSet.getInt("stock"));
			product.set_PS(resultSet.getInt("ps"));
			product.set_NR(resultSet.getBoolean("nr"));
			product.set_ND(resultSet.getBoolean("nd"));
			product.set_UN(resultSet.getBoolean("un"));
			return product;
		}
	};
	public void add(final Product product) throws SQLException {
		this.jdbcTemplate.update("insert into ProductInfom(name, code, size, classification, source, upp, usp, profit, stock, ps, nr, nd, un) values(?,?,?,?,?,?,?,?,?,?,?,?,?)", product.get_name(), product.get_code(), product.get_size(), product.get_classification(), product.get_source(), product.get_UPP(), product.get_USP(), product.get_profit(), product.get_stock(), product.get_PS(), product.get_NR(), product.get_ND(), product.get_UN());
	}
	public List<Product> getAll() {
		return this.jdbcTemplate.query("select * from ProductInfom order by id", this.userMappper);
	}
	public void reset() throws SQLException {
		this.jdbcTemplate.update("TRUNCATE ProductInfom");
	}
//	public HashMap<String, Product> get_all_P() {
//		HashMap<String, Product> all_P = new HashMap<String, Product>();
//
//		return all_P;
//	}
	
}
