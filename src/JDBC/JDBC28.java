import java.sql.*;
import java.util.Scanner;

public class JDBC28 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_sy_mca","root","");
            if(conn == null){
                System.out.println("Connection failed.");
            }
            else{
                System.out.println("Connection successful.");

                st = conn.createStatement();
                System.out.println("Enter the id: ");
                int id = sc.nextInt();
                int result = st.executeUpdate("delete from student where student_id = " + id);
                System.out.println("Record Deleted.");
                st.close();
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
