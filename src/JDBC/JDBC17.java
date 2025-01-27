import java.sql.*;

public class JDBC17 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
        int size = 0;
        try {
          //  Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            if (conn == null)
            {
                System.out.println("Connection failed");
            }
            else
            {
                System.out.println("Connection Successful");
                ps = conn.prepareStatement("select * from employee");
                rs = ps.executeQuery();
                while (rs.next())
                {
                    System.out.println("Id: " + rs.getInt(1) + " Name: " + rs.getString(2) + " Salary: " + rs.getInt(3) + " Department: " + rs.getString(4));
                }
                rsmd = rs.getMetaData();
                System.out.println("Number of records: ");
                if (rs!=null)
                {
                    rs.beforeFirst();
                    rs.last();
                    size = rs.getRow();
                }
                System.out.println("Total number of records in employee table: " + size);
                ps.close();
                rs.close();
                conn.close();
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
