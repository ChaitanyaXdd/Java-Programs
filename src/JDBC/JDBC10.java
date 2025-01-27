import java.sql.*;
import java.util.Scanner;


public class JDBC10 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null,ps1 = null,ps2 = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        try {
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            if (conn == null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");
//                ps = conn.prepareStatement("create table employee(id int(10),name varchar(20),salary int(10))");
//                ps.execute();
//                System.out.println("Table created.");
                ps = conn.prepareStatement("insert into employee values (?,?,?)");
                System.out.println("Enter the id: ");
                int id = sc.nextInt();
                System.out.println("Enter the name: ");
                String n = sc.next();
                System.out.println("Enter the salary: ");
                int sal = sc.nextInt();
                ps.setInt(1,id);
                ps.setString(2,n);
                ps.setInt(3,sal);
                int count = ps.executeUpdate();
                System.out.println(count + " Record inserted.");

                ps1 = conn.prepareStatement("delete from employee where id = ?");
                System.out.println("Enter the id: ");
                int i = sc.nextInt();
                ps1.setInt(1,i);
                int c = ps1.executeUpdate();
                System.out.println(c + " Record Deleted.");

                ps2 = conn.prepareStatement("select * from employee where id = ? and name = ?");
                System.out.println("Enter id: ");
                int id1 = sc.nextInt();
                System.out.println("Enter name: ");
                String nm1 = sc.next();
                ps2.setInt(1,id1);
                ps2.setString(2,nm1);
                rs = ps2.executeQuery();
                while (rs.next())
                {
                    System.out.println( "Id: " + rs.getInt(1 ) + " Name: " + rs.getString(2) + " Salary: " + rs.getInt(3));
                }

                ps.close();
                ps1.close();
                rs.close();
                conn.close();

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
