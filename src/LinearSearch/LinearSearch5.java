import java.util.Arrays;

public class LinearSearch5 {
    static int[] search2D(int[][] arr,int key)
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key)
                {
                    return new int[]{i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int[] ans = search2D(arr,99);
        System.out.println("Element is found at: " + Arrays.toString(ans));
    }
}
