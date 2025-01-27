import java.util.Scanner;

class NegativeRadiusException extends Exception
{
    public NegativeRadiusException(String msg)
    {
        super(msg);
    }
}
public class ExceptionHandling6 {

    public static double area(int radius) throws NegativeRadiusException
    {

        if(radius < 0)
        {
            throw new  NegativeRadiusException("Radius cannot be negative.");
        }
        double result = Math.PI*radius*radius;
        return result;
    }

   public static int divide(int a, int b) throws ArithmeticException
    {

        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
       try
       {
           int c = divide(6,2);
           System.out.println(c);
           double ar = area(2);
           System.out.println(ar);
       }
       catch (Exception e)
       {
           System.out.println(e);
       }
    }
}
