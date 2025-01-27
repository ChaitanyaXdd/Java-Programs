class Calculator1
{
    int a;
    int b;
    int add,subtract,div,mul;
    Calculator1()
    {

    }
    Calculator1(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    public void Add() throws ArithmeticException
    {
        if(a < 0 || b < 0)
        {
            throw new ArithmeticException("Number is negative.");
        }
        else
        {
            add = a + b;
            System.out.println("Addition of " + a + " and " + b + " is: " + add);
        }
    }
    public void Subtract() throws ArithmeticException
    {
        if(a < 0 || b < 0)
        {
            throw new ArithmeticException("Number is negative.");
        }
        else
        {
            subtract = a - b;
            System.out.println("Subtraction of " + a + " and " + b + " is: " + subtract);
        }
    }
    public void Multiply() throws ArithmeticException
    {
        if(a == 0 || b == 0)
        {
            throw new ArithmeticException("Number entered is zero.");
        }
        else
        {
            mul = a * b;
            System.out.println("Multiplication of " + a + " and " + b + " is: " + mul);
        }
    }
    public void Divide() throws ArithmeticException
    {
        if(a == 0 || b == 0)
        {
            throw new ArithmeticException("Number entered is zero.");
        }
        else
        {
            div = a / b;
            System.out.println("Division of " + a + " and " + b + " is: " + div);
        }
    }

}
public class ExceptionHandling13 {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1(8,2);
        Calculator1 c2 = new Calculator1(8,2);
        Calculator1 c3 = new Calculator1(8,2);
        Calculator1 c4 = new Calculator1(8,0);

        try
        {
            c1.Add();
            c2.Subtract();
            c3.Multiply();
            c4.Divide();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
