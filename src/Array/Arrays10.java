// Minimum value from an array
import java.util.Arrays;
import java.util.Scanner;

public class Arrays10 {
    static int minimumValue(int arr[])
    {
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (minimum > arr[i])
            {
                minimum = arr[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements: ");

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum value from array is: " + minimumValue(arr));
    }
}
