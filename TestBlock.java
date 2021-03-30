class TestClass
{
	int a;
	{
		int x;
		System.out.println("in empty block 1 ");
	}

	public TestClass()
	{
		System.out.println("in constuctor ");
	}
	{
		System.out.println("in empty block 4");
	}
	/*public TestClass(int a)
	{
		this.a=a;
		System.out.println("in paramitrazed constuctor "+a);
	}*/
	{
		System.out.println("in empty block 3");
	}
	static
	{
		System.out.println("in static block");
	}
	{
		System.out.println("in empty block 2");
	}
}
public class TestBlock {

	public static void main(String[] args) {
		
		System.out.println(new TestClass().a);
	}
}
