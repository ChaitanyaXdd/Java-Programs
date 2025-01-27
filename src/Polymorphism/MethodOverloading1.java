class Calculator
{
    public int add(int a ,int b )
    {
        return a + b;
    }
    public int add(int a,  int b,int c)
    {
        return a +b + c ;
    }

    public double add(double a, int b)
    {
        return  a+b;
    }

}
public class MethodOverloading1 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(2,3);
        c.add(4,5,6);
        c.add(8,9);
    }
}
