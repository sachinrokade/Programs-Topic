import java.util.Arrays;

interface D
{
	int d=40;
}
class A1
{
	int a=10;

	@Override
	public String toString() {
		return "A1 [a=" + a + "]";
	}

	
	
}
class B extends A1
{
	@Override
	public String toString() {
		return "B [b=" + b + "]";
	}

	int b=20;
	
	
}
class C extends B implements D
{
	int c=30;
	Integer a;
	
	@Override
	public String toString() {
		return "C [c=" + c + " d= "+this.d+"]";
	}
	
}
public class StringTest {

	public static void main(String[] args) {

		A1 a[]=new A1[3];
		
		a[0]=new A1(); 
		a[1]=new B();
		a[2]=new C();
		
		System.out.println("All Array"+Arrays.toString(a));
		
		for (A1 a1 : a) {
			
			if(a1 instanceof A1)
			{
				A1 aa=(A1)a1;
				System.out.println("Member of A class");
				System.out.println("A "+aa.a);
			}
			if(a1 instanceof B)
			{
				B aa=(B)a1;
				System.out.println("Member of B class");
				System.out.println("B "+aa.a);
				System.out.println("B "+aa.b);
				
			}
			if(a1 instanceof C)
			{
				C aa=(C)a1;
				System.out.println("Member of C class");
				System.out.println("C "+aa.a);
				System.out.println("C "+aa.b);
				System.out.println("C "+aa.c);
				System.out.println("C impl D "+aa.d);
				
			}
		}
	}
}
