package jdbcpractical;

import java.sql.*;
import java.util.*;

public class EmployeeDetailsApp {

	public static void main(String[] args) throws SQLException {
		int value,esal,eid;
		String ename,econtact,email;
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		String createQueary= "create table employee (eid int(5),ename varchar(100),email varchar(100),esal int(10),econtact varchar(100))";
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase", "root", "sudhir");
		if (conn != null) {
				Statement stmt = conn.createStatement();
				do {
					Scanner sc=new Scanner(System.in);
					System.out.println("\ncase 1.create table name as Student");
					System.out.println("case 2.insert five record of employee table using feild eid,ename,email,esal,econtact");
					System.out.println("case 3.display all record of employee");
					System.out.println("case 4.update employee by id");
					System.out.println("case 5.Delete employee record by name");
					System.out.println("Enter choice");
					int choice=sc.nextInt();
					switch(choice) {
					case 1:
						try{value = stmt.executeUpdate(createQueary);
						   if(value<1) {
							  System.out.println("Table created..!");
						   }else {
							  System.out.println("Table is NOT created..!");
						   }
						}catch(Exception e) {
							System.out.println(e);
						}
						break;
					case 2:
						System.out.println("Enter eid");
						 eid=sc.nextInt();
						System.out.println("Enter ename");
						ename=sc.next();
						System.out.println("Enter email");
						email=sc.next();
						System.out.println("Enter esal");
						esal=sc.nextInt();
						System.out.println("Enter econtact");
						econtact=sc.next();
						value=stmt.executeUpdate("insert into employee values('"+eid+"','"+ename+"','"+email+"','"+esal+"','"+econtact+"')");
						if(value>0) {
							System.out.println("Record inserted success..!");
						}else {
							System.out.println("Record Not inserted..!");
						}
						break;
					case 3:
						ResultSet rs=stmt.executeQuery("select * from employee");
						while(rs.next()) {
							eid=rs.getInt("eid");
							ename=rs.getString("ename");
							email=rs.getString("email");
							esal=rs.getInt("esal");
							econtact=rs.getString("econtact");
							System.out.println(eid+"\t"+ename+"\t"+email+"\t"+esal+"\t"+econtact);
						}
						break;
					case 4:
						System.out.println("Enter eid to update record");
						eid=sc.nextInt();
						System.out.println("Enter ename");
						ename=sc.next();
						System.out.println("Enter email");
						email=sc.next();
						System.out.println("Enter esal");
						esal=sc.nextInt();
						System.out.println("Enter econtact");
						econtact=sc.next();
						value=stmt.executeUpdate("update employee set ename='"+ename+"',email='"+email+"',esal='"+esal+"',econtact='"+econtact+"' where eid='"+eid+"'");
						if(value>0) {
							System.out.println("Record updated Successfuly..");
						}else {
							System.out.println("Record not updated..");
						}
						break;
					case 5:
						System.out.println("Enter eid to delete record");
						eid=sc.nextInt();
						value=stmt.executeUpdate("delete from employee where eid='"+eid+"'");
						if(value>0) {
							System.out.println("Record deleted successfully..");
						}else {
							System.out.println("Record not deleted..");
						}
						break;
					default:
						System.out.println("Worng choice..");
					}
				}while(true);
				
			}else {
					System.out.println("Database not connceted");
		}
	}

}
