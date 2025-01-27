import java.util.Arrays;

// Rotate the array left by one place
public class Arrays16 {
    static void leftRotate(int[] arr)
    {
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        leftRotate(arr);
    }
}
