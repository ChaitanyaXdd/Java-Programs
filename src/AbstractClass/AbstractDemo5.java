abstract class Bank1
{
   public abstract void getBalance1();
}
class BankA extends Bank1
{
    int bal = 100;
    @Override
    public void getBalance1()
    {
        System.out.println("Balance of Bank A is: " + bal );
    }
}

class BankB extends Bank1
{
    int bal = 150;
    @Override
    public void getBalance1()
    {
        System.out.println("Balance of Bank B is: " + bal);
    }
}

class BankC extends Bank1
{
    int bal = 200;
    @Override
    public void getBalance1()
    {
        System.out.println("Balance of Bank C is: " + bal);
    }
}

public class AbstractDemo5 {
    public static void main(String[] args) {
    BankA a = new BankA();
    a.getBalance1();

    BankB b = new BankB();
    b.getBalance1();

    BankC c = new BankC();
    c.getBalance1();
    }
}
