import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array of objects
        String str[] = new String[4];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < str.length ; i++)
        {
            str[i] = sc.next();

        }
        str[1] = "Chaitanya";
        System.out.println(Arrays.toString(str));

    }
}
