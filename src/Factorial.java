import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = 1;
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            product = product * i;
        }
        System.out.println("Factorial of the  number is: " + product);
    }
}
