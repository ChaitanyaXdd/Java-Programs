class LockDown1 extends Thread
{
    @Override
    public void run() {
        try {

        }
        catch (Exception e)
        {

        }
    }
}
public class Multithreading13 {
    public static void main(String[] args) {
        LockDown1 loc1 = new LockDown1();
        loc1.start();
    }
}
