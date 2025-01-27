class A
{
    public void show()
    {
        System.out.println("Inside show (A)");
    }
}
class B extends A
{
    @Override
    public void show()
    {
        System.out.println("Inside show (B)");
    }
    public void config()
    {
        System.out.println("Inside config (A)");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();

        A obj1 = new A();
        obj1.show();

    }
}
