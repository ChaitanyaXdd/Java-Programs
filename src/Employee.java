// Array of Objects
import java.util.Scanner;
public class Employee {

    int e_id;
    String e_name;
    int salary;

    public  void accept_Data()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id: ");
        e_id = sc.nextInt();
        System.out.println("Enter the name of the employee: ");
        e_name = sc.next();
        System.out.println("Enter the salary of the employee: ");
        salary = sc.nextInt();
    }

    public void display_Data()
    {
        System.out.println("Id: " + e_id);
        System.out.println("Name: " + e_name );
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee[] e = new Employee[50];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int n = s.nextInt();

        for(int i = 0; i < n; i++)
        {
            e[i] = new Employee();
            e[i].accept_Data();
        }

        System.out.println("Employee Information: ");
        for (int i = 0; i < n; i++)
        {
            e[i].display_Data();
        }
    }
}
