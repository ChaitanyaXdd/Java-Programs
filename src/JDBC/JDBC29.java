// Q6
import java.sql.*;
import java.util.Scanner;
public class JDBC29 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        Scanner sc = new Scanner(System.in);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_sy_mca","root","");
            if (conn == null){
                System.out.println("Connection failed.");
            }
            else{
                System.out.println("Connection successful.");

                st = conn.createStatement();
                System.out.println("Enter the id of the record to be updated: ");
                int id = sc.nextInt();
                System.out.println("Enter the updated phone number: ");
                String ph = sc.next();
                int result = st.executeUpdate("update student set phone ='" + ph + "' where student_id = " + id );
                System.out.println("Record updated.");
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
