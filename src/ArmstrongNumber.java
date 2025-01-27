import java.util.Scanner;

public class ArmstrongNumber {
    static boolean isArmstrong(int a)
    {
        int temp = a;
        int sum = 0;
        while (a > 0)
        {
            int rem = a % 10;
            a = a / 10;
            sum = sum + (rem*rem*rem);
        }
        return sum == temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        boolean arm = isArmstrong(a);
        if (arm == true)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not an armstrong number");
        }
    }
}
