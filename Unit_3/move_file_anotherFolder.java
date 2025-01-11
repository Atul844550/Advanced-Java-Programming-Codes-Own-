import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.*;



public class move_file_anotherFolder {

    public static void main(String args[])
    {
        try
        {
            System.out.println("started time: " + new Date());

            Path source = Paths.get("D:\\ATUL\\second1.doc");
            Path destination = Paths.get("D:\\NIO\\second.doc");
            Files.copy(source, destination);

            System.out.println("completion time:" + new Date());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
