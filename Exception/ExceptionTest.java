package Exception;

class AgeExceptions extends Throwable
{
	public AgeExceptions(String msg)
	{
		super(msg);
	}
}
public class ExceptionTest
{
	public static void main(String[] args) throws UnsupportedOperationException 
	{
		int age=12;
		if(age<=18)
				throw new  UnsupportedOperationException("ur not allowed to vote");
		else
		{
			System.out.println("Done");
		}
	}
	
}
