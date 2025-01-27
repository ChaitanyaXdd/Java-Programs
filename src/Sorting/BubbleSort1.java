import java.util.Arrays;

public class BubbleSort1 {
    public static void bubbleSort(int[] arr)
    {
        int j = 0;
        boolean swapped;
        while (j < arr.length-1)
        {
            swapped = false;
            for (int i = 1; i < arr.length-j; i++)
            {
                if (arr[i] < arr[i-1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
            {
                break;
            }
            j++;
        }
    }
    public static void main(String[] args) {
//        int[] arr = {1,3,4,2,5};
        int[] arr = {1,3,5,9,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
