package BlockingQ;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

class Employee implements Delayed
{
	int id;
	String name;
	long delay;
	
	
	public Employee(int id, String name, long delay) {
		super();
		this.id = id;
		this.name = name;
		this.delay = System.currentTimeMillis()+delay;
	}

	public int compareTo(Delayed o) {
		
		  if (this.delay < ((Employee) o).delay)  
		  {   return -1;  }               
		  if (this.delay > ((Employee) o).delay)      
		  {   return 1;          }
		return 0;         
	}
	public long getDelay(TimeUnit unit) {
		 long diff = delay - System.currentTimeMillis();     
		 return unit.convert(diff, TimeUnit.SECONDS); 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", delay=" + delay + "] \n";
	}
	
}

class DelayQueueProducer {
	
    // Creates an instance of blocking queue using the DelayQueue.
    private BlockingQueue queue;

	private final Random random = new Random();
	
	public DelayQueueProducer(BlockingQueue queue) {
		super();
		this.queue = queue;
	}
	
	private Thread producerThread = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                  
                    // Put some Delayed object into the DelayQueue.
                    int delay = random.nextInt(10000);
                    DelayObject object = new DelayObject(UUID.randomUUID().toString(), delay);

                    System.out.printf("Put object = %s%n", object);
                    queue.put(object);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }, "Producer Thread");
	
	public void start(){
		this.producerThread.start();
	}

}
class DelayQueueConsumer {
	
	private String name;
	
    private BlockingQueue queue;

	public DelayQueueConsumer(String name, BlockingQueue queue) {
		super();
		this.name = name;
		this.queue = queue;
	}
	
	private Thread consumerThread =  new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    // Take elements out from the DelayQueue object.
                    DelayObject object = queue.take();
                    System.out.printf("[%s] - Take object = %s%n",
                            Thread.currentThread().getName(), object);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });
	
	public void start(){
		this.consumerThread.setName(name);
		this.consumerThread.start();
	}

}

public class DelayQueueImpl {

	public static void main(String[] args) throws InterruptedException {
		DelayQueue<Employee> dq=new DelayQueue<>();
		PriorityBlockingQueue<E>
		Employee e1=new Employee(101,"abc",5);
		Employee e2=new Employee(102,"abc",10);
		Employee e3=new Employee(103,"abc",10);
		Employee e4=new Employee(104,"abc",10);
		
		// Creates an instance of blocking queue using the DelayQueue.
		BlockingQueue queue = new DelayQueue();
				
				// Starting DelayQueue Producer to push some delayed objects to the queue 
		new DelayQueueProducer(queue).start();
		new DelayQueueConsumer("Consumer Thread-1", queue).start();
				
				
				
				

		}
}
