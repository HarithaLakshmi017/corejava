package edu.lessons.threads;

public class TestRunnableThreads {
	private static Thread t1;

	public static void main (String args [])
	{
		checkingStateofThreads();
	}
   
// Runnable Thread
private static void checkingStateofThreads() {
		// TODO Auto-generated method stub
		
	}

public static void runningMultipleRunnableThreads ()
{
    try
    {
        Thread t=Thread.currentThread();
        System.out.println ("MainTh ID:"+t.getId () );
        RunnableWorker firstWorker=new RunnableWorker();
        RunnableWorker secondWorker=new RunnableWorker();
        Thread tl=new Thread (firstWorker);
        Thread t2=new Thread(secondWorker);
        Thread t3=new Thread(firstWorker);
        t1.start ();//call run
       t2.start ();// call run
        System.out.println ("From Main--END!!!");
      }catch (Exception e)
    {
System.out.println("ERROR!!! "+e.getMessage());
}
}
}

 
