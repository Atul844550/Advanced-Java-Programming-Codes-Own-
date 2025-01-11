// in this we had created a folder  in d drive with the help of java NIO and checking if folder exit or not if not exit then it will create the folder in d drive.


import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class createNewDirectory {

    public static void main(String args[])
    {
        try{

            Path p1= Paths.get("D:\\ATUL");

            if(Files.exists(p1))
            {
                System.out.println("directory already exist");
            }
            else{

                Path p2= Files.createDirectory(p1);
                System.out.println("directory created" + p2);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
