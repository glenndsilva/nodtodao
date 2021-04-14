package test_prj.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDataSource implements DBSource {
	  final String driver;
	  final String url;
	  final String username;
	  final String password;
	  
	   public OracleDataSource(){
		   this("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@111111:1781:bduat","uat","uat");
	   }
	   
	   public OracleDataSource(String jdbcdriver, String dburl, String username, String password){
		   this.driver = jdbcdriver;
		   this.url = dburl;
		   this.username = username;
		   this.password = password;
	   }
	   
	@Override
	public Connection connect() {
		   Connection conn=null;
		try {
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		   return conn;
	}
}
