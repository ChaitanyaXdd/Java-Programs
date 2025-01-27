// Descending order sorted array
public class BinarySearch2 {
    static int binarySearch(int[] arr, int key)
    {
        int start = 0;
        int end = arr.length-1;
        while (start <= end)
        {
            int mid = start + (end - start) / 2 ;
            if (key < arr[mid])
            {
                start = mid + 1;
            }
            else if (key > arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {99,75,67,54,45,33,31,19,18,5,3,1};
        int ans = binarySearch(arr,19);
        if (ans == -1)
        {
            System.out.println("Element not found.");
        }
        else
        {
            System.out.println("Element found at index: " + ans );
        }
    }
}
