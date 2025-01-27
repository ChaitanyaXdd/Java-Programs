class PQR
{
    static
    {
        System.out.println("In static block");
    }

    {
        System.out.println("In instance block");
    }
}
public class JDBC2 {
    public static void main(String[] args) {
//        PQR P = new PQR();

        try {
            Class.forName("abc");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
