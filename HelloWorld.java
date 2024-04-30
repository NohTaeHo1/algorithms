import java.time.LocalDate;
import java.util.Calendar;

public class HelloWorld {
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();

        String test = "Hello World!";
        String test1 = test.substring(2, 4);
        System.out.println(test1);

        System.out.println(now.get(Calendar.MONTH) +1);
        System.out.println(now.get(Calendar.DAY_OF_MONTH));

        LocalDate nowLocalDate = LocalDate.now();

        System.out.println(nowLocalDate.getMonthValue()+nowLocalDate.getDayOfMonth());
        System.out.println(now.get(Calendar.MONTH));

    }
}
