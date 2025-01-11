class thread_concept2 {

    public static void main(String args[])
    {
        Runnable r1= new Runnable()
        {
            public void run()
            {
                System.out.println("thread 0");
            }
        };

        Thread t1= new Thread(r1);
        t1.start();
        Runnable r2 = ()->                                       // functional interface
        {
            System.out.println("thread 1");
        };
        Thread t2= new Thread(r2);
        t2.start();
    }
    
}
