public class Marks {
    public static void main(String[] args) {
        int marks = 65;

        if (marks < 40)
            System.out.println("Result is fail");
        else if (marks >= 40 && marks < 50)
            System.out.println("Result is Third Class");

        else if (marks >=50 && marks < 60)
            System.out.print("Result is Second Class");

        else if (marks >=60 && marks <75)
            System.out.print("Result is First Class");

        else if (marks >=75)
            System.out.print("Result is Distinction");
    }
}
