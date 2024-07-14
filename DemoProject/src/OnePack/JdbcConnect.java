package OnePack;
import java.sql.*;
public class JdbcConnect {

	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/july","root","sudhir");
		if(conn!=null) {
			Statement stmt=conn.createStatement();
			int value=stmt.executeUpdate("create table college(id int(5),name varchar(100),address varchar(100))");
			if(value==0) {
				System.out.println("Table created..");
			}else {
				System.out.println("Not created");
			}
		}else {
			System.out.println("Nooo");
		}

	}

}
