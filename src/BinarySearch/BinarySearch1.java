// Assume array is sorted in ascending order
public class BinarySearch1 {
    static int binarySearch(int[] arr, int key)
    {
        int start = 0;
        int end = arr.length-1;
       while (start <= end)
       {
//           int mid = start + end / 2; might exceed the range of integer
           int mid = start + (end-start) / 2;
           if (key < arr[mid])
           {
               end = mid -1;
           }
           else if (key > arr[mid])
           {
               start = mid + 1;
           }
           else
           {
               return mid;
           }
       }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int ans = binarySearch(arr,1);
        if (ans == -1)
        {
            System.out.println("Element not found.");
        }
        else
        {
        System.out.println("Element found at index: " + ans);
        }
    }
}
