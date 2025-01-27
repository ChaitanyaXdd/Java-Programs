// Q3
import java.sql.*;
import java.util.Scanner;

public class JDBC26 {
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
            else{
                System.out.println("Connection successful.");

                ps = conn.prepareStatement("insert into student values(?,?,?,?)");

                System.out.println("Enter the student id: ");
                int id = sc.nextInt();
                System.out.println("Enter the first name: ");
                String fname = sc.next();
                System.out.println("Enter the phone: ");
                String ph = sc.next();
                System.out.println("Enter the email: ");
                String em = sc.next();
                ps.setInt(1,id);
                ps.setString(2,fname);
                ps.setString(3,ph);
                ps.setString(4,em);
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
