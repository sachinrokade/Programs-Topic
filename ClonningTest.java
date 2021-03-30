

public class ClonningTest {
 
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
		
		Student s=new Student(101,"fdssd",6.45);
		
		Student s2=s.getClone();
		
		
		System.out.println(s2==s);
		System.out.println(s2.toString());
		System.out.println(s.toString());
		
		
	}
}