// Is Array in ascending order or not
import java.util.Arrays;
import java.util.Scanner;

public class Arrays11 {
    static boolean isAscending(int[] arr)
    {
        boolean ascending = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i+1])
            {
                ascending = true;
            }
            else
            {
                ascending = false;
            }
        }
        return ascending;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(isAscending(arr));
    }
}
