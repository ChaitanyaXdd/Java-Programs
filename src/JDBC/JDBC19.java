import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.function.Predicate;

public class JDBC19 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null,ps1 = null,ps2 = null,ps3 = null;
        ResultSet rs = null;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        try {
           // Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            if(conn == null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful");
//                ps = conn.prepareStatement("create table teachers(tno int(10),tname varchar(20),subject varchar (20),primary key(tno))");
//                ps.execute();
//                System.out.println("Table created.");
                System.out.println("Enter how many records: ");
                int records = sc.nextInt();
                for (int i = 0; i < records; i++)
                {
                    ps = conn.prepareStatement("insert into teachers values(?,?,?)");
                    System.out.println("Enter the id: ");
                    int id = sc.nextInt();
                    System.out.println("Enter the name: ");
                    String nm = sc.next();
                    System.out.println("Enter the subject name: ");
                    String subjname = sc.next();
                    ps.setInt(1,id);
                    ps.setString(2,nm);
                    ps.setString(3,subjname);
                    ps.executeUpdate();
                    count++;
                }
                System.out.println(count + " Records inserted.");
                ps1 = conn.prepareStatement("delete from teachers where tno=?");
                System.out.println("Enter the tno: ");
                int tno = sc.nextInt();
                ps1.setInt(1,tno);
                int cnt = ps1.executeUpdate();
                System.out.println(cnt + "Record Deleted");
                ps2 = conn.prepareStatement("update teachers set subject = ? where tname = ?");
                System.out.println("Enter the new subject: ");
                String s = sc.next();
                System.out.println("Enter the name: ");
                String nm = sc.next();
                ps2.setString(1,s);
                ps2.setString(2,nm);
                int c = ps2.executeUpdate();
                System.out.println(c  + "Record updated");
                ps3 = conn.prepareStatement("select * from student where tno = ?");
                System.out.println("Enter the tno: ");
                int t = sc.nextInt();
                ps3.setInt(1,t);
               rs =  ps3.executeQuery();
               if (rs.next())
               {
                   System.out.println( "Tno:  " +  rs.getInt(1) + "Name: " + rs.getString(2) + " Subject: " + rs.getString(3));
               }

                ps.close();
               ps1.close();
               ps2.close();
               ps3.close();
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
