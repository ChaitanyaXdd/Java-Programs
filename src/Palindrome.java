import java.util.Scanner;

public class Palindrome {
    public boolean is_Palindrome(String[] str)
    {
        int length = str.length;
        for (int i = 0; i <= length/2 ;i++)
        {
            if (str[0] != str[length-i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[7];

    }
}
