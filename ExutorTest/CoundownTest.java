package ExutorTest;

import java.util.Collections;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

class Thread_1 extends Thread
{
	CountDownLatch cd;
	public Thread_1(CountDownLatch cd) 
	{
		this.cd=cd;
	}
	public void run()
	{
		
		System.out.println("Thread 1 "+cd.getCount());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.countDown();
	}
	
}
class Thread_2 extends Thread
{
	CountDownLatch cd;
	public Thread_2(CountDownLatch cd) 
	{
		this.cd=cd;
	}

	public void run()
	{
		System.out.println("Thread 2 "+cd.getCount());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.countDown();
	}
}
class Thread_3 extends Thread
{
	CountDownLatch cd;
	public Thread_3(CountDownLatch cd) 
	{
		this.cd=cd;
	}
	public void run()
	{
		System.out.println("Thread 3 "+cd.getCount());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.countDown();
	}
}
class Thread_4 extends Thread
{
	CountDownLatch cd;
	public Thread_4(CountDownLatch cd) 
	{
		this.cd=cd;
	}
	public void run()
	{
		System.out.println("Thread 4 "+cd.getCount());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		cd.countDown();
	}
}
public class CoundownTest {

	public static void main(String[] args) throws InterruptedException 
	{
		
		/*Collections.sort(list);
		
		ExecutorService executor = Executors.newFixedThreadPool(10);		// LinkedBlockingQueue
		ExecutorService executor1 = Executors.newSingleThreadExecutor();	// LinkedBlockingQueue
		ExecutorService executor2 = Executors.newCachedThreadPool();		// SynchronousQueue

		ScheduledExecutorService  executor3=Executors.newScheduledThreadPool(10);	// DelayedWorkQueue

		
	*/	
		System.out.println("This Main ");
		
		CountDownLatch cd=new CountDownLatch(4);
					
		Thread_1 t1=new Thread_1(cd);
		Thread_2 t2=new Thread_2(cd);
		Thread_3 t3=new Thread_3(cd);
		Thread_4 t4=new Thread_4(cd);
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		cd.await();
		System.out.println("End Main ");		
		
	}
}
