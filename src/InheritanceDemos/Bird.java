package InheritanceDemos;

public class Bird {
    void fly()
    {
        System.out.println("FLY");
    }
}

class Sparrow extends Bird{
    void sparrowColor()
    {
        System.out.println("YELLOW");
    }
}

class Crow extends Bird{
    void crowColor()
    {
        System.out.println("BLACK");
    }

}

//Hierarchical Inheritance

class TestInheritance1 {
    public static void main(String[] args) {
        Bird b= new Bird();
        b.fly();

        Sparrow s = new Sparrow();
        s.fly();
        s.sparrowColor();

        Crow c = new Crow();
        c.fly();
        c.crowColor();

    }

}
