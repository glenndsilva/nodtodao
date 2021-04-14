package test_prj.test;

import java.util.Map;

public class DBUser implements Scalar<Map<String, String>> {
	DBSource dbsource;
	
	public DBUser(DBSource dbsource) {
		this.dbsource = dbsource;
	}
	
	@Override
	public Map<String, String> value() {
		return new DataResult(this.dbsource.connect(),"SELECT user_id FROM PGI_USER pu").value();
	}
	
	public static void main(String args[]) {
		String fm = new FormattedValue(new DBUser(new OracleDataSource()).value()).value();
		System.out.println(fm);
	}
}
