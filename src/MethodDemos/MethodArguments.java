package MethodDemos;

import org.apache.commons.io.filefilter.TrueFileFilter;

public class MethodArguments {
    int x;

    void display()
    {
        System.out.println("This is display");
    }

    void intSingle(int x)
    {
        System.out.println(""+x);
    }

    void intMultiple(int x,int y,int z)
    {
        System.out.println(""+x+y+z);
    }

    void intVarious(int x,double x1, float y,boolean z)
    {
        System.out.println(" "+x);
        System.out.println(" "+x1);
        System.out.println(" "+y);
        System.out.println(" "+z);
    }

    void mySingleArray(int Arr[]){
        for(int i=0;i<Arr.length;i++)
        System.out.println(" "+Arr[i]);
    }

    void mySingleCharArray(char Arr[]){
        for(int i=0;i<Arr.length;i++)
            System.out.println(" "+Arr[i]);
    }

    void mySingleString(String str[]){
            for(int i=0;i<str.length;i++)
            System.out.println(" "+str[i]);
    }

   /* void mySingleString1(String str1){
        for(int i=0;i<.length;i++)
            System.out.println(" "+str1[i]);
    }*/

    public static void main(String[] args) {
        MethodArguments ob = new MethodArguments();
        ob.display();

        int y =10;
        int [] a= {87,32,4,2,11,32,90};
        ob.intSingle(y);
        ob.intMultiple(5,6,7);
        ob.mySingleArray(a);
        ob.intVarious(300,3.3, 12.12f,true);

        char[] arr = {'a','b','c','d','e'};
        ob.mySingleCharArray(arr);

        String[] str = {"Selenium Automation is going on"};
        //String[] stArr = str.split(" ");
        ob.mySingleString(str);

        /*String str1 = "Hey baby you are so lovely";
        String[] stArr = str1.split("");
        ob.mySingleString1(String[] stArr);*/
    }

}
