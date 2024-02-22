package org.tech;
import java.sql.*;
import java.util.*;
public class RegistrationFromApp {

	public static void main(String[] args)throws SQLException {
		Scanner sc=new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
		if(conn!=null) {
			System.out.println("Database connected");
			Statement st=conn.createStatement();
			int value=st.executeUpdate("create table register(rid int(5) primary key auto_increment,name varchar(200) not null,email varchar(200) not null unique,username varchar(200) not null unique,password varchar(200) not null unique)");
		    if(value<1) {
		    	System.out.println("table created..");
		    }else {
		    	System.out.println("table not created..");
		    }
		}else {
			System.out.println("Database not connected");
		}
	}

}
