package org.tech;
import java.sql.*;
import java.util.*;
public class jdbcSelectData {

	public static void main(String[] args) throws SQLException{
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");

		if(conn!=null) {
			System.out.println("Database is connected..");
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from employee");
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int salary=rs.getInt("salary");
				System.out.println(id+" "+name+" "+salary);
			}
		}else {
			System.out.println("Database is not connected..");
		}
	}

}
