import java.util.*;
import java.util.stream.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class example_filter_map
{
public static void main(String shruti[])
{
List<String> ls=Arrays.asList("India","CANADA","australia","america");
ls.stream()
.map(String::toLowerCase).sorted()
//.map(String::toUpperCase)
.collect(Collectors.toList())
.forEach(System.out::println);

//List<Integer> l=Arrays.asList(5, 4 , 7 , 52,58);
//l.stream().sorted().collect(Collectors.toList())
//.forEach(System.out::println);





}
}