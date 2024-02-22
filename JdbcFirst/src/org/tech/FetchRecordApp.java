package org.tech;
import java.sql.*;
import java.util.*;
public class FetchRecordApp {

	public static void main(String[] args)throws SQLException {
		Scanner sc=new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
	    if(conn!=null) {
	    	System.out.println("database connected");
	    	Statement st=conn.createStatement();
	    	System.out.println("Enter employee id");
	    	int id=sc.nextInt();
	    	ResultSet rs=st.executeQuery("select * from employee where eid="+id);
	    	if(rs.next()) {
	    		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
	    	}else {
	    		System.out.println("Employee not found..");
	    	}
	    }else {
	    	System.out.println("Database not connected");
	    }
	}

}
