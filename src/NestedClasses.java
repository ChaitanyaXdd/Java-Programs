class OuterClass {

    int i = 9;
    public void display1()
    {
        System.out.println("Outer Class");
    }
    class InnerClass
    {

        public void display()
        {
            System.out.println("Inner Class");
        }
    }

    static class StaticNestedClass
    {
        public void display3()
        {
            System.out.println("Static Nested Class");
        }
    }

}

public class NestedClasses {
    public static void main(String[] args) {

        OuterClass o = new OuterClass();
        o.display1();
        OuterClass.InnerClass i = o.new InnerClass();
        i.display();

        OuterClass.StaticNestedClass sn = new OuterClass.StaticNestedClass();
        sn.display3();

    }
}
