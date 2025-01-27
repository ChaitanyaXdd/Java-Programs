class Thread1 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of i of Thread 1:  " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class Thread2 implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 5; i++) {
            System.out.println("Value of i from Thread2: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Multithreading9 {
    public static void main(String[] args) {
       Thread1 obj1 = new Thread1();
        Thread t = new Thread(obj1);


        Thread2 obj2 = new Thread2();
        Thread t1 = new Thread(obj2);

        t.start();
        t1.start();


    }
}
