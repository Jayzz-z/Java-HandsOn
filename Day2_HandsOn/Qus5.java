package Day2;

class Calculator
{
  int addition(int operand1, int operand2)
  {
    return operand1+operand2;
  }
  int  addition(int operand1, int operand2, int operand3)  
  {
    return operand1+operand2+operand3;
  }
}
public class Qus5
{
  public static void main(String args[])
  {
    Calculator obj = new Calculator();
    System.out.println("Addition of two operands is "+obj.addition(100, 25));
    System.out.println("Addition of three operands is "+obj.addition(100, 200, 10));
  }
}