public class Bank {
    double balance;
    public Bank()
    {
        balance = 0;
    }
    public Bank(double balance)
    {
        this.balance = balance;
    }
    public void deposit(double dep)
    {
        balance = balance + dep;
    }
    public void withdraw(double withd)
    {
        balance = balance - withd;
    }
    public double getBalance()
    {
        return balance;
    }
    public static void main(String[] args) {
        Bank b = new Bank(10000);
        b.deposit(100);
        b.withdraw(100);
        System.out.println("Balance is : " + b.getBalance() );
    }
}
