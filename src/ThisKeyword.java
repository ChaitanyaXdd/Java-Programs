//this keyword

class Department_Info
{
    int dept_no;
    String dept_name;
    int n = 9;

    Department_Info()
    {
        dept_no = 0;
        dept_name = " ";
    }
    Department_Info(int dept_no,String dept_name)
    {
        this.dept_no = dept_no;
        this.dept_name = dept_name;
    }
    Department_Info(int a,int b)
    {
//        this.dept_no = dept_no;
//        this.dept_name = dept_name;
         dept_no = 9;
         dept_name = "CS";
    }
    void display()
    {
        System.out.println("Department Number: " + dept_no);
        System.out.println("Department Name: " + dept_name);
    }
    
}

public class ThisKeyword {

    public static void main(String[] args) {

    Department_Info d = new Department_Info(1,2);

    d.display();

    Department_Info d1 = new Department_Info();
    d1.display();

    Department_Info d2 = new Department_Info(1,"IT");
    d2.display();

    }
}
