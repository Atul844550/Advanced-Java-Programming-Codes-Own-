@FunctionalInterface
interface hotel
{
    public void order();
}
class lambda_default
{
    public static void main(String args[])
    {
        String item= "Tea";

        hotel h1= ()-> {
            System.out.println("the order is :"+ item);
        };
        h1.order();
    }
}