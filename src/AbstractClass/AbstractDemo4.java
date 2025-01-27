import java.util.Scanner;

abstract class Order
{
    int id;
    String desc;
    Scanner sc = new Scanner(System.in);
   abstract public void accept();
   abstract public void display();
}

class PurchaseOrder extends Order
{
   String cnm,vnm;
   @Override
   public void accept()
   {
       System.out.println("Enter id: ");
       id = sc.nextInt();
       System.out.println("Enter description: ");
       desc = sc.next();
       System.out.println("Enter the name of customer: ");
       cnm = sc.next();
       System.out.println("Enter the name of vendor: ");
       vnm = sc.next();
   }
   @Override
   public void display()
   {
       System.out.println("Id: " + id);
       System.out.println("Description: " + desc);
       System.out.println("Customer Name: " + cnm);
       System.out.println("Vendor Name: " + vnm);
   }
}

class SalesOrder extends Order
{
    String cnm,vnm;
    @Override
    public void accept()
    {
        System.out.println("Enter id: ");
        id = sc.nextInt();
        System.out.println("Enter description: ");
        desc = sc.next();
        System.out.println("Enter the name of customer: ");
        cnm = sc.next();
        System.out.println("Enter the name of vendor: ");
        vnm = sc.next();
    }
    public void display()
    {
        System.out.println("Id: " + id);
        System.out.println("Description: " + desc);
        System.out.println("Customer Name: " + cnm);
        System.out.println("Vendor Name: " + vnm);
    }
}

public class AbstractDemo4 {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
//        System.out.println("1.Purchase Order\n2.Sales Order\n3.Exit");
//        System.out.println("Enter your choice: ");
//        int n = sc.nextInt();
//
//        switch (n)
//        {
//            case 1:
//                PurchaseOrder p[] = new PurchaseOrder[3];
//                for (int i = 0; i < 3; i++)
//                {
//                    p[i] = new PurchaseOrder();
//                    p[i].accept();
//                    System.out.println("Object Created.");
//                }
//                for (int i = 0; i < 3; i++) {
//                    System.out.println("Object is displayed.");
//                    p[i].display();
//                }
//                break;
//            case 2:
//                SalesOrder s[] = new SalesOrder[3];
//                for (int i = 0; i < 3; i++)
//                {
//                    s[i] = new SalesOrder();
//                    s[i].accept();
//                    System.out.println("Object Created.");
//                }
//                for (int i = 0; i < 3; i++) {
//                    System.out.println("Object is displayed.");
//                    s[i].display();
//                }
//                break;
//            case 3:
//                System.exit(0);
//                break;
//            default:
//                System.out.println("Choose a correct option.");
//                break;
//        }

        PurchaseOrder p1 = new PurchaseOrder();
        p1.accept();
        p1.display();

        SalesOrder s1 = new SalesOrder();
        s1.accept();
        s1.display();
    }
}
