package com.ut.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnectionProvider {
	private static final String DRIVER_CLS = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521/XE";
	private static final String DB_PWD = "admin";
	private static final String DB_UNAME = "system";

	public Connection getConn() {
		Connection con = null;
		try {
			Class.forName(DRIVER_CLS);
			con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
