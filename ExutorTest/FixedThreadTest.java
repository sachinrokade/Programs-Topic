package ExutorTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class FixedThreadTest {
public static void main(String[] args) {
	
	/*
	 * Creates an executor with a fixed number of threads in the pool. 
	 * This executor ensures that there are no more than n concurrent threads at any time. 
	 * If additional tasks are submitted when all threads are active, they will wait in the queue until a 
	 * thread becomes available. If any thread terminates due to failure during execution, it will be replaced by a new one. 
	 * The threads in the pool will exist until it is explicitly shutdown. Use this executor if you and to limit the maximum 
	 * number of concurrent threads
	 */
	ExecutorService ex=Executors.newFixedThreadPool(1);
	ex.submit(new Thread2());
	ex.submit(new Thread1());
	
	ExecutorService executor = Executors.newFixedThreadPool(10);		// Fixed thread pool
	ExecutorService executor2 = Executors.newSingleThreadExecutor();	// Single-threaded pool
	ExecutorService executor1 = Executors.newCachedThreadPool();		// Cached thread pool

	ForkJoinPool forkJoinPool = new ForkJoinPool(4);


	
	}
}
class Thread1 implements Runnable
{
	String msg="i love java pogramming but silt i am job less";
	
	public void run(){
		
		Thread.currentThread().setName("Thread 1");
		
		for(int i=1;i<=msg.length();i++)
		{
			System.out.println(Thread.currentThread().getName()+" which well print ASCII value "+(int)msg.charAt(i));
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
class Thread2 implements Runnable
{
	String msg="i love java pogramming but silt i am job less";
	public void run(){
		System.out.print(""+msg);

		Thread.currentThread().setName("Thread 2");
		for(int i=msg.length()-1;i>=0;i--)
		{
			System.out.println(Thread.currentThread().getName()+" which well Revers value "+msg.charAt(i));
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}