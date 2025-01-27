import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class JDBC35 {
    public static void main(String[] args) {
        Connection conn = null;
        try
        {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_sy_mca","root","");
            if(conn == null){
                System.out.println("Connection failed");
            }
            else{
                CallableStatement stmt = conn.prepareCall("(call AddFlight(?,?,?)");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the flight id: ");
                int fid = sc.nextInt();
                System.out.println("Enter flight name: ");
                String fname = sc.next();
                System.out.println("Enter the flight seats");
                int fseats = sc.nextInt();
                stmt.setInt(1,fid);
                stmt.setString(2,fname);
                stmt.setInt(3,fseats);
                stmt.execute();
                System.out.println("Procedure completed successfully");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
