import java.util.*;
import java.util.stream.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class example_filter_map2
{
public static void main(String shruti[])
{
List<String> ls=Arrays.asList("India","CANADA","australia","america");
ls.stream()
//.map(String::toLowerCase).sorted()
//.map(String::toUpperCase)
.map(str->str.length())
//.collect(Collectors.toList())
.forEach(System.out::println);
}
}