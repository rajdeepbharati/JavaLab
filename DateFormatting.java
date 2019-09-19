import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatting {
    public static void main(String[] args) {
        String[] dateStrings = { "07/11/99", "12/25/07", "04/03/19", "05/13/20" };
        for (String string : dateStrings) {
            try {
                DateFormat originalFormat = new SimpleDateFormat("MM/dd/yy", Locale.ENGLISH);
                DateFormat targetFormat = new SimpleDateFormat("MMMM dd, yyyy");
                Date date = originalFormat.parse(string);
                String formattedDate = targetFormat.format(date);
                System.out.println(formattedDate);
            } catch (Exception e) {
            }
        }
    }
}
