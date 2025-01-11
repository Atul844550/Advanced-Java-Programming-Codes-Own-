import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

class etp {

    public static void main(String args[])
    {
        List<Integer> l= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        

       
              int m= l.stream().filter(e -> e%2!=0).mapToInt(Integer:: intValue).sum();  //odd
              int n= l.stream().filter(e -> e%2==0).mapToInt(Integer:: intValue).sum();   // even

              System.out.println(m);
              System.out.println(n);

            int maximum= l.stream().mapToInt(Integer:: intValue).max().getAsInt();
            System.out.println(maximum);

            int minimum= l.stream().mapToInt(Integer:: intValue).min().getAsInt();
            System.out.println(minimum);


     

       
         

    }
    
}
