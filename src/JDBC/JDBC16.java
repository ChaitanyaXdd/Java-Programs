
import java.sql.*;
import java.util.Scanner;
public class JDBC16 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null,ps1 = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            if (conn == null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");
                ps = conn.prepareStatement("insert into student values(?,?)");
                System.out.println("Enter the roll number: ");
                int rno = sc.nextInt();
                System.out.println("Enter the name:");
                String nm = sc.next();
                ps.setInt(1,rno);
                ps.setString(2,nm);
                int count = ps.executeUpdate();
                System.out.println(count + " Record inserted");
                ps1 = conn.prepareStatement("select * from student");
                rs = ps1.executeQuery();
                while (rs.next())
                {
                    System.out.println("Roll Number: " + rs.getInt(1) + " Name: " + rs.getString(2));
                }
                ps.close();
                ps1.close();
                rs.close();
                conn.close();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
