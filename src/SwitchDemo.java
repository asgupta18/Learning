public class SwitchDemo {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c;

        String operation = "div";

        switch(operation)
        {
            case "add" : c = a + b;
            System.out.println("Addition " +c);
            break;

            case "sub" : c = a - b;
                System.out.println("Subtraction " +c);
                break;

            case "mult" : c = a * b;
                System.out.println("Multiplication " +c);
                break;
            case "div" : c = a / b;
                System.out.println("Division " +c);
                break;
        }

    }
}
