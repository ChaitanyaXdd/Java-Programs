import java.sql.*;
import java.util.Scanner;

// Dynamic Input
public class JDBC6 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            if(conn == null)
            {
                System.out.println("Connection failed");
            }
            else
            {
                System.out.println("Connection successful.");
                ps = conn.prepareStatement("insert into persons values (?,?)");
                System.out.println("Enter the id: ");
                int id = sc.nextInt();
                System.out.println("Enter the name: ");
                String name = sc.next();
                ps.setInt(1,id);
                ps.setString(2,name);
                int count = ps.executeUpdate();
                System.out.println(count + " Record inserted.");
                conn.close();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
