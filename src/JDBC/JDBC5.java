//Prepared Statement

import java.sql.*;

public class JDBC5 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
       // Class.forName("com.mysql.jdbc.Driver");
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            if (conn==null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");
                ps = conn.prepareStatement("insert into persons values (?,?)");
                ps.setInt(1,4);
                ps.setString(2,"Renuka");
                int count =  ps.executeUpdate();
                System.out.println(count + " Record inserted.");
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
