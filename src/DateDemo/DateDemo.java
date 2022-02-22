package DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println();

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        String datestr = sd.format(date);
        System.out.println(datestr);

        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        String datestr1 = sd1.format(date);
        System.out.println(datestr1);

        SimpleDateFormat sd2 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        String datestr2 = sd2.format(date);
        System.out.println(datestr2);

        SimpleDateFormat sd3 = new SimpleDateFormat("dd-MM-yyyy | E | hh:mm");
        String datestr3 = sd3.format(date);
        System.out.println(datestr3);

        SimpleDateFormat sd4 = new SimpleDateFormat(" hh:mm:ss");
        String datestr4 = sd4.format(date);
        System.out.println(datestr4);



    }
}
