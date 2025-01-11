import java.util.*;
import java.util.stream.*;


class employee
{
    String name;
    String state;
    boolean marrital;

    employee(String name,String state, boolean marrital)
    {
        this.name=name;
        this.state=state;
        this.marrital=marrital;
    }
}

class example_groupby_partioningby_collector
{
    public static void main(String args[])
    {
        ArrayList<employee> al= new ArrayList<>();
        employee e1= new employee("dheeraj", "pu", true);
        al.add(e1);

        employee e2= new employee("dheeraj1", "pun", false);
        al.add(e2);

        employee e3= new employee("dheeraj2", "punj", true);
        al.add(e3);

        employee e4= new employee("dheeraj3", "punja", false);
        al.add(e4);

        employee e5= new employee("dheeraj4", "punjab", false);
        al.add(e5);

        // finding the employees state wise by groupingBy

        Map<String, List<employee>> mp= al.stream().collect(Collectors.groupingBy(e-> e.state));

        Set<String> keys = mp.keySet();
        for(String k: keys)
        {
            List<employee> l1= mp.get(k);
            System.out.println("employee from" + k);

            for(employee e:l1)
            {
                System.out.println(e.name+ "\t"+ e.state);
            }      
        }

        //use partioning based on maritial status

        Map<Boolean, List<employee>> mp1= al.stream().collect(Collectors.partitioningBy(e-> e.marrital));

        Set<Boolean> ks= mp1.keySet();
        for(Boolean k:ks)
        {
            if(k)
            {
                System.out.println("married employees are");

                List<employee> l5= mp1.get(k);
                for(employee e: l5)
                {
                    System.out.println(e.name+ "\t" + e.state);
                }
            }
            else{
                System.out.println("unmarried employee are");

                List<employee> l5= mp1.get(k);
                for(employee e: l5)
                {
                    System.out.println(e.name+ "\t" + e.state);
                }
            }

        }
    }
}


