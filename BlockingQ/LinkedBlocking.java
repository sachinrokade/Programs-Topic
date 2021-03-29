package BlockingQ;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlocking 
{
	public static void main(String[] args) {
		 
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);
		Thread producer = new Thread(new ProducerL(queue));
        Thread consumer = new Thread(new ConsumerL(queue));
        producer.start();
        consumer.start();
 
    }
}
class ProducerL implements Runnable {
	 
    private BlockingQueue<Integer> queue;
    public ProducerL(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    public void run() {
        try {
        		for (int i = 0; i < 10; i++) 
        		{
                  Integer number = produce();
                  queue.put(number);
                  System.out.println("PRODUCER: created " + number);
	            }
        		//queue.put(-1);       // indicates end of producing
            System.out.println("PRODUCER: STOPPED.");
        } catch (InterruptedException ie) 
        {
            ie.printStackTrace();
        }
    }
 
    private Integer produce()
    {
        Random random = new Random();
        Integer number = random.nextInt(100);
 
        // fake producing time
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException ie) { ie.printStackTrace(); }
 
 
        return number;
    }
}
class ConsumerL implements Runnable {
	 
    private BlockingQueue<Integer> queue;
 
    public ConsumerL(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
 
    public void run() {
 
        try {
 
             while (true) {
 
                Integer number = queue.take();
 
                if (number == -1) {
                    System.out.println("Consumer: STOPPED.");
                    break;
                }
 
                consume(number);
             }
 
 
 
        } catch (InterruptedException ie) {
 
             ie.printStackTrace();
        }
    }
 
    private void consume(Integer number) {
        // fake consuming time
        Random random = new Random();
 
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException ie) { ie.printStackTrace(); }
 
        System.out.println("Consumer: processed " + number);
    }
}