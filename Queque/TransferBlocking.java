package Queque;

import java.util.ListIterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;


public class TransferBlocking 
{

	public static void main(String[] args) 
	{
		
		BlockingQueue le=new SynchronousQueue<>();
		
		Runnable pr=new Runnable() {
			public void run() {
					try {

						while(true)
						{
								int i=ThreadLocalRandom.current().nextInt(1,10);
								le.put(i);
								System.out.println("producing "+i);
								TimeUnit.SECONDS.sleep(3);
							
						}
					} catch (InterruptedException e)
					{e.printStackTrace();
					}
		}

		};
		Runnable co=new Runnable() {
			public void run() {
			
				while(true)
				{
					try {
						System.out.println("Consumed  "+le.t);
						TimeUnit.SECONDS.sleep(3);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
				}
			}
		};
		
		Thread t1=new Thread(pr);
		Thread t2=new Thread(co);
		
		t1.start();
		t2.start();
	}

}
