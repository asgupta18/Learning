package StringDemos;

import java.util.Locale;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "this is a java";
        System.out.println("Lenght of String1 "+str.length());
        System.out.println("String1 Char at index 3 ="+str.charAt(3));

        String str1 = "hi i am here";
        System.out.println("Lenght of String2 "+str1.length());
        System.out.println("String2 Char at index 2 ="+str1.charAt(2));

        String str2 = "where are you";
        System.out.println("Lenght of String3 "+str2.length());
        System.out.println("String3 Char at index 0 ="+str2.charAt(0));

        String str3 = "this is a demo";
        System.out.println("Lenght of String4 "+str3.length());
        System.out.println("String4 Char at index 5 ="+str3.charAt(5));

        String str4 = "core java";
        System.out.println("Lenght of String4 "+str4.length());
        System.out.println("String4 Char at index 6 ="+str4.charAt(6));
        System.out.println("UPPER CASE = "+str4.toUpperCase());
        System.out.println("lower case = "+str4.toLowerCase());

    }

}
