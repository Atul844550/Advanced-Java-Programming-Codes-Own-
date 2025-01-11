interface parameter_lambda
{
    void add(int a, int b);

    public static void main(String args[])
    {
        parameter_lambda o1= (int a, int b)->{
            int c=a+b;
            System.out.println("addiiton is :"+ c);
        };

        // always we had to call the abstract functional interface method.
        o1.add(5,4);
    }
}