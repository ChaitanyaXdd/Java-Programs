// Sum of two matrices of size 2X3
import java.util.Scanner;

public class Arrays15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[][] = new int[2][3];
        int[][] arr2 = new int[2][3];
        int arr3[][] = new int[2][3];

        System.out.println("Enter the elements of first array: ");
        for (int row = 0; row < arr1.length; row++)
        {
            for (int col = 0; col < arr1[row].length; col++)
            {
                arr1[row][col] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of second array: ");
        for (int row = 0; row < arr2.length; row++)
        {
            for (int col = 0; col < arr2[row].length; col++)
            {
                arr2[row][col] = sc.nextInt();
            }
        }

        System.out.println("First array: ");
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Second Array: ");
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[row].length; col++) {
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 0; row < arr3.length; row++)
        {
            for (int col = 0; col < arr3[row].length; col++) {
             arr3[row][col] = arr1[row][col] + arr2[row][col];
            }
        }

        System.out.println("Sum of the two arrays is: ");
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                System.out.print(arr3[row][col] + " ");
            }
            System.out.println();
        }

    }
}
