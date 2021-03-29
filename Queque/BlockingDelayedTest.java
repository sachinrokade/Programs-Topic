package Queque;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

class StudentDelay implements Delayed
{
	int id;
	long delay;
	public StudentDelay(int id,long delay) {
		super();
		this.id = id;
		this.delay=System.currentTimeMillis();
	}
	@Override
	public String toString() {
		return "StudentDelay [id=" + id + "]";
	}
	@Override
	public int compareTo(Delayed o) {
		
		 if (this.delay < ((StudentDelay) o).delay) {
	            return -1;
	        }
	        if (this.delay > ((StudentDelay) o).delay) {
	            return 1;
	        }
	        return 0;
	}
	@Override
	public long getDelay(TimeUnit unit) {
		long di= delay-System.currentTimeMillis();
		    return unit.convert(di, TimeUnit.MILLISECONDS);
	}
	
}
/**
 *	consumer wants to take an element from the queue, 
 *	they can take it only when the delay for that 
 * particular element has expired.
 * DelayQueue - a specialized priority queue that orders elements based on their delay time. 
 * Only expired elements can be taken from the queue, and the head of the queue contains the 
 * element that has expired for the longest time.A DelayQueue accepts only elements that belong 
 * to a class of type Delayed, which implements the getDelay() method to return the remaining delay time.
 */
public class BlockingDelayedTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BlockingQueue bq=new DelayQueue();
		int i=ThreadLocalRandom.current().nextInt(0000,9999);
		StudentDelay s1=new StudentDelay(i,5000);
		StudentDelay s2=new StudentDelay(i,20000);
		
		
		bq.put(s1);
		bq.put(s2);
		System.out.println("producing "+bq);
		
		
		Iterator<StudentDelay> s=bq.iterator();
		while (s.hasNext()) {
			StudentDelay studentDelay = (StudentDelay)bq.take();
			System.out.println("consumed "+studentDelay);
			
			TimeUnit.SECONDS.sleep(2);
		}
	}

}
