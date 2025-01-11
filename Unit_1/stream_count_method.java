import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

class stream_count_method
{
    public static void main(String args[])
    {
        List<Integer> ls= Arrays.asList(6,2,3,8,9,7,7,3,9);
        Stream<Integer> str= ls.stream();
        long count= str.filter(e-> e%2!=0).distinct().count();
        System.out.println(count);
        
    }
}