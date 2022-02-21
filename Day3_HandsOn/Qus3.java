package Day3_Ass;

public class Qus3 {



    public static void main(String[] args) {

        A obj1 = new A(60f, 70f, 65f);

        System.out.println("Student First Percentage: " +obj1.getPercentage());

                

        B obj2 = new B(70f , 75f , 80f , 70f);

        System.out.println("Student Second Percentage : " +obj2.getPercentage());

        

    }   

}



abstract class Mark{



    abstract float getPercentage();

}



class A extends Mark{

    float subject1 , subject2 , subject3;

    float per=0;

        

    A(float a , float b, float c){

    subject1 = a;

    subject2 = b;

    subject3 = c;    

    }

    @Override

    public float getPercentage(){

    per = (subject1 + subject2 + subject3 )/300* 100; 

        return per;

    }

}



class B extends Mark{

    float subject1 , subject2 , subject3 , subject4;

    float per=0;

        

    B(float a , float b, float c,float d){

    subject1 = a ;

    subject2 = b;

    subject3 = c;    

    subject4 = d;

    }

    

    @Override

    public float getPercentage(){

    per = (subject1 + subject2 + subject3 + subject4 )/400* 100; 

    

        return per;

    }

}