// in this we had created a file inside the folder   in d drive with the help of java NIO  and checking if file  exit or not if not  exit then it will create the new file in d drive.it will not create the copy of that file.


import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class createNewFile {

    public static void main(String args[])
    {
        try{

            Path p1= Paths.get("D:\\ATUL\\first.txt");

            if(Files.exists(p1))
            {
                System.out.println("file already exist");
            }
            else{

                Path p2= Files.createFile(p1);
                System.out.println("file  created" + p2.toString());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            // e.printStackTrace();
        }
    }
    
}

