class RunnableThread implements Runnable
{
    @Override
    public void run() {
        System.out.println("Thread 1 ");
    }
}
class RunnableThread2 implements Runnable
{
    @Override
    public void run() {
        System.out.println("Thread 2");
    }
}
public class Multithreading3 {
    public static void main(String[] args) {
        RunnableThread r = new RunnableThread();
        Thread t1 = new Thread(r);

        RunnableThread2 r1 = new RunnableThread2();
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();


    }
}
