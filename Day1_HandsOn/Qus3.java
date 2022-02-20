package Day1_Ass;

import java.util.Scanner;
public class  Qus3
{
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);

  System.out.println("Welcome to our Dhaba ");
  System.out.println();


  while(true)
  {
	  System.out.println("\n");
	  System.out.println("\n");
	System.out.println("Enter 1 : For South Indian Dish");
	System.out.println("Enter 2 : For North Indian Dish");
    System.out.println("Enter 3 : For Rajasthani Dish");
    System.out.println("Enter 4 : For Gujrati Dish");
    System.out.println("Enter 5 : For Bengali Dish");
    System.out.println("Enter 6 : For Desserts");
    System.out.println("Enter 7 : To Exit");

    System.out.println();
    System.out.println("Enter your choice::");
    int choice = scan.nextInt();

   switch(choice)
   {
     case 1:
     System.out.println("Welcome to South Indian Food Court");
     southIndianFood();
     break;
    
     case 2:
     System.out.println("Welcome to North Indian Food Court");
     northIndianFood();
     break;
    
     case 3:
     System.out.println("Welcome to Rajasthani Food Court");
     rajasthaniFood();
     break;
    
     case 4:
     System.out.println("Welcome to Gujrati Food Court");
     gujratiFood();
     break;
    
     case 5:
     System.out.println("Welcome to Bengali Food Court");
     bengaliFood();
     break;
    
     case 6:
     System.out.println("Welcome to Desserts Food Court");
     desserts();
     break;
    
     case 7:
     System.out.println("Thanks for visiting...");
     System.exit(0);
     break;
    
     default:
     System.out.println("Incorrect Option!! Please enter a Correct choice...");
   }
  }
 }

 public static void southIndianFood()
 {
  System.out.println("\n");
  System.out.println("You get:");
  System.out.println("Idli               : 4 Pieces : 400rs");
  System.out.println("Butter Cheese Dosa : 2 Pieces : 300rs");
  System.out.println("Vada               : 2 Pieces : 200rs");
  System.out.println("Total Bill                    : 900rs");
  System.out.println("\n");
  System.out.println("Woow your order>500 You will get free desert");
  desserts();

 }

 public static void northIndianFood()
 {
  System.out.println("\n");
  System.out.println("You get:");
  System.out.println("Chole Bhature  : 4 Pieces: 200rs");
  System.out.println("Litti Chokha   : 4 Pieces: 200rs");
  System.out.println("\n");
  System.out.println("Total Bill:400 No Discount Sorry");

 }

 public static void rajasthaniFood()
 {
  System.out.println("\n");	 
  System.out.println("You get:");
  System.out.println("Dal Baati Churma  : 500rs ");
  System.out.println("Makka roti        : 300rs");
  System.out.println("Methi Bajra puri  : 200rs");
  System.out.println("Total Bill        : 1000rs");
  System.out.println("\n");
  System.out.println("Woow your order>500 You will get discount");
 }

 public static void gujratiFood()
 {
  System.out.println("\n");
  System.out.println("You get:");
  System.out.println("Dhokla          : 2 pieces : 300rs");
  System.out.println("Khandvi                    : 200rs");
  System.out.println("Methi ka Thepla            : 100rs");
  System.out.println("Total Bill                 : 600rs");
  System.out.println("\n");
  System.out.println("Total Bill>500 You will get free desert");

  desserts();
 }

 public static void bengaliFood()
 {
  System.out.println("\n");
  System.out.println("You get:");
  System.out.println("Maach Bhaat : 100rs");
  System.out.println("Aalu Luchi  : 100rs");
  System.out.println("\n");
  System.out.println("Total Bill:400 No Discount" );
 }

 public static void desserts()
 {
  System.out.println("\n");
  System.out.println("You get:");
  System.out.println("Rasmalai");
  System.out.println("Rasgulla : 2 Pieces");
  System.out.println("Emarti : 2 Pieces");
  System.out.println("Gajar ka halwa");
  System.out.println("\n");
 }

}