// ResultSetMetaData
import java.sql.*;

public class JDBC12 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;

        try {
            // Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            if (conn == null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");
//                ps = conn.prepareStatement("create table donor(d_id int(10),dname varchar(20),d_city varchar(20),primary key(d_id))");
//                ps.execute();
//                System.out.println("Table created");
                ps = conn.prepareStatement("select * from donor");
                rs = ps.executeQuery();
                while (rs.next())
                {
                    System.out.println("Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " City: " + rs.getString(3));
                }
                  rsmd = rs.getMetaData();
                  System.out.println("Total number of columns:  " + rsmd.getColumnCount());
                  System.out.println("Column Names: " + rsmd.getColumnName(1) + " | " + rsmd.getColumnName(2) + " | " + rsmd.getColumnName(3));
                  System.out.println("Column Type: " + rsmd.getColumnTypeName(1) + " | " + rsmd.getColumnTypeName(2) + " | " + rsmd.getColumnTypeName(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
