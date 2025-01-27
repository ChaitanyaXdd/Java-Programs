class MultithreadThing extends Thread
{
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Multithreading1 {
    public static void main(String[] args) {
        MultithreadThing m = new MultithreadThing();
        m.start();
//        m.run();
        MultithreadThing m1 =new MultithreadThing();
        m1.start();
//        m1.run();

    }
}
