public class Recursion3 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int num)
    {
        if (num == 5) // Base Condition
        {
            System.out.println(5);
            return;
        }
        System.out.println(num);
        print(num + 1);
    }
}
