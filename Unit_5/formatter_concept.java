import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class formatter_concept {
public static void main(String [] shruti){

    LocalDateTime now=LocalDateTime.now();
    System.out.println("Current date and time:- "+ now);
System.out.println(now.plusDays(20));
System.out.println(now.minusDays(5));

DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy mm:HH:ss");
String formatDateTime=now.format(format);
System.out.println("After formatting:- " +formatDateTime);
}
}