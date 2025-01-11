import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

class stream_toArray_method
{
    public static void main(String args[])
    {
    List<String> ls= Arrays.asList("2", "5", "kdn", "dhnc", "sbn");
    Object a[]= ls.stream().toArray();
    System.out.println(a.length);
    System.out.println("element present are:");

    for(Object i:a)
    {
        System.out.println(i);
    }

    }
    
    
}