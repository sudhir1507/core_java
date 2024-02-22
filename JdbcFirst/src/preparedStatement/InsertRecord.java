package preparedStatement;
import java.sql.*;
import java.util.*;
public class InsertRecord {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdatabase","root","sudhir");
		if(conn!=null) {
			System.out.println("Connected..");
			
			System.out.println("Enter eid");
			 int eid=sc.nextInt();
			System.out.println("Enter ename");
			String ename=sc.next();
			System.out.println("Enter email");
			String email=sc.next();
			System.out.println("Enter esal");
			int esal=sc.nextInt();
			System.out.println("Enter econtact");
			String econtact=sc.next();
			PreparedStatement st=conn.prepareStatement("insert into employee values(?,?,?,?,?)");
			st.setInt(1, eid);
			st.setString(2, ename);
			st.setString(3, email);
			st.setInt(4, esal);
			st.setString(5,econtact);
			int value=st.executeUpdate();
			if(value>0) {
				System.out.println("Inserted record");
			}else {
				System.out.println("Not inserted");
			}
		}else {
			System.out.println("Not connceted");
		}

	}

}
