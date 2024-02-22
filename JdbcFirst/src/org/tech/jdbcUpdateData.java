package org.tech;
import java.sql.*;
import java.util.*;
public class jdbcUpdateData {

	public static void main(String[] args)throws SQLException {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
		if(conn!=null) {
			System.out.println("Database connceted successfully..");
			Statement st=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name,salary and id to update");
			String name=sc.nextLine();
			int salary=sc.nextInt();
			int id=sc.nextInt();
			int value=st.executeUpdate("update employee set name='"+name+"',salary="+salary+" where id="+id+"");
			if(value>0) {
				System.out.println("Record updated successfully..");
			}else {
				System.out.println("Not updated..");
			}
		}else {
			System.out.println("Database not connected..");
		}
		

	}

}
