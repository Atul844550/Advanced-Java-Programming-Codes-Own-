import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.io.*;

public class pipe_concept {

    public static void main(String args[])  throws IOException
    {
        Pipe pipe= Pipe.open();
        Pipe.SinkChannel sinkchannel = pipe.sink();
        String str= "atul soni advanced java programming";
        ByteBuffer bf= ByteBuffer.allocate(1024);
        bf.clear();
        bf.put(str.getBytes());
        bf.flip();

        while(bf.hasRemaining())
        {
            sinkchannel.write(bf);
        }

        Pipe.SourceChannel sourceChannel = pipe.source();
        bf= ByteBuffer.allocate(512);

        while(sourceChannel.read(bf)> 0)
        {
            bf.flip();
        }

        while(bf.hasRemaining())
        {
            char test = (char)bf.get();
            System.out.println(test);
        }















































    }
    
}
