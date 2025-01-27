// Order-Agnostic Binary Search
// When we don't know whether the array is sorted in ascending or descending order

public class BinarySearch3 {
    static int binarySearch(int[] arr, int key)
    {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = false;
        if (arr[start] < arr[end])
        {
            isAsc = true;
        }
        else
        {
            isAsc = false;
        }

        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key)
            {
                return mid;
            }
            if (isAsc)
            {
                if (key < arr[mid])
                {
                    end = mid - 1;
                }
                else
                {
                    start = mid + 1;
                }
            }
            else
            {
                if (key < arr[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int ans = binarySearch(arr,18);
        if (ans == -1)
        {
            System.out.println("Element not found.");
        }
        else
        {
            System.out.println("Element found at at index: " + ans);
        }
    }
}
