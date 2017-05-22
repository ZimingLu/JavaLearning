import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentTime {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        String s = sdf.format(cal.getTime());
        System.out.println(s);
    }

}