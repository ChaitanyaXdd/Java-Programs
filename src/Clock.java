import java.util.Scanner;

public class Clock {
    int hrs,mins,secs;
    Clock()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours: ");
        this.hrs = sc.nextInt();
        System.out.println("Enter minutes: ");
        this.mins = sc.nextInt();
        System.out.println("Enter seconds: ");
        this.secs = sc.nextInt();
    }
    public void isValid()
    {
        if(hrs >= 0 && hrs < 24 && mins>0 && mins < 60 && secs > 0 && secs < 60)
        {
            System.out.println("Time is valid.");
        }
        else
        {
            System.out.println("Time is not valid.");
        }
    }
    public void setTimeMode()
    {
        if(hrs >= 12 )
        {
            System.out.println(hrs + ":" + mins + ":" + secs + "PM."  );
        }
        else
        {
            System.out.println(hrs + ": " + mins + ":" + secs + "AM.");
        }
    }
    public static void main(String[] args) {
    Clock c = new Clock();
    c.isValid();
    c.setTimeMode();
    }
}
