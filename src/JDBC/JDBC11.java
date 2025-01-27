// April 2017 Q3
import java.sql.*; // First Step
import java.util.Scanner;

public class JDBC11 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null,ps1 = null;
        ResultSet rs = null;
        int cnt = 0;
     Scanner sc = new Scanner(System.in);
        try {
            //Class.forName("com.mysql.jdbc.Driver"); Step 2
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root",""); //Step 3
            if (conn == null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");
                ps = conn.prepareStatement("insert into employee values(?,?,?,?)"); //Step 4
                System.out.println("Enter how many records: ");
                int num = sc.nextInt();
                for (int i = 1; i <= num; i++)
                {
                    System.out.println("Enter the id: ");
                    int id = sc.nextInt();
                    System.out.println("Enter the name: ");
                    String nm = sc.next();
                    System.out.println("Enter the salary: ");
                    int sal = sc.nextInt();
                    System.out.println("Enter the department name: ");
                    String dept = sc.next();
                    ps.setInt(1,id);
                    ps.setString(2,nm);
                    ps.setInt(3,sal);
                    ps.setString(4,dept);
                    ps.executeUpdate();
                    cnt++;
                }
                System.out.println(cnt + " Records Inserted");
                ps1 = conn.prepareStatement("select * from employee");
                rs = ps1.executeQuery();
                while (rs.next())
                {
                    System.out.println("Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Salary: " + rs.getInt(3) + " Department: " + rs.getString(4));
                }
                ps.close();
                ps1.close();
                rs.close();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
