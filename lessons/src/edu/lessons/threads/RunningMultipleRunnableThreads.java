package edu.lessons.threads;

public class RunningMultipleRunnableThreads {
	public static void runningMultipleRunnableThreads()
	{
		try
		  {
			Thread t=Thread.currentThread();
			System.out.println("MainTh ID: " +t.getId() );
			RunnableWorker firstWorker=new RunnableWorker();
			RunnableWorker secondWorker=new RunnableWorker();
			Thread t1=new Thread(firstWorker);
			Thread t2=new Thread(secondWorker);
			t1.start();//call run
			t2.start();// call run		
			System.out.println("From Main--END!!!");
		 }
catch(Exception e)
		 {
			
					 System.out.println("ERROR!!! "+e.getMessage());
	     }
	}

}
