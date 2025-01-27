import java.util.Scanner;

class InvalidProductException extends Exception
{
    public InvalidProductException(String msg)
    {
        super(msg);
    }
}
class ProductDetails
{
    int p_code;
    String p_name;
    int p_weight;
    Scanner sc = new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter the product code: ");
        p_code = sc.nextInt();
        System.out.println("Enter the name of the product:");
        p_name = sc.next();
        System.out.println("Enter the weight of the product:");
        p_weight = sc.nextInt();
    }
    public void display()
    {
        System.out.println("Product Code: " + p_code);
        System.out.println("Product Name: " +p_name);
        System.out.println("Product Weight: " + p_weight);
    }
    public void validate() throws InvalidProductException
    {
        if (p_weight > 100)
        {
            throw new InvalidProductException("Over Weight");
        }
        else
        {
            display();
        }
    }
}
public class ExceptionHandling12 {
    public static void main(String[] args) {
        ProductDetails p = new ProductDetails();
        p.accept();
        try {
            p.validate();
        }
        catch (InvalidProductException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
