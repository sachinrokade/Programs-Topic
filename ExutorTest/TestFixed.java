package ExutorTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class TestFixed {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		Future<Integer>[] futures = new Future[5];
		for (int i = 0; i < futures.length; i++) {
			futures[i] = executorService.submit(new Thread_test());
		}

		executorService.shutdown();
		for (int i = 0; i < futures.length; i++) {
			Integer retVal = futures[i].get();
			System.out.println("Test ........"+retVal);
		}
	}
}
class Thread_test implements Callable<Integer>
{
	String msg="i love java pogramming but silt i am job less";
	
	public Integer call() throws Exception 
	{
			
		Thread.currentThread().setName("Thread 1");
			System.out.println(Thread.currentThread().getName()+" which well print ASCII value ");
		
			return 1;
	}

}