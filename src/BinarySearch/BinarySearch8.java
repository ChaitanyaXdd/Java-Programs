import java.util.Arrays;

// Strictly Sorted
public class BinarySearch8 {
    static int[] search(int[][] matrix,int target)
    {
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 1)
        {
            return simpleBinarySearch(matrix,0,0,col-1,target);
        }
        int rStart = 0;
        int rEnd = row - 1;
        int midC = col / 2;
        while (rStart < (rEnd - 1))
        {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][midC] == target)
            {
                return new int[]{mid,midC};
            }
            if (matrix[mid][midC] < target)
            {
                rStart = mid;
            }
            else
            {
                rEnd = mid;
            }
        }
        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][midC] == target)
        {
            return new int[]{rStart,midC};
        }
        if (matrix[rStart + 1 ][midC] == target)
        {
            return new int[]{rStart + 1,midC};
        }

        // search in 1st half
        if (target <= matrix[rStart][midC - 1]) {
            return simpleBinarySearch(matrix, rStart, 0, midC-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][midC + 1] && target <= matrix[rStart][col - 1]) {
            return simpleBinarySearch(matrix, rStart, midC + 1, col - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][midC - 1]) {
            return simpleBinarySearch(matrix, rStart + 1, 0, midC-1, target);
        } else {
            return simpleBinarySearch(matrix, rStart + 1, midC + 1, col - 1, target);
        }

    }
    static int[] simpleBinarySearch(int[][] matrix,int row,int cStart,int cEnd,int target)
    {
        while (cStart <= cEnd)
        {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target)
            {
                return new int[]{row,mid};
            }
            if ((matrix[row][mid] < target))
            {
              cStart = mid + 1;
            }
            else
            {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 9)));

    }
}
