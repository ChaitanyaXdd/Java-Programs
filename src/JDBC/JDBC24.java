import java.sql.*;
import java.util.Scanner;

public class JDBC24 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_sy_mca","root","");
            if (conn == null){
                System.out.println("Connection failed.");
            }
            else {
                System.out.println("Connection successful.");

                ps = conn.prepareStatement("insert into flight values(?,?,?)");
                System.out.println("Enter the flight id: ");
                int f_id = sc.nextInt();
                System.out.println("Enter the flight name");
                String f_name = sc.next();
                System.out.println("Enter the flight seats: ");
                int f_seats = sc.nextInt();
                ps.setInt(1,f_id);
                ps.setString(2,f_name);
                ps.setInt(3,f_seats);
                int count = ps.executeUpdate();
                System.out.println("Record inserted.");
                ps.close();
                conn.close();
            }
        }
        catch (SQLException se){
            System.out.println(se.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
