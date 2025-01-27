// April 2019 Q3
import java.sql.*;

import java.util.Scanner;

public class JDBC15 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null,ps1 = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        DatabaseMetaData dbmd = null;
        Scanner sc = new Scanner(System.in);
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
            if (conn == null) {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");
                ps = conn.prepareStatement("SELECT * FROM employee WHERE salary=(SELECT MAX(salary)) and department = ?");
                System.out.println("Enter the department: ");
                String dpt = sc.next();
                ps.setString(1,dpt);
                rs = ps.executeQuery();
                rs.next();
                System.out.println("ID : " + rs.getInt(1) + " Name: " + rs.getString(2) + " Salary: " + rs.getInt(3) + " Department: " + rs.getString(4));

            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
