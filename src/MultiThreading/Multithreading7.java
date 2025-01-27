
class ThreadMethod3 extends Thread
{
    @Override
    public void run() {
        int i = 0;

        while (true)
        {
            System.out.println("Thread Name: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}class ThreadMethod4 extends Thread
{
    @Override
    public void run() {
        int i = 0;

        while (i < 6)
        {
            System.out.println(" My Thread Name: ");
            i++;
        }
    }
}
public class Multithreading7 {
    public static void main(String[] args) {
        ThreadMethod3 t1 = new ThreadMethod3();
        ThreadMethod4 t2 = new ThreadMethod4();
        t1.start();
        t2.start();
    }
}
