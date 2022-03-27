package ArraysDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        String str = "Ashish is learning Java";
        int len = str.length();
        System.out.println("String lenght = "+str.length());
        System.out.println(str.charAt(3));

        System.out.println("Upper Case= "+str.toLowerCase());
        System.out.println("Upper Case= "+str.toUpperCase());
        System.out.println("Substring = "+str.substring(3,20));

    }
}
