package BlockingQ;

import java.util.concurrent.CountDownLatch;

public class CountDownTest {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch cd=new CountDownLatch(4);
		System.out.println(Thread.currentThread().getName());
		
		Thread t1=new Thread(new Task1(cd));
		Thread t2=new Thread(new Task2(cd));
		Thread t3=new Thread(new Task3(cd));
		Thread t4=new Thread(new Task4(cd));
		Thread t5=new Thread(new Task5());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		cd.await();
		t5.start();

		
	}
}
class Task1  implements Runnable
{
	CountDownLatch cd;
	public Task1(CountDownLatch cd) {
		this.cd=cd;
	}

	@Override
	public void run() {
		
		System.out.println("I  got C lang "+cd.getCount());
		cd.countDown();
	}
}
class Task2  implements Runnable
{
	CountDownLatch cd;
	public Task2(CountDownLatch cd) {
		this.cd=cd;
	}

	@Override
	public void run() {
		System.out.println("I  got C++ lang "+cd.getCount());
cd.countDown();
	}
}
class Task3  implements Runnable
{
	CountDownLatch cd;
	public Task3(CountDownLatch cd) {
		this.cd=cd;
	}

	@Override
	public void run() {
		System.out.println("I  got DS lang "+cd.getCount());
		cd.countDown();
	}
}
class Task4  implements Runnable
{
	CountDownLatch cd;
	public Task4(CountDownLatch cd) {
		this.cd=cd;
	}

	@Override
	public void run() {
		System.out.println("I  got Java lang "+cd.getCount());
		cd.countDown();
	}
}
class Task5  implements Runnable
{
	@Override
	public void run() {
		System.out.println("but stil i am waiting for job ");
	}
}