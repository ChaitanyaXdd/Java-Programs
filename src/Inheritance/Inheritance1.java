//Inheritance

class Rectangle
{
   public   double length;
    public double width;


   public Rectangle()
    {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length,double width)
    {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

class Box extends Rectangle {
    double depth;

    Box()
    {
      depth = 0;
    }


    public Box(double length , double width,double depth)
    {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }

    public double area()
    {
        return 2 * (length * width + width * depth + depth * length );
    }

    public double volume()
    {
        return length * width * depth;
    }

}

public class Inheritance1 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(2,2);
        Box b = new Box(2,2,2);

        System.out.println("Area of box: " + b.area());
        System.out.println("Area of rectangle: " + r.area());
        System.out.println("Volume of box: " + b.volume());

        Rectangle r1 = new Rectangle();
    }
}
