
public class ExceptionHandling1 {
    public static void main(String[] args) {

        // Arithmetic Exception
        int a = 10;
        int b = 0;
       // int c = a / b;
      // System.out.println("The result is: " + c);



        try
        {
            int c = a/b;
            System.out.println("The result is: " + c);
        }
        catch (Exception e)
        {
            System.out.println("Cannot divide by zero.");
            System.out.println(e);
        }



       System.out.println("End of program");
    }
}
