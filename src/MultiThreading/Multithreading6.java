class ThreadMethods extends Thread
{
    @Override
    public void run() {
        int i = 0;

        while (i < 5)
        {
            System.out.println("Thread Name: ");
            i++;
        }
    }
}class ThreadMethods1 extends Thread
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
public class Multithreading6 {
    public static void main(String[] args) {
        ThreadMethods t1 = new ThreadMethods();
        ThreadMethods1 t2 = new ThreadMethods1();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}
