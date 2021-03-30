import java.util.HashSet;

public class Set1 
{

	public static void main(String[] args)
	{
		Student1 s1=new Student1(1,"ab");
		Student1 s2=new Student1(1,"ab");
		Student1 s3=new Student1(1,"ab");
		Student1 s4=new Student1(1,"ab");
		Student1 s5=new Student1(1,"ab");
		
                
		HashSet<Student1> st=new HashSet<>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		
		System.out.println(""+st.size());
		

	}

}
class Student1
{
	int id;
	String name;
	public Student1() {
		super();
	}
	
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
