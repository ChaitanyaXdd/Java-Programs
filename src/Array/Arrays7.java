// Change the elements of an array
import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays7 {

    static void change(int arr[],int index1,int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args)
    {
        int arr[] = {1,13, 8, 23,49};
        System.out.println(Arrays.toString(arr));
        change(arr,1,3);
        System.out.println(Arrays.toString(arr));

    }
}
