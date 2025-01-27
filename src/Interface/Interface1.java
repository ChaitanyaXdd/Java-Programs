import java.util.Scanner;

 interface Cube {
    void calculate();
    void accept();
    void display();


}
public class Interface1 implements Cube
{

    int num,cube;
    Scanner sc = new Scanner(System.in);
    @Override
    public void calculate()
    {
        cube = num*num*num ;
    }
    @Override
    public void accept()
    {
        System.out.println("Enter the number: ");
        num = sc.nextInt();
    }
   @Override
    public void display()
    {
        System.out.println("Cube of " + num + " is " + cube);
    }
    public static void main(String[] args) {
       Cube i = new Interface1();
       // Interface1 i = new Interface1();
//        Cube c = new Cube();
        i.accept();
        i.calculate();
        i.display();
    }
}
