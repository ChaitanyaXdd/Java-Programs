import java.sql.Connection;
import java.sql.*;
import java.util.Scanner;

public class JDBC23 {
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
            else {
                System.out.println("Connection successful.");
                st = conn.createStatement();

                System.out.println("Enter the flight id: ");
                int f_id = sc.nextInt();
                System.out.println("Enter the flight name: ");
                String f_name = sc.next();
                System.out.println("Enter the flight seats: ");
                int f_seat = sc.nextInt();

                int result = st.executeUpdate("insert into flight values ("+ f_id +",'" + f_name + "'," + f_seat+")");
                System.out.println("Record inserted.");
                st.close();
                conn.close();
            }
        }
        catch (SQLException se){
            System.out.println("Exception is: " + se.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception is: " + e.getMessage());
        }
    }
}
