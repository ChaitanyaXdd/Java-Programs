import java.sql.*;
import java.util.Scanner;

public class JDBC8 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null, ps1 = null, ps2 = null,ps3 = null,ps4 = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);


        try {
//            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
            if (conn == null)
            {
                System.out.println("Connection failed.");
            }
            else
            {
                System.out.println("Connection successful.");
                // Create table
//                ps = conn.prepareStatement("create table students(rno int(10),sname varchar(20),scity varchar(20))");
//                ps.execute();
//                System.out.println("Table created");

                //Insert records dynamically
                ps1 = conn.prepareStatement("insert into students values(?,?,?)");
                System.out.println("Enter the roll number: ");
                int rno = sc.nextInt();
                System.out.println("Enter the name: ");
                String sname = sc.next();
                System.out.println("Enter the city: ");
                String scity = sc.next();
                ps1.setInt(1,rno);
                ps1.setString(2,sname);
                ps1.setString(3,scity);
                int count = ps1.executeUpdate();
                System.out.println(count + " Record inserted.");

                // Update records
                ps3 = conn.prepareStatement("update students set sname = ? where rno = ?");
                System.out.println("Enter the new name: ");
                String nm = sc.next();
                System.out.println("Enter the id: ");
                int id = sc.nextInt();
                ps3.setString(1,nm);
                ps3.setInt(2,id);
                int result = ps3.executeUpdate();
                System.out.println(result + " Record updated.");

                // Delete records (DDL and DML)
//                String query = "delete from students where rno = 4";
//                st = conn.createStatement();
//                int r = st.executeUpdate(query);
//                System.out.println("Record Deleted");
                ps4 = conn.prepareStatement("delete from students where rno = ?");
                System.out.println("Enter the id number to be deleted:");
                int id1 = sc.nextInt();
                ps4.setInt(1,id1);
                int del = ps4.executeUpdate();
                System.out.println(del + " Record Deleted");

                // Display records
                ps2 = conn.prepareStatement("select * from students");
                rs = ps2.executeQuery();
                while (rs.next())
                {
                    System.out.println("Roll No: " + rs.getInt(1) + " Student Name: " + rs.getString(2) + " City: " + rs.getString(3));
                }

                ps1.close();
                ps2.close();
                ps3.close();
                ps4.close();
                rs.close();
                conn.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
