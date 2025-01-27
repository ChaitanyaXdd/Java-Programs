package Shape;
class Rectangle
{
    double length = 4;
    double breadth = 8;

    public double display()
    {
        return length*breadth;
    }
}
class Square extends Rectangle
{
    @Override
    public double display() {
        return super.display();
        //return length*length;
    }
}
public class Object1 {
    public static void main(String[] args) {

    }
}
