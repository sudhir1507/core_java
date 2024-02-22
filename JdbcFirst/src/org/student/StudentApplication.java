package org.student;
import java.util.*;
import java.sql.*;
public class StudentApplication {
	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		int studid,value;
		String studname,studemail,studcontact,studaddress;
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
		if(conn!=null) {
			System.out.println("Database connected successfuly..!");
			Statement st=conn.createStatement();
			do {
				Scanner sc=new Scanner(System.in);
				System.out.println("\ncase 1.create table name as Student");
				System.out.println("case 2.insert 10 record of student table using feild studid,studname,studemail,studcontact,studaddress");
				System.out.println("case 3.display all record of student");
				System.out.println("case 4.write sql query to display all student record using all columns values");
				System.out.println("case 5.write sql query to display only name,email and contact from student table");
				System.out.println("case 6.write sql query to display distinct name from student table");
				System.out.println("case 7.write sql query to delete student whose id=1");
				System.out.println("case 8.write sql query to delete student whose id is 4 and name is ram");
				System.out.println("case 9.write sql query to update student whose id is 1 or name is shyam");
				System.out.println("case 10.write sql query to change name,email and contact of student whose id is 3");
				System.out.println("Enter choice");
				int choice=sc.nextInt();
				switch(choice) {
				case 1:
					try{value=st.executeUpdate("create table student(studid int(5),studname varchar(200),studemail varchar(200),studcontact varchar(200),studaddress varchar(200))");
					if(value<1) {
						System.out.println("Student table is created..");
					}else {
						System.out.println("Table is Not created");
					}}catch(Exception e) {
						System.out.println(e);
					}
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				default:
					System.out.println("Wrong choice..");
				}
				
			}while(true);
		}else {
			System.out.println("Database is not connected..!");
		}
	}

}
