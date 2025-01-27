class Account {

    int account_number;

    String account_name;
    double account_balance,new_balance;

    Account()
    {
        account_name = " ";
        account_balance = 0;
        account_number = 0;
    }

    Account(int account_number,String account_name,int account_balance)
    {
        this.account_number = account_number;
        this.account_name = account_name;
        this.account_balance = account_balance;
    }

    void deposit(double deposit_amount)
    {
        account_balance = account_balance + deposit_amount;
        System.out.println("New balance after depositing: " + account_balance);
    }

    void withdraw(double withdraw_amount)
    {
        if(account_balance > withdraw_amount)
        {
            account_balance = account_balance - withdraw_amount;
            System.out.println("Balance after withdrawing: " + account_balance);
        }
        else if (account_balance == withdraw_amount)
        {
            System.out.println("Minimum balance should be 1000.");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
}

public class Constructor5
{
    public static void main(String[] args) {
        Account a = new Account(1,"ABC",10000);
        a.deposit(100);
        a.withdraw(100);
    }
}
