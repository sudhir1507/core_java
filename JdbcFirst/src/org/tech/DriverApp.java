package org.tech;
import java.sql.*;
public class DriverApp {

	public static void main(String[] args) throws SQLException {
	com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	System.out.println("Driver registed succesfully...");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
	if(conn!=null) {
		System.out.println("Database connected succesfully...");
		
	}else {
		System.out.println("Some problem is there..");
	}
	
	}

}
