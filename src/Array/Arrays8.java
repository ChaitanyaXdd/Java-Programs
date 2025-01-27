// Two pointer method --> we use two pointers start and end

import java.util.Arrays;

public class Arrays8 {
    static void reverseArray(int arr[])
    {
        if (arr == null)
        {
            return;
        }
        int start = 0;
        int end = arr.length-1;
        while(start < end)
       {
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
       }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,98,23,45};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
