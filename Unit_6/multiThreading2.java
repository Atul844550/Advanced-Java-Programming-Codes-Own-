class alphabet implements Runnable {

    public void run()
    {
        for(int i=65; i<=92; i++)
        {
            System.out.println((char)i);

            try{

                Thread.sleep(700);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.println("alphabet class ended");
    }
    
}

class number implements Runnable
{
    public void run()
    {
        for(int i=1; i<=20; i++)
        {
            System.out.println(i);

            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.println("number class ended");
    }
}

class multiThreading2
{
    public static void main(String args[])
    {
        alphabet a= new alphabet();
        Thread t1= new Thread(a);
        t1.start();

        number n= new number();
        Thread t2= new Thread(n);
        t2.start();

    }
}
