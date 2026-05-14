import java.util.Scanner;
class ArithmeticOperations
{
  public static void main(String[] args)
  {
   Scanner obj=new Scanner(System.in);
   System.out.println("enter first number:");
   double num1=obj.nextDouble();
   System.out.println("enter second number");  
   double num2=obj.nextDouble();
   double sum=num1+num2;
   double difference=num1-num2;
   double product=num1*num2;
   double quotient=num1/num2;
   System.out.println("addition:"+sum);
   System.out.println("substraction:"+difference);
   System.out.println("Multiplication:"+product);
   System.out.println("Division:"+quotient);
   }
}
   