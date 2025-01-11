import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;

class homeproduct
{
    String name;
    int quantity;
    float cost;

    homeproduct(String name, int quantity, float cost)
    {
        this.name=name;
        this.quantity= quantity;
        this.cost=cost;
    }
}
class stream_reduce_method
{
    public static void main(String args[])
    {
        ArrayList<homeproduct> arr= new ArrayList<>();
        arr.add(new homeproduct("ac",1, 25000 ));
        arr.add(new homeproduct("wm",2, 50000 ));
        arr.add(new homeproduct("car",1, 1500000 ));
        arr.add(new homeproduct("mv",2, 90000 ));
        arr.add(new homeproduct("fridge",1, 450000 ));

        Stream<homeproduct> str= arr.stream();
        float budget= str.map(product-> product.cost).reduce(0.0f, (sum, cost)-> sum+cost);  // first argument will be entity as float as we take sum=0 for initilize
        System.out.println("the total budget is:" + budget);
    }
}