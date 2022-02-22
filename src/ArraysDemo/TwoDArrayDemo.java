package ArraysDemo;

public class TwoDArrayDemo {
    public static void main(String[] args) {
        int [][] a =  new int[5][3];

        a[0][0]= 78;
        a[0][1]= 22;
        a[0][2]= 33;

        a[1][0]= 34;
        a[1][1]= 58;
        a[1][2]= 28;

        a[2][0]= 88;
        a[2][1]= 73;
        a[2][2]= 71;

        a[3][0]= 76;
        a[3][1]= 68;
        a[3][2]= 45;

        a[4][0]= 34;
        a[4][1]= 88;
        a[4][2]= 99;

        System.out.println("rows = "+a.length);   //rows
        System.out.println("Columns = "+a[0].length);  //columns

        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                System.out.print(" - "+a[i][j]);
            }
            System.out.println();
        }



    }
}
