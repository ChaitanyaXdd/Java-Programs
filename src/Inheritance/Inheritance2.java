//Single Inheritance and super keyword

class College
{
    String clg;
    public College()
    {
        clg = " ";
    }

    public College(String clg)
    {
        this.clg = clg;
    }
}

 class Department1 extends College{

    String dpt;

    public Department1()
    {
        dpt = " ";
    }

    public Department1(String  clg,String dpt)
    {
        super(clg);
        this.dpt = dpt;
    }

    public void display()
    {
        System.out.println("College Name: " + clg);
        System.out.println("Department Name: " + dpt);
    }

}

public class Inheritance2
{
    public static void main(String[] args) {
        Department1 d = new Department1("ABC","IT");
        d.display();
    }
}
