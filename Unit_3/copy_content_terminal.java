 // copy content from file to terminal.
 
 
 import java.nio.file.Files;
 import java.nio.file.Path;
 import java.nio.file.Paths;
 import java.util.List;

class copy_content_terminal {

    public static void main(String args[])
    {
        try
        {
            Path p1= Paths.get("D:\\ATUL\\second1.doc");
            List<String> data=Files.readAllLines(p1);

            for(String str: data)
            {
                System.out.println(str);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
