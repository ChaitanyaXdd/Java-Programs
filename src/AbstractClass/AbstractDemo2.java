abstract class Car
{
     abstract public void drive();

    public void playMusic()
    {
        System.out.println("Play Music");
    }
}

class Fronx extends Car
{
    @Override
    public void drive() {
        System.out.println("Drive");
    }

}
public class AbstractDemo2 {
    public static void main(String[] args) {
//    Car c = new Car();
        Fronx f = new Fronx();
        f.drive();
        f.playMusic();

//        Car c = new Car()
//        {
//          public void drive()
//          {
//              System.out.println("Driving");
//          }
//        };

    }
}
