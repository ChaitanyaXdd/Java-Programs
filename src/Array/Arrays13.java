// Element is present or not
import java.util.Arrays;
import java.util.Scanner;

public class Arrays13 {
    static boolean isPresent(int[] arr, int element)
    {
        if(arr == null)
        {
            return false;
        }
        boolean present = false;
        for (int i = 0; i < arr.length ; i++)
        {
            if (arr[i] == element)
            {
                present = true;
                break;
            }
        }
        return present;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(isPresent(arr,1));

//        boolean key = isPresent(arr,1);
//        if(key == true)
//        {
//            System.out.println("Element is present.");
//        }
//        else
//        {
//            System.out.println("Element is not present.");
//        }

    }
}
