import java.util.Scanner;

class ReportException extends Exception
{
    public ReportException(String msg)
    {
        super(msg);
    }
}
class Patient
{
    String p_name;
    int p_age;
    int oxy_level;
    int p_hrct_report;

    Scanner sc = new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter the name of patient: ");
        p_name = sc.next();
        System.out.println("Enter the age of patient: ");
         p_age = sc.nextInt();
        System.out.println("Enter the oxygen level: ");
        oxy_level = sc.nextInt();
        System.out.println("Enter the status report: ");
        p_hrct_report = sc.nextInt();
    }
    public void display()
    {
        System.out.println("Name: " + p_name);
        System.out.println("Age: " + p_age);
        System.out.println("Oxy Level: " + oxy_level);
        System.out.println("HRCT Report: " + p_hrct_report);
    }
     public void validate() throws ReportException
    {
       if(oxy_level < 95 && p_hrct_report > 10)
       {
           throw new ReportException("Patient is Covid Positive.");
       }
       else
       {
           display();
       }
    }
}


public class ExceptionHandling8 {
    public static void main(String[] args) {
        Patient p = new Patient();
        p.accept();
        try {
            p.validate();
//            if(p.oxy_level < 95 &&  p.p_hrct_report > 10 )
//            {
//                throw new ReportException("Patient is Covid Positive and needs to be Hospitalized.");
//            }
//            else
//            {
//                p.display();
//            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("End of program.");
        }
    }
}
