
// in this we had created a folder manually in d drive then from java NIO we are deleting the folder.
 
 



import java.nio.file.*;
import java.io.*;

class NIO_deleteFile {

    public static void main(String args[]) throws IOException
    {
        Path p1= Paths.get("D:\\NIO\\KE092.txt");
        Files.delete(p1);
        System.out.println("file deleted");
    }
    
}


