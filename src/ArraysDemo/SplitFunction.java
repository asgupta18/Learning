package ArraysDemo;

public class SplitFunction {
    public static void main(String[] args) {

        String str = "He told that we have to stay together in order to escape";
        int len = str.length();

        String[] stArr = str.split(" ");

        for(int i = 0; i< stArr.length;i++)
        {
            String temp = stArr[i];
            int l = temp.length();
            if (stArr[i].charAt(1)=='o')
                System.out.println(stArr[i]);
        }

    }
}
