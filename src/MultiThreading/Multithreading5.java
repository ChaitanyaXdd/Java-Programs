class ThreadPriorities extends Thread
{
    public ThreadPriorities(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        int i = 34;

        while (true)
       {
           System.out.println("Thread Name: " + this.getName());
          //  System.out.println("Thread 3");
       }
    }
}
public class Multithreading5 {
    public static void main(String[] args) {
        ThreadPriorities t1 = new ThreadPriorities("MyThread 1");
        ThreadPriorities t2 = new ThreadPriorities("MyThread 2");
        ThreadPriorities t3 = new ThreadPriorities("MyThread 3");
        ThreadPriorities t4 = new ThreadPriorities("MyThread 4");
        ThreadPriorities t5 = new ThreadPriorities("MyThread 5 (most important thread) ");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
