
class Abc
{

}
public class ExceptionHandling2 {
    public static void main(String[] args) {
        Abc a = new Abc();
        //Number Format Exception
//        int i = Integer.parseInt("Dog");
//        System.out.println(i);
//        int j = Integer.parseInt("2");
//        System.out.println(j);

        try
        {
            int i = Integer.parseInt("Dog");
            System.out.println(i);
            System.out.println("Dog");
        }
        catch (RuntimeException e)
        {
            System.out.println("Cannot convert Dog to int ");
            System.out.println(e);
        }

//        catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e)
//        {
//
//        }



        System.out.println("End of program");
    }
}
