import java.sql.*;
import java.util.Scanner;
public class JDBC34 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null,ps1 = null,ps3 = null,ps4 = null,ps2 = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);
        int ch;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_sy_mca","root","");
            if (conn == null){
                System.out.println("Connection failed.");
            }
            else{
                System.out.println("Connection successful");
                do {
                    System.out.println("1.Insert Records");
                    System.out.println("2.Delete Records");
                    System.out.println("3.Read Records");
                    System.out.println("4.Update Records");
                    System.out.println("5.Update All Records");
                    System.out.println("6.Exit");
                    System.out.println("Enter your choice: ");
                    ch = sc.nextInt();
                    switch (ch){

                        case 1:
                        System.out.println("Enter the id: ");
                        String id = sc.next();
                        System.out.println("Enter the first name: ");
                        String nm = sc.next();
                        System.out.println("Enter the phone: ");
                        String ph = sc.next();
                        ps = conn.prepareStatement("insert into authors values(?,?,?)");
                        ps.setString(1, id);
                        ps.setString(2, nm);
                        ps.setString(3, ph);
                        int row = ps.executeUpdate();
                        System.out.println("Record inserted.");
                        break;

                        case 2:
                        ps1 = conn.prepareStatement("delete from authors where author_id = ?");
                        System.out.println("Enter the id: ");
                        String id1 = sc.next();
                        ps1.setString(1, id1);
                        int row1 = ps1.executeUpdate();
                        System.out.println("Record Deleted.");
                        break;

                        case 3:
                        ps3 = conn.prepareStatement("select * from authors");
                        rs = ps3.executeQuery();
                        while (rs.next()) {
                            System.out.println("Id: " + rs.getString(1) + " Name: " + rs.getString(2) + " Phone: " + rs.getString(3));
                        }
                        rs.close();
                        break;

                        case 4:
                        ps4 = conn.prepareStatement("update authors set phone = ? where author_id = ?");
                        System.out.println("Enter the id: ");
                        String id3 = sc.next();
                        System.out.println("Enter the new phone number: ");
                        String ph1 = sc.next();
                        ps4.setString(1, ph1);
                        ps4.setString(2, id3);
                        int r2 = ps4.executeUpdate();
                        System.out.println("Record updated.");
                        break;

                        case 5:
                        ps2 = conn.prepareStatement("update authors set phone = ?");
                        System.out.println("Enter the new number: ");
                        String ph3 = sc.next();
                        ps2.setString(1, ph3);
                        int r3 = ps2.executeUpdate();
                        System.out.println("Record updated.");
                        break;

                        case 6:
                            System.exit(0);
                        default:
                            System.out.println("Enter the correct choice: ");
                            break;
                    }
                }while (ch!=6);

                ps.close();
                ps1.close();
                ps2.close();
                ps3.close();
                ps4.close();
                conn.close();

            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
