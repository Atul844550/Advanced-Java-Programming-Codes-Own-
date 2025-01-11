class mutiThreading_concept extends Thread {

    public void run()
    {
        for(int i=1; i<=10; i++)
        {
            try{

                Thread.sleep(6000);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String args[])
    {
        mutiThreading_concept obj1= new mutiThreading_concept();
        mutiThreading_concept obj2= new mutiThreading_concept();
        obj1.start();
        obj2.start();

    }


    
}
