// A byte can't hold a value higher than 127
// This program throws an ArithmeticException
// if adding two bytes yields a value that is too high
package Prac8;
public class DebugTwelve2
{
   public static void main(String[] args)
   {
      byte num1 = 120, num2 = 1, result;
      final byte HIGHBYTE = 127;
      byte allowed;
      try
      {
         allowed = (byte)(HIGHBYTE - num1);
         if(num2 > allowed)
            throw(new ArithmeticException());
         result = (byte)(num1 + num2);
         System.out.println("Result is " + result);
      }
      catch(ArithmeticException error)
      {
         System.out.println("Byte can't hold value higher than " + HIGHBYTE);
      }
   }
}