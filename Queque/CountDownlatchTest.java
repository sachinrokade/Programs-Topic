package Queque;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadLocalRandom;

class FinalProduct extends Thread
{
	CountDownLatch cd=null;//

	public FinalProduct() {
		super();
		
	}
	public void startProduct(int step) throws InterruptedException
	{
		cd=new CountDownLatch(step);
		
		Planing p=new Planing("fact",cd);		// assigin task
		Coding c=new Coding(p.getTesk(),cd);
		Testing t=new Testing(cd);
		Deployment d=new Deployment(cd);
		
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		Thread t3=new Thread(t);
		Thread t4=new Thread(d);
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("waiting for cycle");
		Thread.sleep(5000);
		cd.await();
		System.out.println("FInal ");
	}
	
}
class Planing implements Runnable
{
	CountDownLatch cd;

	String task;

	public Planing(String task,CountDownLatch cd) {
		super();
		this.task = task;
		this.cd=cd;
	}
	public void run() 
	{
		try {
			System.out.println("Planing..... ");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		cd.countDown();
	}
	public void setTesk(String task)
	{
		this.task=task;
	}
	public String getTesk()
	{
		return task;
	}
}
class Coding implements Runnable
{
	String task="";
	Planing p=null;
	CountDownLatch cd;
	public Coding(String task,CountDownLatch cd)
	{
		this.cd=cd;
		this.task=task;
		
	}
	
	public void run() 
	{
		try {
			
			
		int n = 5;
		int f=1;
		if(task.equals("fact"))
		{
			
			for(int j=1;j<=n;j++)
			{
				f=f*j;
			}
		}
		else
			System.out.println("No task found");
		

		System.out.println("Coding.... of fact "+ f);
		Thread.sleep(2000);
		cd.countDown();
		
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
class Testing implements Runnable
{
	CountDownLatch cd;
	
	public Testing(CountDownLatch cd) {
		super();
		this.cd = cd;
	}

	public void run() {
		
		try {
			System.out.println("Testing..... ");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cd.countDown();
		
	}
}
class Deployment implements Runnable
{

	CountDownLatch cd;
	public Deployment(CountDownLatch cd) {
		super();
		this.cd = cd;
	}

	public void run() {
		
		try {
			System.out.println("Deployment.....");
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
public class CountDownlatchTest {

	public static void main(String[] args) throws InterruptedException {

		//Executor e=new Executor();
		CountDownLatch cb=new CountDownLatch(3);
		FinalProduct fp=new FinalProduct();
		fp.startProduct(3);
	}

}
