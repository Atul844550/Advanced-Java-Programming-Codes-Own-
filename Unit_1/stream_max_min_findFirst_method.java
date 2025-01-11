import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

class stream_max_min_findFirst_method
{
    public static void main(String args[])
    {
        Integer arr[]={3,47,5,21,85,9,101, 102};                                            //{3,4,5,6,7,8,9,10};
        Stream<Integer> str= Arrays.stream(arr);      // another way to passing all the arr elements in stream object.
     //  Optional<Integer> opt= str.filter(e-> e%2==0).min((a,b)-> a.compareTo(b));
        Optional<Integer> opt= str.filter(e-> e%2!=0).findFirst();
        opt.ifPresent(System.out::println);

        if(opt.isPresent())
        {
            System.out.println(opt.get());
        }
        else{
            System.out.println("no data found");
        }
    }

}