import java.time.*;
import java.time.temporal.Temporal;

class period_concept
{
    public static void main(String args[])
    {

        Period period = Period.ofDays(15);
        Temporal temp = period.addTo(LocalDate.now());
        System.out.println(temp);
        Period p = Period.of(2024, 02, 01);
        System.out.println(p.toString());
        Period p1= Period.ofMonths(10);
        Period p2= p1.minus(Period.ofMonths(2));
        System.out.println(p2);
        Period p3 = p1.plus(Period.ofMonths(3));
        System.out.println(p3);

    }
}