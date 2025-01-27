// Q2
import java.sql.*;
import java.util.Scanner;

public class JDBC25 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_sy_mca","root","");
            if (conn == null){
                System.out.println("Connection failed.");
            }
            else {
                System.out.println("Connection successful.");

                st = conn.createStatement();

                System.out.println("Enter the id: ");
                int id = sc.nextInt();
                System.out.println("Enter the first name: ");
                String fname = sc.next();
                System.out.println("Enter the phone number: ");
                String ph = sc.next();
                System.out.println("Enter the email: ");
                String em = sc.next();

                int result = st.executeUpdate("insert into student values("+ id + ",'" + fname + "','" + ph + "','" + em + "')");
                System.out.println("Record inserted");
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
