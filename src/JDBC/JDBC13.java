// Database MetaData
import java.sql.*;
import java.util.Scanner;

public class JDBC13 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null,ps1 = null;
        ResultSet rs = null;
        DatabaseMetaData dbmd = null;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
            if (conn == null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");

                dbmd = conn.getMetaData();
                System.out.println("Driver Name: "+dbmd.getDriverName());
                System.out.println("Driver Version: "+dbmd.getDriverVersion());
                System.out.println("UserName: "+dbmd.getUserName());
                System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
                System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
