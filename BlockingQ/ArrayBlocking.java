package BlockingQ;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/*
 * porduser or consumer problem
 */
public class ArrayBlocking
{ 
	static int a=  13230_10__10;
	public static void main(String args[]) 
	{ 
		System.out.println("dfgfd  "+a);
	
			BlockingQueue queue = new ArrayBlockingQueue<>(5);
			
	        Thread producer = new Thread(new Producer(queue));
	        Thread consumer = new Thread(new Consumer(queue));
	        
	        producer.start();
	        consumer.start();
		}
}
class Producer implements Runnable
{
    
    private BlockingQueue queue;
    
    public Producer(BlockingQueue queue) 
    {
        this.queue = queue;
    }
    public void run() 
    {
        for (int i = 0; i < 8; i++) 
        {
            System.out.println("Produceing " + queue.offer("String " + i));
            
            try {  
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable
{
    
    private BlockingQueue queue;
    
    public Consumer(BlockingQueue queue) 
    {
        this.queue = queue;
    }

    @Override
    public void run() {
        
        // As long as there are empty positions in our array,
        // we want to check what's going on.
        while (queue.remainingCapacity() > 0) 
        {
            System.out.println("Consuming remaining capacity: " + queue.remainingCapacity());
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}