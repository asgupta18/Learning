package ArraysDemo;

public class IntArrayEvenOdd {
    public static void main(String[] args) {
        int[] a = {23, 24, 5, 6, 7, 8, 55, 66, 7};
        System.out.println("Length " + a.length);

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                System.out.println(a[i] + " Even");
            else
                System.out.println(a[i] + " Odd");
        }
    }
}
