class Computer
{

}
class Laptop extends Computer
{

}
public class DynamicMethodDispatch2 {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        Computer obj = new Laptop();
    }
}
