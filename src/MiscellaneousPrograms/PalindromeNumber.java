package MiscellaneousPrograms;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        String str = "100STS001";
        String reverse = "";

        int l = str.length();
        for ( int i = l - 1; i >= 0; i-- )
            reverse = reverse + str.charAt(i);
        if (str.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}
