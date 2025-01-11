import java.util.*;
import java.time.*;

class calender_concept {

    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int m = sc.nextInt();
    int y= sc.nextInt();
    LocalDate d= LocalDate.of(y, m, 8 );
    int v= d.getDayOfWeek().getValue();

    System.out.println("\tMon\tTue\tWed\tThu\tFri\tSat\tSun");

    for(int i=1; i<v; i++)
    {
        System.out.println("\t" +i);
    }

    for(int i=1; i<=d.lengthOfMonth(); i++)
    {
        System.out.println("\t" +i);
        v++;

        if((v-1)%7==0)
        {
            System.out.println();
        }
    }

    }

    
}
