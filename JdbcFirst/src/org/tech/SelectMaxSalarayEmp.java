package org.tech;
import java.util.*;
import java.sql.*;
public class SelectMaxSalarayEmp {

	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
		if(conn!=null) {
			System.out.println("Connceted succesfully..");
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select max(salary) as maxSalary from employee");
			while(rs.next()) {
				int salary=rs.getInt("maxSalary");
				System.out.println(salary);
				
			}
		}else {
			System.out.println("Not conncected..");
		}
	}

}
