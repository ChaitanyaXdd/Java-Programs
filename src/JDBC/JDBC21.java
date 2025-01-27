import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC21 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            if (conn == null){
                System.out.println("Connection failed.");
            }
            else {
                System.out.println("Connection successful.");
                st = conn.createStatement();
                rs = st.executeQuery("select * from student");

                rs.next();
                int rno = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println("Roll No: " + rno + " Name: " + name);
                rs.close();
                st.close();
                conn.close();
                System.out.println("Connection closed.");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
