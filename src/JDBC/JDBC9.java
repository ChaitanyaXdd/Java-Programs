import java.sql.*;
import java.util.Scanner;

public class JDBC9 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null,ps1 = null,ps2 = null,ps3 = null,ps4 = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;
         int ch;
        Scanner sc = new Scanner(System.in);
        try {
           // Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            if (conn == null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");
                do {
                    System.out.println("1.View Records");
                    System.out.println("2.Insert Records");
                    System.out.println("3.Delete Records");
                    System.out.println("4.Update Records");
                    System.out.println("5.Search Records");
                    System.out.println("6.Exit");
                    System.out.println("Enter your choice: ");
                    ch = sc.nextInt();
                    switch (ch)
                    {
                        case 1:
                            ps = conn.prepareStatement("select * from students");
                            rs = ps.executeQuery();
                            while (rs.next())
                            {
                                System.out.println("Roll no: " + rs.getInt(1) + " Name: " + rs.getString(2) + " City: " + rs.getString(3));
                            }
                            rsmd = rs.getMetaData();
                            // Number of columns
                            System.out.println("Columns: " + rsmd.getColumnCount());
                            // Column Name
                            System.out.println("Name: " + rsmd.getColumnName(1));
                            // Column Type
                            System.out.println("Column Type: " + rsmd.getColumnTypeName(1));
                            break;
                        case 2:
                            ps1 = conn.prepareStatement("insert into students values (?,?,?)");
                            System.out.println("Enter the id: ");
                            int id = sc.nextInt();
                            System.out.println("Enter the name: ");
                            String name = sc.next();
                            System.out.println("Enter the city: ");
                            String city = sc.next();
                            ps1.setInt(1,id);
                            ps1.setString(2,name);
                            ps1.setString(3,city);
                            int count = ps1.executeUpdate();
                            System.out.println(count + " Record inserted.");
                            break;
                        case 3:
                            ps2 = conn.prepareStatement("delete from students where rno = ?");
                            System.out.println("Enter the roll no: ");
                            int no = sc.nextInt();
                            ps2.setInt(1,no);
                            int cnt = ps2.executeUpdate();
                            System.out.println(cnt + " Record Deleted");
                            break;
                        case 4:
                            ps3 = conn.prepareStatement("update students set sname = ? where rno = ? ");
                            System.out.println("Enter the new name: ");
                            String nm1 = sc.next();
                            System.out.println("Enter roll no: ");
                            int id1 = sc.nextInt();
                            ps3.setString(1,nm1);
                            ps3.setInt(2,id1);
                            int cnt1 = ps3.executeUpdate();
                            System.out.println(cnt1 + " Record Updated");
                            break;
                        case 5:
                            ps4 = conn.prepareStatement("select * from students where rno = ?");
                            System.out.println("Enter the roll no: ");
                            int rollno = sc.nextInt();
                            ps4.setInt(1,rollno);
                            rs = ps4.executeQuery();
                            if(rs.next())
                            {
                                System.out.println("Roll no: " + rs.getInt(1) + " Name: " + rs.getString(2) + " City: " + rs.getString(3));
                            }
                            else
                            {
                                System.out.println("Student not found.");
                            }
                            break;
                        case 6:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Enter the correct choice.");
                            break;
                    }
                }
                while (ch != 6);
                ps.close();
                ps1.close();
                ps2.close();
                ps3.close();
                ps4.close();
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
