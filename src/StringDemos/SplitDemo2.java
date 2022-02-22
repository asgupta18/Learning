package StringDemos;

public class SplitDemo2 {
    public static void main(String[] args) {
        String str = "He told that we have to stay together in order to escape";
        System.out.println("Lenght " + str.length());

        String[] strArr = str.split(" ");


        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].charAt(1) == 'o')
                System.out.println(strArr[i]);
        }
    }

    }



