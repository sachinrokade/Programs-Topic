package ExutorTest;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CachedThreadTest{

	public static void main(String[] args) {
	
	Thread tt1=new Thread(new T1(),"Thread 1");
	Thread tt2=new Thread(new T2(),"Thread 2");
		
	System.out.println(Runtime.getRuntime().availableProcessors());
	
	/**
	 * ExecutorService e=Executors.newCachedThreadPool();
	 * Cached thread pool: keeps a number of alive threads and creates new ones as needed unbounded.  
		Creates an expandable thread pool executor. New threads are created as needed, and previously 
		constructed threads are reused when they are available. Idle threads are kept in the pool for one minute. 
		This executor is suitable for applications that launch many short-lived concurrent tasks 
	 */
	ExecutorService e=Executors.newCachedThreadPool();
	
	e.submit(tt1);
	e.submit(tt2);
	}

}
class T2 implements Runnable{
	public void run() {

		
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class T1 implements Runnable {
	public void run() {

		for(int i=10;i>0;i--)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
} 
