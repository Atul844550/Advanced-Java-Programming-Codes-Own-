import java.time.*;

class localdate {

    public static void main(String args[])
    {
        LocalDate date = LocalDate.now();
        System.out.println("today's date is:"+ date);
        LocalDate yesterday = date.minusDays(1);
        System.out.println("yesterday's date is:" + yesterday);
        LocalDate tomorrow = date.plusDays(1);
        System.out.println("tomorrow date is:" + tomorrow);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.isLeapYear());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.plusMonths(5));


        LocalDate date1  = LocalDate.of(2015, 4, 20);
        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.lengthOfYear());
        System.out.println(date1.lengthOfMonth());
        System.out.println(date1.getDayOfYear());

        String str= "2024-07-14";
        LocalDate id = LocalDate.parse(str);
        System.out.println("string method" + id);
    
    
    }
    
}
