// Q8
import java.sql.*;
import java.util.Scanner;

public class JDBC33 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st1 = null,st2 = null,st3 = null;
        int ch;
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_sy_mca","root","");
            if (conn == null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");
                do {
                    System.out.println("1.Insert Records");
                    System.out.println("2.Delete Records");
                    System.out.println("3.Update Records");
                    System.out.println("4.Exit");
                    System.out.println("Enter your choice: ");
                    ch = sc.nextInt();
                    switch (ch)
                    {
                        case 1:
                            st1 = conn.createStatement();
                            System.out.println("Enter the id: ");
                            int id = sc.nextInt();
                            System.out.println("Enter the first name: ");
                            String name = sc.next();
                            System.out.println("Enter the phone: ");
                            String phone = sc.next();
                            System.out.println("Enter the email: ");
                            String em = sc.next();
                            int result = st1.executeUpdate("insert into student values("+ id + ",'" + name + "','" + phone + "','" + em + "')");
                            System.out.println("Record inserted.");
                            break;
                        case 2:
                            st2 = conn.createStatement();
                            System.out.println("Enter the student id: ");
                            int no = sc.nextInt();
                            int cnt = st2.executeUpdate("delete from student where student_id = " + no);
                            System.out.println("Record Deleted");
                            break;
                        case 3:
                            st3 = conn.createStatement();
                            System.out.println("Enter the new phone number: ");
                            String ph1 = sc.next();
                            System.out.println("Enter student id: ");
                            int id1 = sc.nextInt();
                            int cnt1 = st3.executeUpdate("update student set phone ='" + ph1 + "' where student_id = " + id1 );
                            System.out.println("Record Updated");
                            break;
                        case 4:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Enter the correct choice.");
                            break;
                    }
                }
                while (ch != 4);
                st1.close();
                st2.close();
                st3.close();
                conn.close();
            }
        }
        catch (SQLException se){
            System.out.println(se.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
