import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        int c = 2;
        while (c * c <= n)
        {
            if(n % c == 0)
            {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean prime = isPrime(num);
        if (prime == true)
        {
            System.out.println("Prime number.");
        }
        else
        {
            System.out.println("Not a prime number");
        }

    }
}
