package org.employee;
import java.sql.*;
import java.util.*;
public class EmployeeDataApp {

	public static void main(String[] args) throws Exception {
		int value,eid,esal;
		String ename,eemail,econtact;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
		if(conn!=null) {
			System.out.println("Database connected..");
			PreparedStatement pst=null;
			ResultSet rs=null;
			do {
				Scanner sc=new Scanner(System.in);
				System.out.println("\ncase 1.create table name as Employees");
				System.out.println("case 2.insert 10 record of Employees table using eid,ename,eemail,esal,econtact");
				System.out.println("case 3.display all record of Employees table");
				System.out.println("case 4.write sql query to display all Employee whose id=1 and name is ram as well as salary greate than 10000 ");
				System.out.println("case 5.write sql query to display employee whose name is not ram and salaryis less 1000");
				System.out.println("case 6.write sql query to display Employee whose name is ram and salary is not 10000");
				System.out.println("case 7.write sql query to display employee whose salary is 200 and email is shyam@gmail.com");
				System.out.println("case 8.write sql query to display all employee whose salary is less than 30000 and name is ramesh");
				System.out.println("case 9.write sql query to update Employee whose id is 1 or name is shyam");
				System.out.println("case 10.display employee record whose salary is 10000 ,20000,3000");
				System.out.println("case 11.display employee record whose salary is not in 10000 ,20000,3000");
				System.out.println("case 12.display employee record whose salary is between 10000 and 60000");
				System.out.println("case 13.display employee record whose salary is 10000 ,20000,3000 and name is not ramesh");
				System.out.println("case 14.display employee record whose name is raam,shyam,ganesh");
				System.out.println("case 15.display employee record whose salary is less than 100000 and name is shyam,dinesh");

				System.out.println("Enter choice");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					pst=conn.prepareStatement("create table employees(eid int(5),ename varchar(200),eemail varchar(100),esal int(10),econtact varchar(200))");
					value=pst.executeUpdate();
					if(value<1) {
						System.out.println("Student table is created..");
					}else {
						System.out.println("Table is Not created");
					}
					break;
				case 2:
					System.out.println("Enter eid");
					 eid=sc.nextInt();
					System.out.println("Enter ename");
					ename=sc.next();
					System.out.println("Enter eemail");
					eemail=sc.next();
					System.out.println("Enter esal");
					esal=sc.nextInt();
					System.out.println("Enter econtact");
					econtact=sc.next();
					pst=conn.prepareStatement("insert into employees values(?,?,?,?,?)");
					pst.setInt(1, eid);
					pst.setString(2, ename);
					pst.setString(3, eemail);
					pst.setInt(4, esal);
					pst.setString(5, econtact);
					value=pst.executeUpdate();
					if(value>0) {
						System.out.println("Record inserted success..");
					}else {
						System.out.println("Record not inserted ..");
					}
					break;
				case 3:
					pst=conn.prepareStatement("select * from employees");
					rs=pst.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
					}
					break;
				case 4:
					pst=conn.prepareStatement("select * from employees where eid=1 and ename='ram' and esal>10000");
					rs=pst.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
					}
					break;
				case 5:
					pst=conn.prepareStatement("select * from employees where ename<>'ram' and esal<10000");
					rs=pst.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
					}
					break;
				case 6:
					pst=conn.prepareStatement("select * from employees where ename='ram' and esal<>10000");
					rs=pst.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
					}
					break;
				case 7:
					pst=conn.prepareStatement("select * from employees where eemail='shyam@gmail.com' and esal=20000");
					rs=pst.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
					}
					break;
				case 8:
					pst=conn.prepareStatement("select * from employees where esal<30000 and ename='ramesh'");
					rs=pst.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
					}
					break;
				case 9:
					System.out.println("Enter ename");
					ename=sc.next();
					System.out.println("Enter eemail");
					eemail=sc.next();
					System.out.println("enter esal");
					esal=sc.nextInt();
					System.out.println("Enter econtact");
					econtact=sc.next();
					pst=conn.prepareStatement("update employees set ename=?,eemail=?,esal=?,econtact=? where eid=1 or ename='shyam'");

					pst.setString(1, ename);
					pst.setString(2, eemail);
					pst.setInt(3, esal);
					pst.setString(4, econtact);
					value=pst.executeUpdate();
					if(value>0) {
						System.out.println("Updated success..");
					}else {
						System.out.println("Not updated..");
					}
					break;
				case 10:
					pst=conn.prepareStatement("select * from employees where esal in(10000,20000,30000)");
					rs=pst.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
					}
					break;
				case 11:
					pst=conn.prepareStatement("select * from employees where esal not in(10000,20000,30000)");
					rs=pst.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
					}
					break;
				case 12:
					pst=conn.prepareStatement("select * from employees where esal between 10000 and 60000");
					rs=pst.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
					}
					break;
				case 13:
					pst=conn.prepareStatement("select * from employees where esal in(10000,20000,30000) and ename<>'ramesh'");
					rs=pst.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
					}
					break;
				case 14:
					pst=conn.prepareStatement("select * from employees where ename in('ram','shyam','ganesh')");
					rs=pst.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
					}
					break;
				case 15:
					pst=conn.prepareStatement("select * from employees where esal < 100000 and ename in('shyam','dinesh')");
					rs=pst.executeQuery();
					while(rs.next()) {
						System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5));
					}
					break;
				default:
					System.out.println("Wrong choice..");
				}
			}while(true);
		}else {
			System.out.println("Database not Connected..");
		}

	}

}
