import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
//        int arr2[] = new i;

        System.out.println("Enter the array elements:");
        for (int i = 0; i  < arr.length; i++)  // array input using for loop
        {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i  < arr.length; i++)  // array display using for loop
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // array display using enhanced for loop
        for (int j : arr)  // for every element in the array print the element
        {
            System.out.print(j + " ");
        }
        System.out.println();

        // Using toString method
        System.out.println(Arrays.toString(arr));
    }
}
