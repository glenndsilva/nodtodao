package test_prj.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class DataResult implements Scalar<Map<String, String>> {
	final Connection con;
	final String query ;
	
	DataResult(Connection con, String query){
	  this.con = con;	
	  this.query = query;
	}
	
	@Override
	public Map<String, String> value() {
		Map<String,String> mp = new HashMap<String, String>();
		ResultSet res;
		try {
			res = this.con.createStatement().executeQuery(this.query);
			int i = 0;
			while(res.next()) {
				 mp.put(i+"", res.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return mp;
	}
}
