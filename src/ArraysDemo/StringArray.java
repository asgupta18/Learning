package ArraysDemo;

public class StringArray {
    public static void main(String[] args) {
        String strr[] = new String[5];
        strr[0] = "Ashish";
        strr[1] = "Gupta";
        strr[2] = "Shreya";
        strr[3] = "Akshaya";
        strr[4] = "Aradhya";

        int l = strr.length;  //length is instance variable
       // System.out.println("Length = "+l);
        System.out.println("Length = "+strr.length);

        for(int i=0;i<strr.length ;i++)
        {
            System.out.println(strr[i]);
        }

    }
}
