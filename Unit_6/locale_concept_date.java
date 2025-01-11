import java.util.*;
import java.text.DateFormat;

class locale_concept_date {

    static void date(Locale locale)
    {
        DateFormat formater = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        Date currentDate =new Date();
        String date = formater.format(currentDate);
        System.out.println(date+ "in locale" + locale);
    }

    public static void main(String args[])
    {
        date(Locale.UK);
        date(Locale.FRANCE);
        date(Locale.US);
        date(Locale.JAPAN);

    }
    
}
