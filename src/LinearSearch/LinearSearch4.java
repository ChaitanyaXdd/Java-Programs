public class LinearSearch4 {
    static int searchMinimum(int[] arr)
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int [] arr = {18,12,-7,3,14,28 };
        System.out.println("The minimum element in the array is: " + searchMinimum(arr));
    }
}
