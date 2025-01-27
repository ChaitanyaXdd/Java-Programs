import java.util.Arrays;
import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int arr[][] = new int[3][3];  //[rows][col]
//
//        int num[][] = {
//                {1,2,3}, // 0th index
//                {4,5,6}, // 1st index
//                {7,8,9} // 2nd index
//        };
//
//        System.out.println("Enter the array elements: ");
//        // input
//        for (int row = 0; row < arr.length ; row++)
//        {
//            for (int col = 0; col < arr[row].length ; col++)
//            {
//                arr[row][col]  = sc.nextInt();
//            }
//        }
//
//        // output
//        for (int row = 0; row < arr.length ; row++)
//        {
//            for (int col = 0; col < arr[row].length ; col++)
//            {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//
//        // enhanced for loop
//        for (int[] ints : arr)
//        {
//            System.out.println(Arrays.toString(ints));
//        }

        //int[][] arr=new int[5][3];

        int[][] arr1={ {1,2},{3,4}};
//        System.out.println(Arrays.toString(arr1));
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
