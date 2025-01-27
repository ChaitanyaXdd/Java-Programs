import java.util.Arrays;
import java.util.Scanner;

public class Arrays4 {
    static void change(int arr[])
    {
        arr[0] = 99;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);  // Arrays are mutable in java
        System.out.println(Arrays.toString(nums));
    }
}
