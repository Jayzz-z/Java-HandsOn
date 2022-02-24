package NewConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Developer {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try{
			Connection con = GetConnection.getConnection();
			System.out.println("Enter Account Holder's Name To Add :");
			String name = sc.nextLine();
			System.out.println("Enter Account No :");
			int acc = sc.nextInt();
			System.out.println("Enter Balance To Add ");
			int balance=sc.nextInt();
			System.out.println("Enter Mobile No:");
			long  l= sc.nextLong();
			System.out.println("Entered Details Are :");
			System.out.println("Name :   "+name +"     Account No. :   "+acc+"     Avl. Balance :   "+balance +"     Mobile No. :   "+l);
			PreparedStatement pr =con.prepareStatement("insert into BankData values(?,?,?,?)");
			pr.setInt(1, acc);
			pr.setString(2, name);
			pr.setInt(3, balance);
			pr.setLong(4, l);
			System.out.println("Record saved:"+pr);
			
			int data = pr.executeUpdate();
			System.out.println("record executed.."+data);
			pr=con.prepareStatement("select * from BankData");
			ResultSet rs=pr.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4));
			}
			con.close();

		}catch (SQLException e) {
			e.printStackTrace();
			}
		}
}
