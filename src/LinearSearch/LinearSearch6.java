// Even number of digits
public class LinearSearch6 {
    static int findDigits(int[] arr)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i]))
            {
                count++;
            }
        }
        return count;
    }

    // function to check even digits or not
    static boolean isEven(int num)
    {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0)
        {
            return true;
        }
        return false;
    }
    static int digits(int num)
    {
        if (num < 0)
        {
            num = num * -1;
        }
        if (num == 0)
        {
            return 1;
        }
        int count = 0;
        while (num > 0)
        {
            count++;
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(findDigits(nums));

    }
}
