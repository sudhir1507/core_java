package org.tech;
import java.sql.*;
import java.util.*;
public class InsertRegisterData {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
		if(conn!=null) {
			System.out.println("Connected..");
			Statement st=conn.createStatement();
//			System.out.println("eneter rid");
//			int rid=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("Enter email");
			String email=sc.next();
			System.out.println("Enter username");
			String username=sc.next();
			System.out.println("enter password");
			String password=sc.next();
			int value=st.executeUpdate("insert into register values('0','"+name+"','"+email+"','"+username+"','"+password+"')");
			if(value>0) {
				System.out.println("Record inserted success.");
			}else {
				System.out.println("Not inserted.");
			}
		}else {
			System.out.println("Not Connected");
		}

	}

}
