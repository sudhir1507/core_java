package org.practice;
import java.sql.*;
import java.util.Scanner;
public class EmployeeAppJdbc {

	public static void main(String[] args) {
		try {
			com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
			if(conn!=null) {
				System.out.println("Database connceted..");
				Statement stmt=conn.createStatement();
				System.out.println("Enter id name and contact");
				Scanner sc=new Scanner(System.in);
				int id=sc.nextInt();
//				sc.nextLine();
//				String name=sc.nextLine();
//				String contact=sc.nextLine();
				ResultSet rs=stmt.executeQuery("select * from employee where id="+id);
				while(rs.next()) {
					id=rs.getInt(1);
					String name=rs.getString(2);
					String contact=rs.getString(3);
					System.out.println(id+"\t"+name+"\t"+contact);
				}
			}else {
				System.out.println("not conncetd..");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
