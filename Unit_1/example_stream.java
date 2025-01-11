import java.util.*;
import java.util.stream.*;


class example_stream
{
    public static void main(String args[])
    {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(7);
        arr.add(4);
        arr.add(5);
        arr.add(1);
        arr.add(1);
        arr.add(2);

        //there are many more methods in stream for manipulating the data.

        System.out.print(arr);
        System.out.println();
        Stream<Integer> str= arr.stream();
        str=str.distinct().sorted();         // it first distinct the element and then sort. we can do seperately also, as stream comes under Collection
        str.forEach(s -> System.out.print(s +" "));
        

    }
}