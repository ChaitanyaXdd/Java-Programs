import java.util.Scanner;

class ReportException2 extends Exception
{
    ReportException2(String msg)
    {
        super(msg);
    }
}
class Patient2
{
    String name;
    int age;
    int oxy_level1;
    int rhrct_rpt;
    Scanner sc = new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter the name of patient: ");
        name = sc.next();
        System.out.println("Enter the age of patient: ");
        age = sc.nextInt();
        System.out.println("Enter the oxygen level: ");
        oxy_level1 = sc.nextInt();
        System.out.println("Enter the status report: ");
        rhrct_rpt = sc.nextInt();
    }
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Oxy Level: " + oxy_level1);
        System.out.println("HRCT Report: " + rhrct_rpt);
    }
    public void validate() throws ReportException2
    {
        if (oxy_level1 < 95 && rhrct_rpt > 10)
        {
            throw new ReportException2("Patient is Covid Positive and Need to Hospitalized.");
        }
        else
        {
            display();
        }
    }
}
public class ExceptionHandling14 {
    public static void main(String[] args) {
        Patient2 p = new Patient2();
        p.accept();
        try {
            p.validate();
        }
        catch (ReportException2 e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
