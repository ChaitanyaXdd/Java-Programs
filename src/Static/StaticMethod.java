class Demo3
{
    static  int num;
    static float num1;

    static String name;
    static int grade;

    static String nm;

    int a = 10;

    static void display()
    {
        System.out.println("Number: " + num);
        System.out.println("String: " + nm);
    }

    public void nonstatic()
    {
        display();
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        Demo3.display();
        System.out.println(Demo3.num1);
        Demo3 d = new Demo3();
        d.nonstatic();
    }
}
