import java.util.Vector;

class TestVector1
{
	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<>();
		int i=v.size();
		System.out.println("In size "+i);
		
		v.add(1);
		v.add(2);
		v.add(2);
		v.add(3);
		v.add(5);
		
		System.out.println(v);
		
		
		
	}
}