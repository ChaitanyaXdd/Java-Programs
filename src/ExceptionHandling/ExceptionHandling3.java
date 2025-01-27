import java.util.Scanner;


public class ExceptionHandling3 {
    public static void main(String[] args) {

        int marks[] = new int[3];

        marks[0] = 98;
        marks[1] = 87;
        marks[2] = 50;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with: ");
        int num = sc.nextInt();
        try {
            System.out.println("Value at array index entered is " + marks[ind]);

            System.out.println("The value of array value divided by number is: " + marks[ind] / num);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occured.");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occured.");
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println("Some exception occured.");
            System.out.println(e);
        }


        System.out.println("End of code.");
    }
}
