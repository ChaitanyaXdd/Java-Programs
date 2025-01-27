import java.util.Scanner;

public class ExceptionHandling4 {
    public static void main(String[] args) {

        int marks[] = new int[3];
        marks[0] = 98;
        marks[1] = 87;
        marks[2] = 50;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index: ");
        int ind = sc.nextInt();

        try
        {
            System.out.println("Outer try block ");

            try {
                System.out.println(marks[ind]);
            }

            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("This index does not exist");
                System.out.println("Exception in level 2");
            }
            System.out.println("After nested try catch");

        }
        catch (Exception e)
        {
            System.out.println("Outer catch block");
            System.out.println("Exception in level 1");
        }
        System.out.println("End of program");
    }
}
