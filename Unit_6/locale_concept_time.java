import java.util.*;
import java.text.DateFormat;

class locale_concept_time {

    static void time(Locale locale)
    {
        DateFormat formater = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
        Date currentDate =new Date();
        String time = formater.format(currentDate);
        System.out.println(time+ "in locale" + locale);
    }

    public static void main(String args[])
    {
        time(Locale.UK);
        time(Locale.FRANCE);
        time(Locale.US);
        time(Locale.JAPAN);

    }
    
}
