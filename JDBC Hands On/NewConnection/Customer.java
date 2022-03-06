package NewConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
class Transaction{
	int operation;
	int amount;
	Transaction next=null;
	public void display() {
		switch(operation) {
		case 1:
			System.out.println("Updated Balance : "+amount);
			break;
		case 2:
			System.out.println("Deposited Amount: "+amount);
			break;
		case 3:
			System.out.println("Withdrawn Amount: "+amount);
			break;
		default:
			System.out.println("");
		}
	}
}
public class Customer {
	static Scanner sc = new Scanner(System.in);
	static int account_no=0,balance=0;
	static String acc_name = null;
	

	public static void main(String[] args) {
		try{
			Connection con = GetConnection.getConnection();
			System.out.println("Enter Your Name : ");
			String name = sc.nextLine();
			System.out.println("Enter Account No:");
			int acc = sc.nextInt();
			
			PreparedStatement pr = con.prepareStatement("select * from BankData where account_no=? and cust_name=?");
			pr.setString(2, name);
			pr.setInt(1, acc);
			System.out.println(pr);
			
			ResultSet rs = pr.executeQuery();
			rs.next();
			account_no= rs.getInt(1);
			acc_name=rs.getString(2);
			balance=rs.getInt(3);
			PreparedStatement pr1=con.prepareStatement("update BankData set balance =? where account_no=? ");
			System.out.println("\nCurrently Logged In Account : ");
			System.out.println("Acc. No. : "+account_no+"  Name : "+ acc_name +"\n");
			if(acc==account_no) {
				int ch=0,count=0;
				Transaction Head=null,Tail=null;
				
				while(ch!=5) {
					pr.setInt(1, acc);
					rs = pr.executeQuery();
					rs.next();
					account_no= rs.getInt(1);
					acc_name=rs.getString(2);
					balance=rs.getInt(3);
					if(count==6) {
						Head=Head.next;
					}
				
				System.out.println("\nEnter Your Choice : ");
				System.out.println("Press 1. To Check Your Acc. Balance:");
				System.out.println("press 2. To Depost Amount.");
				System.out.println("press 3. To Withdraw Amount.");
				System.out.println("press 4. For Mini-Statement.");
				System.out.println("press 5. To Exit.");
				ch= sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Available Balance In Your Account : "+balance +" INR\n\n");
					if(Head==null) {
						Head=new Transaction();
						Tail=Head;
					}
					else {
						Tail.next=new Transaction();
						Tail=Tail.next;
					}
					Tail.amount=balance;
					Tail.operation=1;
					count++;
					break;
				case 2:
					System.out.println("Please Enter Amount To Deposit : ");
					int bal=sc.nextInt();
					pr1.setInt(1, balance+bal);
					pr1.setInt(2, account_no);
					pr1.executeUpdate();
					System.out.println("Deposited Successfully !!");
					System.out.println("Available Balance In Your Account : "+balance +" INR\n\n");
					if(Head==null) {
						Head=new Transaction();
						Tail=Head;
					}
					else {
						Tail.next=new Transaction();
						Tail=Tail.next;
					}
					Tail.amount=bal;
					Tail.operation=2;
					count++;
					break;
				case 3:
					if(balance>10000) {
						int wd=Withdraw(rs);
						if(wd>0) {
							rs=pr.executeQuery();
							rs.next();
							System.out.println("Current Balance : "+rs.getInt(3)+" INR");
							if(Head==null) {
								Head=new Transaction();
								Tail=Head;
							}
							else {
								Tail.next=new Transaction();
								Tail=Tail.next;
							}
							Tail.amount=balance-rs.getInt(3);
							Tail.operation=3;
							count++;
						}
					}
					else {
						System.out.println("Sorry!! Your Account Balance Is Too Low You Can't Withdraw At This Moment");
					}
					break;
				case 4:
					Transaction temp=Head;
					while(temp!=null) {
						temp.display();
						temp=temp.next;
					}
					break;
				case 5:
					  System.out.println("Thank You!! We Are Happy To Help You.!");
					  return;
				default:
					System.out.println("Oopss!! Wrong Choice.! Please Enter A Correct Choice.");
				}
				}
			}
			else {
				System.out.println("Customer Not Registered!! Customer Data Not Found In The Bank's Record");
			}
			sc.close();
			con.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Customer Not Registered!! Customer Data Not Found In The Bank's Record");
			e.printStackTrace();
			}
		}
	

	private static int Withdraw(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Enter amount to withdraw:");
		int withdraw=sc.nextInt();
		int data=0;
		if(withdraw>=balance){
			System.out.println("Sorry!! Your Account Balance Is Too Low You Can't Withdraw At This Moment");
			
		}
		else {
			PreparedStatement pr2 =GetConnection.getConnection().prepareStatement("update BankData set balance =? where account_no=?");
			pr2.setInt(1, balance-withdraw);
			pr2.setInt(2, account_no);
			data =pr2.executeUpdate();
			System.out.println("executed:"+data);
			}
		return data;
		
		
	}


	}


