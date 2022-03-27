package InheritanceDemos.SuperDemo;

public class SuperDemo1 {
    int salary = 20;
}

class SuperDemo11 extends SuperDemo1 {
    int salary = 200;

    void display() {
        System.out.println(super.salary);
    }

    public static void main(String[] args) {
        SuperDemo11 sd11 = new SuperDemo11();
        sd11.display();

    }
}



