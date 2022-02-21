package Day3_Ass;


public class Qus2 {



   public static void main(String[] args) {

       

       BankA obj1 = new BankA();

       obj1.getBalance();

       

       BankB obj2 = new BankB();

       obj2.getBalance();

       

       BankC bank = new BankC();

       bank.getBalance();

       



   }

   

}



abstract class Bank{



  public abstract void getBalance();

}



class BankA extends Bank{

   

   @Override

   public void getBalance(){

       System.out.println("Deposited: $100 ");

   }

}



class BankB extends Bank{



   @Override

   public void getBalance(){

       System.out.println("Deposited: $150 ");

   }

}



class BankC extends Bank{



   @Override

   public void getBalance(){

       System.out.println("Deposited: $200 ");

   }

}

