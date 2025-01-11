// Creating folder with respect to the files extension which are already placed inside the folder.

import java.nio.file.*;
import java.util.stream.*;
import java.io.*;
class task
{
public static void main(String args[]) throws IOException
{

    Path p=Paths.get("D:\\ATUL");
System.out.println(p.getRoot());
try
{
Stream<Path> str=Files.list(p);
str.forEach(x->
{ String name=x.getFileName().toString();
String token[]=name.split("\\.");
String extension=token[token.length-1];
try{
//Path d=Paths.get(x.getParent()+"\\"+extension);
Path d=Paths.get(extension);
Files.createDirectory(d);
}
catch(Exception e){
System.out.println(e);
}
});
}
catch(Exception e)
{
e.printStackTrace();
}
}
}