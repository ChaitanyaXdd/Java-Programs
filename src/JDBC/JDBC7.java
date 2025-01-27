import java.sql.*;
import java.util.Scanner;

public class JDBC7 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        try {
           // Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            if (conn == null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");
                ps = conn.prepareStatement("update persons set PersonName = ? where PersonID = ? ");
                System.out.println("Enter the new  name: ");
                String name = sc.next();
                System.out.println("Enter the id: ");
                int id = sc.nextInt();

                ps.setString(1,name);
                ps.setInt(2,id);
                int count = ps.executeUpdate();
                System.out.println(count + " Record updated");
                rs = ps.executeQuery("select * from persons");
                while (rs.next())
                {
                    System.out.println("Id: "+rs.getInt(1));
                    System.out.println("Name: "+rs.getString(2));
                }
                conn.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
