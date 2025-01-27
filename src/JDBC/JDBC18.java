import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC18 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            if (conn == null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");
                ps = conn.prepareStatement("create table student1(rno int(10),sname varchar(20),per int (3),primary key(rno))");
                ps.execute();
                System.out.println("Table created");
                ps.close();
                conn.close();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
