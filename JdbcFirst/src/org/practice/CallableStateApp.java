package org.practice;

import java.sql.*;
import java.util.Scanner;

public class CallableStateApp {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
			if(conn!=null) {
				System.out.println("Enter id name salary");
				Scanner sc=new Scanner(System.in);
				int id=sc.nextInt();
				sc.nextLine();
				String name=sc.nextLine();
				int salary=sc.nextInt();
				CallableStatement cmt=conn.prepareCall("{call saveemp(?,?,?)}");
				cmt.setInt(1, id);
				cmt.setString(2, name);
				cmt.setInt(3, salary);
				boolean b=cmt.execute();
				if(!b) {
					System.out.println("Procedure called..");
				}else {
					System.out.println("Not");
				}
			}else {
				System.out.println("DB not connected");
			}
		}catch(Exception e) {
			System.out.println("Error is "+e);
		}

	}

}
