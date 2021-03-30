package Queque;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

class WorkerThread implements Runnable
{
	String  a;
	CyclicBarrier cb;
	
	public WorkerThread(CyclicBarrier cb) {
		this.cb=cb;
	}

	public void run() {
		
		try {
		
			System.out.println("we Start counting");
			cb.await();
			
			if(Thread.currentThread().getName().equals("Print 1-5"))
			{
				System.out.println(Thread.currentThread().getName());
				for(int i=1;i<=5;i++)
				{
					System.out.print(" "+i);
			//	TimeUnit.SECONDS.sleep(500);
				}
			}
			TimeUnit.SECONDS.sleep(1);
			cb.await();
			
			if(Thread.currentThread().getName().equals("Print 6-10"))
			{
			
				System.out.println("\n"+Thread.currentThread().getName());
				for(int i=6;i<=10;i++)
				{
					System.out.print(" "+i);
				//TimeUnit.SECONDS.sleep(500);
				}
			}

			TimeUnit.SECONDS.sleep(2);
			cb.await();
			
			
			if(Thread.currentThread().getName().equals("Print 11-15"))
			{
			
				System.out.println("\n"+Thread.currentThread().getName());
				for(int i=11;i<=15;i++)
				{
					System.out.print(" "+i);
					//TimeUnit.SECONDS.sleep(500);
				}
			}
			TimeUnit.SECONDS.sleep(3);
			cb.await();
			
			
			if(Thread.currentThread().getName().equals("Print 16-20"))
			{
			
				System.out.println("\n"+Thread.currentThread().getName());
				for(int i=16;i<=20;i++)
				{
					System.out.print(" "+i);
					//TimeUnit.SECONDS.sleep(500);
				}
	
				TimeUnit.SECONDS.sleep(4);
				cb.await();
			
			}
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
}

public class CyclicBarriarTest {

	public static void main(String[] args) {
		
		Executor executor = anExecutorImplementation;
		CyclicBarrier cb=new CyclicBarrier(4);
		
		Thread t1=new Thread(new WorkerThread(cb),"Print 1-5");
		Thread t2=new Thread(new WorkerThread(cb),"Print 6-10");
		Thread t3=new Thread(new WorkerThread(cb),"Print 11-15");
		Thread t4=new Thread(new WorkerThread(cb),"Print 16-20");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}
