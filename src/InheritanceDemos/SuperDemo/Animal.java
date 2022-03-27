package InheritanceDemos.SuperDemo;

import InheritanceDemos.Animal1;
import org.w3c.dom.ranges.DocumentRange;

public class Animal {
    Animal()
    {
        System.out.println("Inside Animal constructor");
    }

    Animal(int legs)
    {
        System.out.println("Legs = "+legs);
        System.out.println("Inside Animal constructor");
    }
    String color = "Black";

    void printColor()
    {
        System.out.println("Color ="+color);
    }

    public void property()
    {

        System.out.println("Animal Property");
    }
}

class Dog extends Animal {
    Dog()
    {
        super(4);
        System.out.println("Inside Dog constructor");
    }

    String color = "White";

    void printColor()
    {
        property();
        super.property();

        System.out.println("Color ="+color);
        System.out.println("Color ="+super.color);
    }
    public void property()
    {

        System.out.println("==================Dog Property");
    }
}

class TestInheritance{
    public static void main(String[] args) {
        Dog d = new Dog();

        //System.out.println("Color X "+d.color);
        d.printColor();
    }
}
