import java.util.Scanner;

 interface Operation
{
    final static double pi = 3.142;
    void volume();
}
public class Interface3 implements Operation
{
    Scanner sc = new Scanner(System.in);
    double r,h,vol;
    public void accept()
    {
        System.out.println("Enter radius: " );
        r = sc.nextDouble();
        System.out.println("Enter height: ");
        h = sc.nextDouble();
    }

public void volume()
{
    vol = pi*r*r*h;
    System.out.println("Volume is: " + vol);
}

    public static void main(String[] args) {
        Interface3 i = new Interface3();
        i.accept();
        i.volume();
    }
}
