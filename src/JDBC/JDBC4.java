import java.sql.*;

// Create table

public class JDBC4 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
           // Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            if(conn == null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");
                st = conn.createStatement();

                st.executeUpdate("create table cities(cId int(10),cName varchar(20))");
                System.out.println("Table created.");
                st.close();
                conn.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
