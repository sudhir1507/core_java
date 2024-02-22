package org.tech;
import java.sql.*;
import java.util.*;
public class VerifyUserPresentORNotLogin {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
		if(conn!=null) {
			System.out.println("Connected..");
			Statement st=conn.createStatement();
			System.out.println("Enter username");
			String username=sc.next();
			System.out.println("enter password");
			String password=sc.next();
			ResultSet rs=st.executeQuery("select * from register where username='"+username+"' and password='"+password+"'");
			if(rs.next()) {
				System.out.println("valid user");
			}else {
				System.out.println("Not valid user");
			}
		}

	}

}
