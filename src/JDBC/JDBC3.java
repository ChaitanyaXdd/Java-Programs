import java.sql.*;

class Student
{
    int roll_no;
    String student_name;
}
class StudentDAO
{
    public Student getStudent(int roll_no)
    {
        Student s = new Student();
        s.roll_no = roll_no;
        try {
            String query = "select student_name from student where roll_no= "+roll_no;
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name = rs.getString(1);
            s.student_name = name;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return s;
    }
}
public class JDBC3 {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        Student s1 = dao.getStudent(12);
        System.out.println(s1.student_name);

    }
}
