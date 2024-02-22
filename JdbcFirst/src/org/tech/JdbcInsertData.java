package org.tech;
import java.sql.*;
import java.util.*;
public class JdbcInsertData {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
		if(conn!=null) {
			System.out.println("Database Connected Succesfully..");
			Statement st=conn.createStatement();
			System.out.println("enter id name salary");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int salary=sc.nextInt();
			int value=st.executeUpdate("insert into employee values('"+id+"','"+name+"','"+salary+"')");
			if(value>0) {
				System.out.println("record inserted success..");
			}else {
				System.out.println("some problem is there");
			}
			
		}else {
			System.out.println("Database Not Connected..");
		}
	}

}
