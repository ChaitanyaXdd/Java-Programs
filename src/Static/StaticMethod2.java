class Random2
{
    public static int x ;
    static int y;
    Random2()
    {

    }

    int b = 8;

    static void show()
    {
        System.out.println("Static Method");
    }

    void display()
    {
        show();
        System.out.println("Display Method");
    }

//    static
//    {
//        x = 89;
//        System.out.println("Static block");
//    }

}
public class StaticMethod2 {
    public static void main(String[] args) {
//        Random2 r = new Random2();
//        Random2.show();
//        System.out.println(Random2.x);
//        Random2.show();
        Random2 r = new Random2();
        r.display();


    }
}
