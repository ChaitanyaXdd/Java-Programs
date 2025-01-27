class College2
{
    int cno;
    String cname;
    String caddr;

    College2()
    {
        System.out.println("Default parent class constructor");
    }
    College2(int cno,String cname,String caddr)
    {
        this.cno = cno;
        this.cname = cname;
        this.caddr = caddr;
    }
}

class  Department2 extends College2
{
    int dno;
    String dname;
    Department2()
    {
        System.out.println("Default Subclass constructor");
    }
    Department2(int dno,String dname)
    {
        super(1,"MIT","Pune");
        this.dno = dno;
        this.dname = dname;
    }
    public void display()
    {
        System.out.println("College no: " + cno);
        System.out.println("College name: " + cname);
        System.out.println("College Address: " + caddr);
        System.out.println("Department Number: " + dno);
        System.out.println("Department Name: " + dname);
    }
}
public class Inheritance4 {
    public static void main(String[] args) {
        Department2 d = new Department2(1,"CS");
        d.display();
    }
}
