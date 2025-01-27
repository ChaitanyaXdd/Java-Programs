public class MultiThreading14  implements Runnable{
    @Override
    public void run() {
        try {
            for(char ch = 'A';ch <= 'Z'; ch++)
            {
                System.out.println(ch);
                Thread.sleep(2000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        MultiThreading14 obj = new MultiThreading14();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
