/*
 * 		SingleToneTest Class
 * 						only one copy of object is created of that class	
 * 
 * 				The Singleton design pattern is one of the simplest design patterns: 
 * 				It involves only one class throughout the application that is responsible 
 * 				
 * 				for instantiating itself to make sure it creates one instance. At the same time, 
 * 				it provides a global point of access to that instance. 
 * 				In this case, the same instance can be used from everywhere
 * 
 * 			Example database configuration object, SessionFactory,
 * 
 * 
 * Difference between Loose Coupling and Tight Coupling in Java With Examples. ... 
 * In short Loose coupling means reducing dependencies of a class that use different class directly . 
 * Tight coupling means classes and objects are dependent on one another
 * 
 */
 import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

class A
{
	private static A a;
	
	private A()
	{
	
	}
	public static A getInstance()
	{
			if(a==null)
			{
				return a=new A();
			}
			return a;
	}
}

class Test2
{
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
			A a=A.getInstance();
			A b=A.getInstance();
			
			System.out.println("Singleton "+(a==b));
			
			Constructor c[]=A.class.getDeclaredConstructors();
			
			for (Constructor con: c) 
			{
				con.setAccessible(true);
				System.out.println(""+con.getName());
				System.out.println("Break in Singleton done "+(a==con.newInstance()));
			}
			
	}
}
