public class InitBlock {
    //Constructor
    static  int x ;
    int y;
    InitBlock()
    {
        System.out.println("Constructor.");
    }

    // Static Block
    static
    {
        System.out.println("Static Block.");
    }

    //Init Block
     {
        System.out.println("Init Block.");
    }


    void method1()
    {
        System.out.println("Method 1.");
    }
    static void method2()
    {
        System.out.println("Static Method 2.");
    }
    public static void main(String[] args) {

        InitBlock i = new InitBlock();
        i.method1();
        InitBlock.method2();

    }
}
