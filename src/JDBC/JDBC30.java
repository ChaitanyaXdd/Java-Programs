// Q7
import java.sql.*;
import java.util.Scanner;

public class JDBC30 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_sy_mca","root","");
            if(conn == null){
                System.out.println("Connection failed.");
            }
            else {
                System.out.println("Connection successful.");

                ps = conn.prepareStatement("update student set phone = ? where student_id = ?");
                System.out.println("Enter the id: ");
                int id = sc.nextInt();
                System.out.println("Enter the phone number to be updated: ");
                String ph = sc.next();
                ps.setString(1,ph);
                ps.setInt(2,id);
                int count = ps.executeUpdate();
                System.out.println("Record Updated.");

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
