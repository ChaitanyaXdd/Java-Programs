import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC20 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null,ps1 = null;
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
//                System.out.println("Connection successful.");
//                ps = conn.prepareStatement("create table bank(acc_no int(10),acc_name varchar(20),bal int (5),primary key(acc_no))");
//                ps.execute();
//                System.out.println("Table created.");
                ps = conn.prepareStatement("insert into bank values(101,'Chaitanya',2000)");
                ps.executeUpdate();
                System.out.println("Record inserted");
//                ps1 = conn.prepareStatement("update bank set bal = ")

            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
