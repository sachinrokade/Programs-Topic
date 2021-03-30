import java.io.FileNotFoundException;
class Parent
{
	public Parent() 
	{
		System.out.println("Parent");
	}
	public void m1()
	{
		System.out.println("Parent m1");
	}
	public void m4()
	{
		System.out.println("Parent m4");
	}
	
}
class Child_1 extends Parent
{
	public Child_1() 
	{
		System.out.println("Child ");
	}
	public void m1()
	{
		System.out.println("Child m1");
	}
	public void m2()
	{
		System.out.println("Child m2");
	}
}
public class Test3
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Parent p=new Child_1();
		p.m4();
		
		Child_1 c=new Child_1();
	}
}