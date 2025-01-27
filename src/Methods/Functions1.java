import java.util.Scanner;

public class Functions1 {
    int a , b , c;
    Scanner sc = new Scanner(System.in);
    public  void accept()
    {
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
    }
    public void sum()
    {
        c = a + b;
        System.out.println("Sum is: " + c);
    }
    public static void main(String[] args) {
        Functions1 f = new Functions1();
        f.accept();
        f.sum();
    }
}
