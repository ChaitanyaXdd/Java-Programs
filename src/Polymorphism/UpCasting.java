class Animal
{
    String name;
    public void makeNoise()
    {
        System.out.println("Making Noise");
    }
}
class Dog extends Animal
{
    @Override
    public void makeNoise() {
        System.out.println("Barking");
    }
    public void colour()
    {
        System.out.println("White");
    }


}
public class UpCasting {
    public static void main(String[] args) {

        //Upcasting
        Animal myAnimal = new Dog();
        myAnimal.makeNoise();

        doAnimalStuff(myAnimal);

        //Upcasting
       // Animal myAnimal1 = (Animal)new Dog();

    }
    public static void doAnimalStuff(Animal a)
    {
        a.makeNoise();
    }
}
