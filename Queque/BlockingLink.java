package Queque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

class ProduserLink extends Thread
{
	LinkedBlockingQueue  bq;

	public ProduserLink(LinkedBlockingQueue bq,String name) {
		super(name);
		this.bq = bq;
	}
	public void run()
	{
		while(true)
		{
			try {
				int a=ThreadLocalRandom.current().nextInt(1,10);
				bq.put(a);
					System.out.println("pocdusing "+bq);
					TimeUnit.SECONDS.sleep(2);
				}
			 catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}		
	}
	
}
class ConsumerLink extends Thread
{
	LinkedBlockingQueue bq;

	public ConsumerLink(LinkedBlockingQueue bq,String name) {
		super(name);
		this.bq = bq;
	}
	public void run()
	{
		while(true)
		{
			try {
				System.out.println("Consumeing "+bq);
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Student3
{
     String name;
     int age;
    public Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }
 	public String toString() {
		return "\n Student2 [name=" + name + ", age=" + age + "]";
	}
}
public class BlockingLink {

	public static void main(String[] args) {
		
		//BlockingQueue<String> unbounded = new LinkedBlockingQueue<String>();
		LinkedBlockingQueue bq= new LinkedBlockingQueue(5);

		
		ProduserLink p=new ProduserLink(bq,"ProduserLink");
		ConsumerLink c=new ConsumerLink(bq,"ConsumerLink");
		p.start();
		c.start();
	}

}
