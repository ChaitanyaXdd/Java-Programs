import java.util.Scanner;

class College1
{
    int cno;
    String cname,caddr;
}
 class Departments extends College1 {
    int dno;
    String dname;
    Scanner sc  = new Scanner(System.in);
    void accept()
    {
        System.out.println("Enter the number of college: ");
        cno = sc.nextInt();
        System.out.println("Enter the name of college: ");
        cname = sc.next();
        System.out.println("Enter the address of college: ");
        caddr = sc.next();
        System.out.println("Enter the department number: ");
        dno = sc.nextInt();
        System.out.println("Enter the name of department: ");
        dname = sc.next();
    }
    void display()
    {
        System.out.println("College Number: " + cno);
        System.out.println("College Name: " + cname);
        System.out.println("College Address: " + caddr);
        System.out.println("Department Number: " + dno);
        System.out.println("Department Name: " + dname);
    }
}

public class Inheritance3
{
    public static void main(String[] args) {
        Departments d = new Departments();
        d.accept();
        d.display();
    }
}
