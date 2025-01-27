import java.util.Scanner;
//Functional interface
 interface Square {
    public void square();
}
public class Interface2 implements Square
{
    int s;
    int sq;
    Scanner sc = new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter the number: ");
        s = sc.nextInt();
    }
    public void square()
    {
        sq  = s*s;
    }
    public void display()
    {
        System.out.println("Square of "  + s +  "is: " + sq);
    }

    public static void main(String[] args) {
        Interface2 i = new Interface2();
        i.accept();
        i.square();
    }
}
