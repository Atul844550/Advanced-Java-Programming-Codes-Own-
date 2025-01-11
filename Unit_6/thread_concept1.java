class thread_concept1 extends Thread {

    public void run()
    {
        System.out.println("priority of thread is:- "+ Thread.currentThread().getPriority());
    }

    public static void main(String args[])
    {
        thread_concept1 obj = new thread_concept1();
        obj.start();

        System.out.println(obj.getName());
        obj.setPriority(Thread.MIN_PRIORITY);
        System.out.println(obj.getId());
        System.out.println(obj.isAlive());




        
    }
    
}
