// This class determines the logarithm of a number
package Prac8;
public class DebugTwelve1
{
  public static void main(String[] args) throws ArithmeticException
  {
     double num = 0, result;
     try
     {
        if(num <= 0)
           throw(new ArithmeticException());
        result = Math.log(num);
        System.out.println("Result is " + result);
     }
     catch(Exception e)
     {
        System.out.println("Can't take logarithm for value of zero or lower");
     }
  }
}