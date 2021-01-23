import java.time.LocalDate;
import java.util.Date;

/**
 * Created by natna on 4/26/2019.
 */
public class DateTime {

       public static void  main(String[] args) {
        Date date=new Date();
        System.out.println(date.getTime());
        LocalDate date1=LocalDate.now();
        System.out.println(date1);
        System.out.println(date1.plusDays(3));
        System.out.println(date1.plusYears(2).isLeapYear());
    }
}
