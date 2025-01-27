
public class ExceptionHandling9 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        }
        catch(Exception e)
        {
            System.out.println("Generic Exception catch.");
            System.out.println(e);
        }
            /* This catch is never reached because
            ArithmeticException is a subclass of Exception. */
//        / ERROR – unreachable
//        catch(ArithmeticException e) {
//            System.out.println("This is never reached.");
//        }
    }
}
