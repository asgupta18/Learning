package InheritanceDemos.PolymorphismDemos;

public class TVShowroom {
    void volume()
    {
        System.out.println("TVShowroom volume");
    }

    void channels()
    {
        System.out.println("TVShowroom channels");
    }

    void settings()
    {
        System.out.println("TVShowroom settings");
    }
}

class Samsung extends  TVShowroom {

    void volume()
    {
        System.out.println("Samsang volume");
    }

    void channels()
    {
        System.out.println("Samsang channels");
    }

    void settings()
    {
        System.out.println("Samsang settings");
    }
}

class LG extends  TVShowroom {

    void volume()
    {
        System.out.println("LG volume");
    }

    void channels()
    {
        System.out.println("LG channels");
    }

    void settings()
    {
        System.out.println("LG settings");
    }
}


class Onida extends  TVShowroom {

    void volume()
    {
        System.out.println("Onida volume");
    }

    void channels()
    {
        System.out.println("Onida channels");
    }

    void settings()
    {
        System.out.println("Onida settings");
    }
}

class TestInheritance
{
    public static void main(String[] args) {

        TVShowroom tv = new Samsung(); // upcasting
        tv.channels();
        tv.volume();
        tv.settings();

        TVShowroom tv1 = new Onida();
        tv1.channels();
        tv1.volume();
        tv1.settings();
    }
}
