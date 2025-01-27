// write a function that takes a number and prints it
// print first 5 numbers: 1 2 3 4 5
public class Recursion2 {
    public static void main(String[] args) {
        print1(1);

    }
    static void print1(int num)
    {
        System.out.println(num);
        print2(2);
    }
    static void print2(int num)
    {
        System.out.println(num);
        print3(3);
    }
    static void print3(int num)
    {
        System.out.println(num);
        print4(4);
    }
    static void print4(int num)
    {
        System.out.println(num);
        print5(5);
    }
    static void print5(int num)
    {
        System.out.println(num);
    }

}
