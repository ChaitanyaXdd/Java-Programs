// Q9
import java.sql.*;
import java.util.Scanner;
public class JDBC31 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null,ps1 = null,ps2 = null,ps3 = null;
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
                            ps1 = conn.prepareStatement("insert into student values (?,?,?,?)");
                            System.out.println("Enter the id: ");
                            int id = sc.nextInt();
                            System.out.println("Enter the first name: ");
                            String name = sc.next();
                            System.out.println("Enter the phone: ");
                            String phone = sc.next();
                            System.out.println("Enter the email: ");
                            String em = sc.next();
                            ps1.setInt(1,id);
                            ps1.setString(2,name);
                            ps1.setString(3,phone);
                            ps1.setString(4,em);
                            int count = ps1.executeUpdate();
                            System.out.println(" Record inserted.");
                            break;
                        case 2:
                            ps2 = conn.prepareStatement("delete from students where student_id = ?");
                            System.out.println("Enter the student id: ");
                            int no = sc.nextInt();
                            ps2.setInt(1,no);
                            int cnt = ps2.executeUpdate();
                            System.out.println(cnt + " Record Deleted");
                            break;
                        case 3:
                            ps3 = conn.prepareStatement("update students set phone = ? where student_id = ? ");
                            System.out.println("Enter the new phone number: ");
                            String ph1 = sc.next();
                            System.out.println("Enter student id: ");
                            int id1 = sc.nextInt();
                            ps3.setString(1,ph1);
                            ps3.setInt(2,id1);
                            int cnt1 = ps3.executeUpdate();
                            System.out.println(" Record Updated");
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
                ps.close();
                ps1.close();
                ps2.close();
                ps3.close();
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
