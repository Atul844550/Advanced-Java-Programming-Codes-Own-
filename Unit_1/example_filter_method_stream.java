import java.util.Arrays;
import java.util.*;
import java.util.stream.*;


class example_filter_method_stream
{
    public static void main(String arrs[])
    {
        List<String> ls=  Arrays.asList("pink", "yellow", "black", "white", "magenta", "purple", "cyan");
        System.out.print(ls);

        Stream<String> str= ls.stream();
        Stream<String> str1= str.filter(str2 -> str2.length()>=5);
        str1.forEach(s -> System.out.println(s));
    }
}