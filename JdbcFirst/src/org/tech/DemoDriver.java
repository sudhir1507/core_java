package org.tech;

import java.sql.Connection;
import java.sql.DriverManager;

public class DemoDriver {

		public static void main(String[] args) {
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","sudhir");
				System.out.println("yse");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
}
