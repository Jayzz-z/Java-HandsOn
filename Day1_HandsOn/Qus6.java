package Day1_Ass;

import java.util.Scanner;
class Qus6
{
	public static void main(String []args) {
		int P=1234,pin,count=0;
		Scanner SC= new Scanner(System.in);
		while(count<3)
		{
			count++;
			System.out.println(count+".Enter the four digit pin: ");
		pin =SC.nextInt();
		if(P==pin)
		{
			System.out.println("Welcome");
			break;
		}
		else {
			System.out.println("Wrong Password Please try Again");
		}
		if(count==3) {
			System.out.println("You have entered wrong password 3 times Please try again 24 hour ");
		}
		}
	}
}