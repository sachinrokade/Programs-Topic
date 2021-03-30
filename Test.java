import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;
import java.util.Vector;
class Parents
{
	public void m1()
	{
		System.out.println("class A M1");
	}
	public void m2()
	{
		System.out.println("class A M2");
	}
	public void m3()
	{

		//Arrays.asList(a);
		
		
	}
}
class Child extends Parents
{
	public void m1()
	{
		System.out.println("class B M1");
	}
	public void m2()
	{
		System.out.println("class B M2");
	}
	public void m4()
	{
		System.out.println("class B M4");
	}
}
public class Test 
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		for (int i = 0; i <10; i++) 
    	{
			al.add(i);
			al.add(i);
	    	System.out.println(al);
		}
    	
		
		
	/*	System.out.println("Parents p=new Parents();");
		Parents p=new Parents();
		p.m1();
		p.m2();
	
		System.out.println("Child c=new Child();");
		Child c=new Child();
		c.m1();
		c.m2();
		
		System.out.println("Parents pc=new Child()");
		Parents pc=new Child();
		
		pc.m1();
		pc.m2();
		pc.m3();
		*/
		
/*
 * What is the difference between ArrayList l=new ArrayList() & List l=new ArrayList() ?
			



ArrayList al=new ArrayList();		[Child c=new Child();]				

If we know runtime object type
exactly then we have to used this
approach

By using child reference we can call
both parent & child calss methods.


List l=new ArrayList();					[Parent p=new Child();]

If we don't know exact Runtime object type then
we have to used this approach


By using parent reference we can call only method
available in parent class and child specific method
we can't call.

 */
		
	}
}
