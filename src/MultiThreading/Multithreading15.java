class Covid3 extends Thread
{
    int n;
    String msg;
    Covid3(String msg , int n)
    {
        this.msg = msg;
        this.n = n;
    }
    @Override
    public void run() {
        for(int i = 0; i < n;i++)
        {
            System.out.println("COVID19");
        }
    }
}
class Vaccinated3 extends Thread
{
    int n;
    String msg;
    Vaccinated3(String msg , int n)
    {
        this.msg = msg;
        this.n = n;
    }
    @Override
    public void run() {
        for(int i = 0; i < n;i++)
        {
            System.out.println("Vaccinated 2020");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class LockDown3 extends Thread
{
    int n;
    String msg;
    LockDown3(String msg , int n)
    {
        this.msg = msg;
        this.n = n;
    }
    @Override
    public void run() {
        for(int i = 0; i < n;i++)
        {
            System.out.println("LOCKDOWN 2020");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Multithreading15 {
    public static void main(String[] args) {
//        Covid3 c = new Covid3("")
    }
}
