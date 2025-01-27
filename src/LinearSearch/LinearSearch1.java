import java.util.Scanner;


public class LinearSearch1 {
    static int linearSearch(int[] arr,int key)
    {
        if (arr.length == 0)
        {
            return -1;
        }
        int index = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        int ind = linearSearch(nums,28);
        System.out.println();
        if (ind == -1)
        {
            System.out.println("Element not found.");
        }
        else
        {
        System.out.println("Element found at index: " + ind);
        }
    }
}
