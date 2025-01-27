// Floor of a number
public class BinarySearch5 {
    static int floor(int[] arr, int key)
    {
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
        return end;
    }
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int ans = floor(arr,8);
        System.out.println("Floor of the key is: " + arr[ans]);

    }
}
