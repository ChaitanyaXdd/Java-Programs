import java.util.Arrays;
// LinearSearch
public class BinarySearch6 {
    static int search(int[][] arr,int key)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (key == arr[i][j])
                {
                    return 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] arr = {{18,9,12},{36,-4,91},{44,33,16}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

            int ind = search(arr,91);
            if (ind == 1)
            {
                System.out.println("Element found.");
            }
            else
            {
                System.out.println("Element not found");
            }
        }
    }

