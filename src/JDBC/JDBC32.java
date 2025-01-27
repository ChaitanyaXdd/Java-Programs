import java.sql.*;
public class JDBC32 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_sy_mca","root","");
            if (conn == null){
                System.out.println("Connection failed.");
            }
            else{
                System.out.println("Connection successful");
                st = conn.createStatement();
                rs  = st.executeQuery("select * from student");
                while (rs.next())
                {
                    System.out.println("Student Id: " + rs.getInt(1) + " Student Name: " + rs.getString(2) + "Phone: " + rs.getString(3) + "Student Email: " + rs.getString(4));
                }
                rs.close();
                st.close();
                conn.close();
            }
        }
        catch (SQLException se){
            System.out.println(se.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
