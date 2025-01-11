import java.nio.file.*;

import java.util.*;


class copyContent {

    public static void main(String args[])
    {
        try
        {
            Path p1= Paths.get("D:\\ATUL\\second1.doc");
           // Path p2= Files.createFile(p1);
            Path p3= Paths.get("D:\\ATUL\\first.txt");
            List<String> data= Files.readAllLines(p3);
            Files.write(p1, data);
            System.out.println("data written in the file");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    
}

