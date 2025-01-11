import java.util.*;
import java.time.*;
class zone_1 {
public static void main(String [] shruti)
{
Set <String> str = ZoneId.getAvailableZoneIds();
int i=1;
for(String s : str)
{
ZoneId z = ZoneId.of(s);
LocalDate d = LocalDate.now(z);
LocalTime t = LocalTime.now(z);
System.out.println( i + "\t" + z + "\t" + d + "\t" + t);
i++;
}

}
}