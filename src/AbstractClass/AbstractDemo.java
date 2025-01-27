abstract class Base
{
    public Base()
    {
        System.out.println("Base class constructor");
    }
    public void sayHello()
    {
        System.out.println("Hello...");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Derived extends Base
{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }
}
 class Derived1 extends Base
{
    @Override
    public void greet() {
        System.out.println("Good evening");
    }
    @Override
    public void greet2() {
        System.out.println("Bye");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.greet();
        d.greet2();
       // Base b = new Base();
//        Base b  = new Derived();

    }
}
