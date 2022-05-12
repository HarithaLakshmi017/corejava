package edu.lessons.threads;

public class WorkingThreadPriority {
	public static void workingThreadPriority()
	{
		 try
		 {
			Thread t=Thread.currentThread();
		    System.out.println("MainTh ID: " +t.getId() );
			RunnableWorker obj=new RunnableWorker();
			Thread t1=new Thread(obj);
			Thread t2=new Thread(obj);
			System.out.println("t1 ID: " +t1.getId() );
			System.out.println("t2 ID: " +t2.getId() );

			  t1.setPriority(Thread.MIN_PRIORITY);			 
			  t2.setPriority(Thread.MAX_PRIORITY);
//				t1.setPriority(Thread.MAX_PRIORITY);
//			    t2.setPriority(Thread.MIN_PRIORITY);

			 t1.start();
			 t2.start();
			 t1.join();
			 t2.join();
			 System.out.println("From Main End "+obj.amount);
		 }catch(Exception e)
		 {
	 		System.out.println("ErrorType "+e.getClass().getName());
			System.out.println("ErrorMSG "+e.getMessage());
		 }		
	}

}
