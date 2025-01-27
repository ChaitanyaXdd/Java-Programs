import java.sql.*;
import java.util.Scanner;
public class JDBC22 {
    public static void main(String[] args) {

          Connection con = null;
          Statement stmt = null;
          String fname;
          try {
              System.out.println("program is Starting...");
              Class.forName("oracle.jdbc.driver.OracleDriver");
              con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Manager");
              System.out.println("Connection Established.");
              stmt=con.createStatement();
              Scanner s=new Scanner(System.in);
              System.out.println("Enter the flight id ");
              int f_id=s.nextInt();
              System.out.println("Enter the flight Name ");
              fname=s.next();
              System.out.println("Enter the flight seats ");
              int fseats=s.nextInt();
              String sql= "Update Flight1 set flight_name='"+fname+"',flight_seats="+fseats+" Where flight_id="+f_id;
              System.out.println("Updating the value into table");
              int rows=stmt.executeUpdate(sql);
              System.out.println("No of rows updated "+rows);
              stmt.close();
              con.close();
          } catch(SQLException se) {
              System.out.println("Exception is "+se.getMessage());
          } catch(Exception e) {
              System.out.println("Exception is "+e.getMessage());
          }
    }
}
