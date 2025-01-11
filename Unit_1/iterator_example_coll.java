import java.util.*;

class employee
{
    String name;
    int empid;

    employee(String name, int empid)
    {
        this.name=name;
        this.empid=empid;
    }

    public String toString() // toString method is predefined method the way we like to use. and it @overridden method.
    {
        return "employee name is :" + name+ " and empid is :" + empid;
    }

    
}
class iterator_example_coll
{
    public static void main(String args[])
    {
        ArrayList<employee> arr= new ArrayList<>();
        arr.add(new employee("Atul", 5241));
        arr.add(new employee("Aman", 5242));
        arr.add(new employee("akash", 5243));
        arr.add(new employee("sumit", 5244));

        Iterator<employee> itr=  arr.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("by using the lambda expression");

        arr.forEach(x -> System.out.println(x));

       

     


    }
}