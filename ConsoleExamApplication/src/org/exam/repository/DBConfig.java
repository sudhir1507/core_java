package org.exam.repository;

import java.sql.*;

import org.exam.helper.PathHelper;

public class DBConfig {
	protected Connection conn;
	protected PreparedStatement stmt;
	protected ResultSet rs;

	public DBConfig() {
		try {
			PathHelper phelp=new PathHelper();
			Class.forName(PathHelper.p.getProperty("driver"));
			conn = DriverManager.getConnection(PathHelper.p.getProperty("url"), PathHelper.p.getProperty("user"), PathHelper.p.getProperty("pass"));
		} catch (Exception e) {
			System.out.println("Error is " + e);
		}
	}
}
