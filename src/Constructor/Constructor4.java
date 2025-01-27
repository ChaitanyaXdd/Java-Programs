class Employee2
{
    int id;
    String name,department;
    float salary;
    static int count = 0;

    Employee2()
    {
        id = 0;
        name = " ";
        department = " ";
        salary = 0;
    }

    Employee2(int id,String name,String department,float salary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        count++;
    }

    public void display()
    {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

}
public class Constructor4 {
    public static void main(String[] args) {

        Employee2 e = new Employee2(1,"Abc","IT",100000);
        e.display();
        System.out.println("Number of objects created so far: " + Employee2.count);

        Employee2 e1 = new Employee2(2,"Pqr","CS",10000);
        e.display();
        System.out.println("Number of objects created so far: " + Employee2.count);
    }
}
