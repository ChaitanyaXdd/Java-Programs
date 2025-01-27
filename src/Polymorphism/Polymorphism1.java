class Animal1
{
    public void eat()
    {
        System.out.println("Eating");
    }
    public void makeNoise1()
    {
        System.out.println("Noise");
    }
}
class Dog1 extends Animal1
{
    String breed;
    public String getName(String breed)
    {
        return breed;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    @Override
    public void makeNoise1() {
        System.out.println("Barking");
    }
}
class Cat1 extends Animal1
{
    @Override
    public void makeNoise1() {
        System.out.println("Meow");
    }
}
public class Polymorphism1 {
    public static void main(String[] args) {
        Animal1 myAnimal = new Animal1();
        myAnimal.eat();

        Dog1 myDog = new Dog1();
        myDog.eat();
        myDog.makeNoise1();

        Cat1 c = new Cat1();
        c.makeNoise1();
    }
}
