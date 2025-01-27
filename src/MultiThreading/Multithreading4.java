class MyThread3 extends Thread
{
    public MyThread3(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        int i = 34;
        System.out.println("Thread ");
//        while (true)
//        {
//            System.out.println("Thread 3");
//        }
    }
}
public class Multithreading4 {
    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("MyThread 1");
        MyThread3 t2 = new MyThread3("MyThread 2");
        t1.start();
        t2.start();
        System.out.println("The id of the thread is: " + t1.getId());
        System.out.println("The name of the thread is: " + t1.getName());
        System.out.println("The id of the thread is: " + t2.getId());
        System.out.println("The name of the thread is: " + t2.getName());

    }
}
