import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
import java.util.stream.Collectors;

class stream_peek_method
{
    public static void main(String args[])
    {
        List<Double> ls= Arrays.asList(52.36,547.23,85.3,524.32, 524.30);
        Stream<Double> str= ls.stream();
        str.peek(System.out::println).collect(Collectors.toList());
    }
}