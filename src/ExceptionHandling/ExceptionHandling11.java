import java.util.Scanner;

class ExceedingMarksException extends Exception
{
    public ExceedingMarksException(String msg)
    {
        super(msg);
    }
}
class Demo1
{
    int internal_marks,external_marks;
    Scanner sc = new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter the internal marks: ");
        internal_marks = sc.nextInt();
        System.out.println("Enter the external marks: ");
        external_marks = sc.nextInt();
    }
    public void display()
    {
        System.out.println("Internal marks are: " + internal_marks);
        System.out.println("External marks are: " + external_marks);
    }
    public void validate() throws ExceedingMarksException
    {
        if(internal_marks > 40)
        {
            throw new ExceedingMarksException("Internal marks are exceeding.");
        }
        else if (external_marks > 60)
        {
            throw new ExceedingMarksException("External marks are exceeding.");
        }
        else
        {
            display();
        }
    }
}
public class ExceptionHandling11 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.accept();
        try {
            d.validate();
        }
        catch (ExceedingMarksException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("End of program.");
        }
    }
}
