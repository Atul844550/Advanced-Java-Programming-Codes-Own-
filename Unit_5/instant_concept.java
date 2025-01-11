import java.time.*;

class instant_concept
{
public static void main(String args[])
{
Instant ist=Instant.now();
System.out.println(ist);
Instant ist1=Instant.parse("2024-04-13T14:58:30.00Z");
ist1=ist1.minus(Duration.ofDays(10));
System.out.println(ist1);
ist1=ist1.plus(Duration.ofDays(5));
System.out.println(ist1);
}
}