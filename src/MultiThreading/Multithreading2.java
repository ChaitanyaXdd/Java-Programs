class MyThread extends Thread
{
    int i = 0;
    @Override
    public void run() {
        while (i < 5) {
            System.out.println("Thread1 is running");
            i++;
        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}class MyThread2 extends Thread
{
    int i = 0;
    @Override
    public void run() {
        while (i < 5) {
            System.out.println("Thread2 is running");
            i++;
        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}
public class Multithreading2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();


    }
}
