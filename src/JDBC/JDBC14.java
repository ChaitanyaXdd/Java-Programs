// April 2018 Q3
import java.sql.*;

public class JDBC14 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null,ps1 = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        DatabaseMetaData dbmd = null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/exam", "root", "");
            if (conn == null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");
                ps = conn.prepareStatement("select * from stud");
                rs = ps.executeQuery();
                while (rs.next())
                {
                    System.out.println("No : " + rs.getInt(1) + "Name: " + rs.getString(2) + "Marks: " + rs.getInt(3));
                }
                rsmd = rs.getMetaData();
                System.out.println("Columns:  " + rsmd.getColumnCount());
                System.out.println("Column Names: " + rsmd.getColumnName(1) + " | " + rsmd.getColumnName(2) + " | " + rsmd.getColumnName(3));
                System.out.println("Column Type: " + rsmd.getColumnTypeName(1) + " | " + rsmd.getColumnTypeName(2) + " | " + rsmd.getColumnTypeName(3));
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
