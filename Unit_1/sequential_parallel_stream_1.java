import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class sequential_parallel_stream
{
String name;
int score;
sequential_parallel_stream(String name,int score){
this.name=name;
this.score=score;
}
public String getName()
{
return this.name;
}
public int getScore()
{
return this.score;
}
}
class sequential_parallel_stream_1
{
public static void main(String shruti[])
{
System.out.println("------Sequential stream-------");
IntStream r=IntStream.rangeClosed(1,10);
r.forEach(System.out::println);

System.out.println("------Parallel stream-------");
IntStream r1=IntStream.rangeClosed(1,10);
r1.parallel().forEach(System.out::println);

List<sequential_parallel_stream> s=Arrays.asList(
new sequential_parallel_stream("Shruti",78),
new sequential_parallel_stream("Neha",80),
new sequential_parallel_stream("Tushar",48),
new sequential_parallel_stream("Suraj",28),
new sequential_parallel_stream("Tejas",18),
new sequential_parallel_stream("Mohan",58)
);
System.out.println("------Sequential stream-------");
s.stream().filter(e->e.getScore()>50).limit(2)
.forEach(t->System.out.println(t.getName()+"\t"+t.getScore()));

System.out.println("------Parallel stream-------");
s.parallelStream().filter(e->e.getScore()>50).limit(2)
.forEach(t->System.out.println(t.getName()+"\t"+t.getScore()));

System.out.println("------Sequential to parallel stream-------");
s.stream().parallel().filter(e->e.getScore()>50)
.forEach(t->System.out.println(t.getName()+"\t"+t.getScore()));
}
}