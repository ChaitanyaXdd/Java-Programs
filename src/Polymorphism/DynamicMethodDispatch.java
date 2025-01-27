class A1
{
    public void show()
    {
        System.out.println("In show(A)");
    }
//   public void display1()
//   {
//       System.out.println("Display 1");
//   }
}
class B1 extends A1
{
    public void show()
    {
        System.out.println("In show (B)");
    }

    public void display1()
    {
        System.out.println("Display");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        B obj = new B();
//        obj.show();

        A1 obj1 = new B1();
        obj1.show();



      //  A1 obj = new A1();

    }
}
