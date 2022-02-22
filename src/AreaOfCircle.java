import java.util.Scanner;
import java.lang.Math;

public class AreaOfCircle {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter radius =");
        int radius = s.nextInt();       ;
        double pi = 22 /7;

        System.out.println("Area of circle "+pi * Math.pow(radius,2));

        /* float Area = pi * radius * radius;
        System.out.println("Area of circle "+pi * Math.pow(radius,2));

        float Ar = (22*radius*radius)/7; */
        //double Ar = pi * Math.pow(radius,2);

        //System.out.println("Area of Circle2 ="+Ar);

    }
}
