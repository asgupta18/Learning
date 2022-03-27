package Loops;

public class Factorial {
    public static void main(String[] args) {

        //int n=5;
        int mult = 1;

        for(int i=5 ; i>=1 ; i--)
        {
            mult = mult * i;
        }

        System.out.println("loops.Factorial="+mult);
    }
}
