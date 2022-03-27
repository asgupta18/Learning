package InheritanceDemos.PolymorphismDemos;

public class Animal {
    public void animalSound()
    {
        System.out.println("This is Animal Sound");
    }
}

class Dog extends Animal{
    public void dogSound()
    {
        System.out.println("This is Dog Sound : Bho Bho");
    }
}

class Pig extends Animal{
    public void pigSound()
    {
        System.out.println("This is Pig Sound : wee wee");
    }
}

class Main{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Pig myPig = new Pig();

        myAnimal.animalSound();
        myDog.dogSound();
        myPig.pigSound();

        myPig.animalSound();
        myDog.animalSound();

    }
}

