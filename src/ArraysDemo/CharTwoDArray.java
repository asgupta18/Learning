package ArraysDemo;

public class CharTwoDArray {
    public static void main(String[] args) {
        char[][] ch = {
                {'a','b','c'},
                {'@','#','&'},
                {'j','k','l'},
                {'a','s','d'},
                {'m','n','l'},
        };
        for(int i=0;i<ch.length;i++)
        {
            for(int j =0;j<ch[0].length;j++)
            {
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
    }
}
