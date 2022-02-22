package StringDemos;

public class StringSplitDemo {
    public static void main(String[] args) {
        String str = "My name is Ashish";
        String[] strArr = str.split(" ");
        System.out.println(" "+strArr.length);

        for(int i=0; i< strArr.length;i++)
        {
            System.out.println(strArr[i]);
            //System.out.println();
        }
    }
}
