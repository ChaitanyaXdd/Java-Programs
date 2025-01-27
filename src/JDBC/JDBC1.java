import java.sql.*;
public class JDBC1 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {

//             Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
             if (conn == null)
             {
                 System.out.println("Connection failed.");
             }
             else
             {
                 System.out.println("Connection successful.");
                 st = conn.createStatement();
                 int count = st.executeUpdate("insert into persons values (8,'Abc')");
                 System.out.println(count + " Record inserted successfully.");
                 rs = st.executeQuery("select * from persons");
                 while (rs.next())
                 {
                     System.out.println("Person Id: " + rs.getInt(1));
                     System.out.println("Person Name: " + rs.getString(2));
                 }
                 st.close();
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
