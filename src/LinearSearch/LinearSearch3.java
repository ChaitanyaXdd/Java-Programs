// Search in Range 1- 4 index
public class LinearSearch3 {
    static int search(int[] arr, int key, int start, int end)
    {
        for (int i = start; i <= end; i++) {
            if (arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28 };
        int index = search(arr,3,1,4);
        if (index != -1)
        {
            System.out.println("Element is found at " + index);
        }
        else
        {
            System.out.println("Element is absent.");
        }
    }
}
