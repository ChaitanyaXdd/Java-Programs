import java.util.Arrays;

public class SelectionSort1 {
    static  void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            // find maximum and swap with correct element
            int last = arr.length-i-1;
            int maxIndex = getMax(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

     static int getMax(int[] arr, int start, int end) {
        int max = start;
         for (int i = start; i < end; i++) {
             if (arr[i] > arr[max])
             {
                 max = i;
             }
         }
         return max;
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int [] arr = {4,5,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
