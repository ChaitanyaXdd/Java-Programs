import java.sql.*;
import java.util.Scanner;

public class JDBC27 {
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
                ps = conn.prepareStatement("Delete from student where student_id = ?");
                System.out.println("Enter the id: ");
                int id = sc.nextInt();
                ps.setInt(1,id);
                int count = ps.executeUpdate();
                System.out.println("Record Deleted.");
                ps.close();
                conn.close();
            }
        }
        catch (SQLException se){
            System.out.println(se.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
