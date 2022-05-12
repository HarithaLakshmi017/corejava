package edu.lessons.threads;

public class Multithreadsonjoin {
	public static void multiThreadsonjoin()
	{
		try
		  {
			Thread t=Thread.currentThread();
			System.out.println("MainTh ID: " +t.getId() );
			RunnableWorker firstWorker=new RunnableWorker();
			Thread t1=new Thread(firstWorker);
			Thread t2=new Thread(firstWorker);
			t1.start();//call run
			t2.start();// call run		
			t1.join();
			t2.join();
			System.out.println("From Main--END!!!");
		 }catch(Exception e)
		 {
			 System.out.println("ERROR!!! "+e.getMessage());
	     }
	}

}
