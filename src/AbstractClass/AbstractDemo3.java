abstract class Shape1
{
    public int a,b;
    abstract void printArea();
}

class Rectangle1 extends Shape1
{
   public Rectangle1(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    @Override
    public void printArea()
    {
        int area = a*b;
        System.out.println("Area of rectangle is: " + area);
    }
}

class Triangle1 extends Shape1
{
    public Triangle1(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void printArea()
    {
        double area = 0.5 * a * b;
        System.out.println("Area of triangle is: " + area);
    }
}

class Circle1 extends Shape1
{
    public Circle1(int a)
    {
        this.a = a;
    }
    @Override
    public void printArea()
    {
        double area = 3.142 * a * a;
        System.out.println("Area of circle is: " + area);
    }
}

public class AbstractDemo3 {
    public static void main(String[] args) {

        Rectangle1 r = new Rectangle1(3,3);
        r.printArea();

        Circle1 c = new Circle1(4);
        c.printArea();
//
        Triangle1 t = new Triangle1(5,2);
        t.printArea();
    }
}
