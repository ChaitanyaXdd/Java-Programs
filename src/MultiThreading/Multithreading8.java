class Hi extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}class Hello extends Thread
{
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Multithreading8 {
    public static void main(String[] args) {
        Hi h = new Hi();
        Hello h1 = new Hello();

        h.start();
        h1.start();

       // h.show();
       // h1.show();
    }
}
