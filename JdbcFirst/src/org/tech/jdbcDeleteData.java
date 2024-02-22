package org.tech;
import java.util.*;
import java.sql.*;
public class jdbcDeleteData {

	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
		if(conn!=null) {
			System.out.println("Database connected succesfully..");
			Statement st=conn.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id to delete");
			int id=sc.nextInt();
			int value=st.executeUpdate("Delete from employee where id="+id+"");
			if(value>0) {
				System.out.println("Record deleted succesfully..");
			}else {
				System.out.println("Record not deleted ..");
			}
		}else {
			System.out.println("Database Not connected..");
		}
	}

}
