class NewClass {
    public void display(){
        System.out.println("Displaying from Base Class");
    }
}
class DerivedClass extends NewClass{
    @Override
    public void display() {
        System.out.println("Displaying from Derived Class.");
    }
    @Deprecated
    public int sum(int a,int b){
        return a + b;
    }
}
public class Annotations1 {
    @SuppressWarnings("deprecated")
    public static void main(String[] args) {
        DerivedClass d = new DerivedClass();
        d.display();

        System.out.println(d.sum(4,5));
    }
}
