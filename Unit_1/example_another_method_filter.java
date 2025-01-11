import java.util.*;
import java.util.stream.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class example_another_method_filter
{
public static void main(String shruti[])
{
List<Integer> ls=Arrays.asList(4,5,6,1,9,34,98,6,8);
ls.stream()
.map(x->x*x*x)
.collect(Collectors.toList())
.forEach(System.out::println);
}
}