package Day3_Ass;



import java.util.Scanner;

interface in1
{
  void display(int p);
}

class Qus4
{
  public static void main (String[] args)
  {
      Scanner sc=new Scanner (System.in);
      int t=sc.nextInt();
      while(t-->0)
      {
      int k= sc.nextInt();
      testClass p = new testClass();
      p.display(k);
      }
  }
}




class testClass implements in1
{
  boolean isPrime(int num) {
      if (num <= 1) {
          return false;
      }
      for (int i = 2; i <= Math.sqrt(num); i++) {
          if (num % i == 0) {
              return false;
          }
      }
      return true;
  }
  public void display(int n)
  {   
      int prime=0;
      for (int i = 2; i <= n; i++) {
          if( isPrime(i) ){
              prime++;
          }
      }
      System.out.println(prime);  
  }
}

