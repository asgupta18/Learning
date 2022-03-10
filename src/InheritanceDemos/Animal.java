package InheritanceDemos;

public class Animal {
    void eat()
    {
        System.out.println("Animal Eat");
    }
}
class Dog extends Animal
{
 void bark()
 {
     System.out.println("Dog.bark");
 }
}

class BabyDog extends Dog
{
    void weeps()
    {
        System.out.println("BabyDog.weep");
    }
}

//Multiple Level Inheritance

class TestInheritance{
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.bark();
        d.eat();

        BabyDog bd = new BabyDog();
        bd.weeps();
        bd.bark();
        bd.eat();
    }
}