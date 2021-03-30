package Exception;

public class NoTryCatchTest {

public static void main(String[] args) {
	Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());

}
}
class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler 
{
	  public void uncaughtException(Thread t, Throwable e) 
	  {

		  	System.out.println("done");
		  	int d=10/0;// Write the custom logic here
		  	System.out.println("done");
	  }
}