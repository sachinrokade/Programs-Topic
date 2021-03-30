package Exception;

public class ExceptionTry {

	public static void main(String[] args) {
		int i=m1();
		System.out.println("main "+i);
		int a[]=new int[10];
		System.out.println(a);
	}

	private static int m1() {
		int i=m2();
		System.out.println("m1 "+i);
		return i;
		
	}

	private static int m2() {

		try {

			int a=10/0;
			return 1;
		}catch (Exception e) {
			return 2;
		}
		finally {
			return 3;
		}
	}

}
