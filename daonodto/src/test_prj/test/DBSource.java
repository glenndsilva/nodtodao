package test_prj.test;

import java.sql.Connection;

public interface DBSource {
	public Connection connect();
}
