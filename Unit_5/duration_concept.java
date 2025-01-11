import java.time.*;
import java.time.temporal.ChronoUnit;

class duration_concept {

    public static void main(String args[])
    {
    Duration d=Duration.between(LocalTime.NOON,LocalTime.MAX);
System.out.println(d.get(ChronoUnit.SECONDS));
System.out.println(d.isNegative());
Duration d1=Duration.between(LocalTime.MAX,LocalTime.NOON);
System.out.println(d1.get(ChronoUnit.SECONDS));

System.out.println(d1.isNegative());

System.out.println(d1.getSeconds());
System.out.println(d1.getNano());
Duration d3=d1.minus(d1);
System.out.println(d3.getSeconds());
Duration d4=d1.plus(d1);
System.out.println(d4.getSeconds());
}

}
    

