package org.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatApp {

	public static void main(String[] args)throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
			if(conn!=null) {
				System.out.println("DB connected");
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter id name and contact");
				int id=sc.nextInt();
//				sc.nextLine();
//				String name=sc.nextLine();
				//String contact=sc.nextLine();
				PreparedStatement stmt=conn.prepareStatement("select * from employee where id=?");
				stmt.setInt(1, id);
				//stmt.setString(1, name);
				//stmt.setInt(1, id);
				//stmt.setString(3, contact);
				///int value=stmt.executeUpdate();
				ResultSet rs=stmt.executeQuery();
				while(rs.next()) {
					id=rs.getInt(1);
					String name=rs.getString(2);
					String contact=rs.getString(3);
					System.out.println(id+"\t"+name+"\t"+contact);
				}
//				if(value>0) {
//					System.out.println("deleted..");
//				}else {
//					System.out.println("Not deleted..");
//				}
			}else {
				System.out.println("DB not connected");
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
