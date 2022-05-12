package edu.lessons.threads;

public class WorkerThreadextendsThread {
	 private int amount;
		@override public void run() 
		{
			execute();
		}
		public void execute()
		{
		  long id=Thread.currentThread().getId();
		  System.out.println("Inside execute ThreadID "+id+" Amount "+amount);
		  try{
		   for(int i=0;i<5;i++)
		   {
			amount+=i;
		    System.out.println(id+ "  " + amount);
		   // Thread.sleep(2000);
	       }
		  }catch(Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
		}	
	}


