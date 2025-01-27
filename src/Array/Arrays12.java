// Sum of elements of an array
import java.util.Arrays;
import java.util.Scanner;

public class Arrays12 {
    static float sumArray(float[] arr)
    {
        if(arr == null)
        {
            return -1;
        }
        float sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the array: ");
        float[] arr = new float[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextFloat();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum: " + sumArray(arr));
    }
}
