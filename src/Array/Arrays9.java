import java.util.Arrays;
import java.util.Scanner;

public class Arrays9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < str.length; i++)
        {
            str[i] = sc.next();
        }
        for (int i = 0; i < str.length; i++)
        {
            System.out.print(str[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(str));
    }
}
