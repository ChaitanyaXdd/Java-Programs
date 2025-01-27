public class Recursion5 {
    public static void main(String[] args) {
        System.out.println(fact(5));

    }
    static int fact(int num)
    {
        if (num == 0 || num == 1)
        {
            return 1;
        }
        return num * fact(num - 1);
    }
}
