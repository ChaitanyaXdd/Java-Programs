import java.util.Scanner;

abstract class Staff
{
    protected int id;
    protected String nm;
    Staff()
    {

    }
    Staff(int id,String nm)
    {
        this.id = id;
        this.nm = nm;
    }
    public abstract void display();
}
class OfficeStaff extends Staff
{
    String dept;
    public OfficeStaff(int id,String nm,String dept)
    {
        super(id,nm);
        this.dept = dept;
    }
    @Override
    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + nm);
        System.out.println("Department: " + dept);
    }

}
public class AbstractDemo6 {
    public static void main(String[] args) {

        int n = 3;
        OfficeStaff st[] = new OfficeStaff[n];
        st[0] = new OfficeStaff(01,"Ash","IT");
        st[1] = new OfficeStaff(02,"Bob","CS");
        st[2] = new OfficeStaff(03,"Steph","AI");

        for (int i = 0; i < n; i++)
        {
            st[i].display();
        }

    }
}
