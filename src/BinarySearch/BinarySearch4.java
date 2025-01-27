// Ceiling of a number

public class BinarySearch4 {
    static int ceiling(int[] arr, int key)
    {
        if (key > arr[arr.length -1 ])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start <= end)
        {

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
        return start;
    }
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int ans = ceiling(arr,17);
        System.out.println("Ceiling of a number is: " + arr[ans]);

    }
}
