import java.nio.file.*;

import java.util.*;
import java.nio.file.StandardOpenOption;


public class appending_data {

    public static void main(String[] args) {

        try
        {
            Path p1= Paths.get("D:\\ATUL\\second1.doc");
            String data = "\n i am learning advanced ";
            Files.write(p1, data.getBytes(), StandardOpenOption.APPEND);
// StandardOpenOption.APPEND, which is an enum constant indicating that the data should be appended to the existing content 
// of the file. If the file does not exist, a new file will be created.

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("data has been added in the file.");
        }

        
        
    }
    
}
