package edu.lessons.threads;

public class Checkingstateofthread {
	public static void checkingStateofThreads()
	{
		RunnableWorker obj=new RunnableWorker();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		System.out.println(t1.getId()+" T1 State "+t1.getState());
		System.out.println(t2.getId()+" T2 State "+t2.getState());
			t1.start();
			t2.start();
System.out.println("T1 State "+t1.getState());
		System.out.println("T2 State "+t2.getState());
		  	try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("T1 State "+t1.getState());
		System.out.println("T2 State "+t2.getState());  	
		try {
			t1.join();
		  	t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("T1 State "+t1.getState());
		System.out.println("T2 State "+t2.getState());
}

}
