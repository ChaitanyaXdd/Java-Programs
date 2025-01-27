import java.util.Scanner;

class Person
{
    String person_name,aadhar_no,pan_no;
//    int n = 9;
    Scanner sc = new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter the name of the person: ");
        person_name = sc.next();
        System.out.println("Enter the Aadhar Number: ");
        aadhar_no = sc.next();
        System.out.println("Enter the Pan Number: ");
        pan_no = sc.next();
    }
    public void display()
    {
        System.out.println("Name: " + person_name);
        System.out.println("Aadhar Number: " + aadhar_no);
        System.out.println("Pan Number: " + pan_no);
    }
}
public class ArrayOfObjects {
    public static void main(String[] args) {

    Person p[] = new Person[5];

    for(int i = 0; i < 5; i++)
    {
        p[i] = new Person();
        p[i].accept();
    }
    for (int i = 0; i < 5; i++)
    {
        p[i].display();
    }
    }
}
