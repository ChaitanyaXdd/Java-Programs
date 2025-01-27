// Return maximum value from an array
public class Arrays6 {
    // imagine that array is not empty
    static int max(int[] arr)
    {
        if (arr == null)
        {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i] > maxVal)
            {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    static int maxRange(int arr[],int start,int end) // two pointer method
    {
        if (arr == null)
        {
            return -1;
        }
        if (end > start)
        {
            return -1;
        }
        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue)
            {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int arr[] = {1, 99 , 54, 101, 34, 102};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,4));
    }
}
