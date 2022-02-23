package NewConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
	public static Connection getConnection()
	{
		Connection con =null;
		try {
			
			
			//step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connecting to DB....");
			//step 2
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","jayzz");
			System.out.println("Connection Established.......");
			//step 3
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			
			
			e.printStackTrace();
		}
		
		return con;
		
		
	}
}
