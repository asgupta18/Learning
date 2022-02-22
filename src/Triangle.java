public class Triangle {
    public static void main(String[] args) {
        int a=30;
        int b = 60;
        int c = 60;
        // Equilateral / Scalene / Right angled / Isosceles Triangle

        if(a+b+c==180 && a>0 && b>0 && c>0)
        {
            if (a == b && b == c)
                System.out.println("Equilateral");
            if (a != b && b != c && c != a)
                System.out.println("Scalene");
            if (a == 90 || b == 90 || c == 90)
                System.out.println("Right angle");
            if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b))
                System.out.println("Isosceles");
        }
        else
            System.out.println("Not a Triangle");


    }
}
