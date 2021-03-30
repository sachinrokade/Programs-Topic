interface Y
{
	public void b();
}

class X
{
	public  X()
	{
		System.out.println("X");
	}
	public  void x1()
	{
		System.out.println("X");
	}
}

abstract class Anno extends X implements Y
{
	@Override
	public void b() {
		// TODO Auto-generated method stub
		
	}
		public  Anno()
		{
			super();
		}
		public void m2()
		{
			System.out.println("m2 ");
		}
		public abstract void m1();
}
class TestAnno
{
	public static void main(String[] args) {
		
		Anno te=new Anno() {
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				
			}

			
			
		};
		te.m1();
		te.m2();
		
		te.x1();
		
	}
}
