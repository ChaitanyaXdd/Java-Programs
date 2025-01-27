import java.util.Scanner;

class Exception1 extends Exception
{
    @Override
    public String toString() {
        return  " Inside To String Method. ";
    }

    @Override
    public String getMessage() {
        return " Inside Get Message method.";
    }
}
public class ExceptionHandling5 {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a < 9)
        {
            try {
//                throw new  Exception1();
                throw new ArithmeticException("This is an arithmetic exception");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }
        }
        else
        {
            System.out.println("End of program");
        }
    }
}
