// Create 2 threads and perform different tasks
// join and synchronized not there
// Thread Priorities
class A2 extends Thread
{
    @Override
    public void run()  {
        System.out.println("Thread A started");
        try {
            for (int i = 1; i <= 26 ; i++)
            {
                Thread.sleep(1000);
                System.out.println("Thread A I=" + i);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class B2 extends Thread
{
    @Override
    public void run() {
        System.out.println("Thread B Started");
            try
            {
                for (char ch = 'A'; ch <= 'Z';ch++ )
                {
                    Thread.sleep(1000);
                    System.out.println("Thread B ch = " + ch );
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
public class Multithreading11 {
    public static void main(String[] args) {
        A2 a = new A2();
        B2 b = new B2();
        a.start();
        b.start();
//        a.run();
//        b.run();
    }
}
