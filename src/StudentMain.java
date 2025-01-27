import java.util.Scanner;
import Student.*;

public class StudentMain {
    public static void main(String[] args) {

        String nm, clas;

        int roll;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll no: ");
        roll = sc.nextInt();
        System.out.print("Enter Name: ");
        nm = sc.next();
        System.out.print("Enter class: ");
        clas= sc.next();

        int m1,m2,m3,m4,m5,m6;
        System.out.print("Enter 6 sub mark: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();
        m6 = sc.nextInt();

        StudentPer s = new  StudentPer(roll,clas,m1,m2,m3,m4,m5,m6);
        s.percentage1();
        s.display();

    }
}
