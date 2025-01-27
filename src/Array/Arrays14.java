// Average of marks of an array
import java.util.Arrays;
import java.util.Scanner;

public class Arrays14 {
    static float average(int marks[])
    {
        float sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        return sum/ marks.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks =  new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < marks.length; i++)
        {
            marks[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(marks));
        System.out.println("Average is: " + average(marks));
    }
}
