import java.util.*;
import java.util.stream.*;
class iterate_example
{

public static void main(String args[])
{
Stream.iterate(1,element->element+1)
.filter(element-> element %7==0).limit(10).forEach(System.out::println);
}
}