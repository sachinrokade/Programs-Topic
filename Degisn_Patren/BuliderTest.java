package Degisn_Patren;
class Student
{
	int id;
	String  name;
	
	boolean trv_bus;
	String email;
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", trv_bus=" + trv_bus + ", email=" + email + "]";
	}

	public Student(StudentBulider sb) {
		super();
		this.id = id;
		this.name = name;
		this.trv_bus = sb.trv_bus;
		this.email = sb.email;
	}
	
	static public class StudentBulider
	{
		boolean trv_bus;
		String email;
		int id;
		String name;
		
		public StudentBulider(int id,String name)
		{
			this.id = id;
			this.name = name;
			
		}
		
		public StudentBulider setTrv_bus(boolean trv_bus) 
		{
			this.trv_bus = trv_bus;
			return this;
		}
			public StudentBulider setEmail(String email) {
				this.email = email;
				return this;
			}
			public Student build()
			{
				return new Student(this);
			   	
			 }
			
	}
	
}
 
public class BuliderTest {

	public static void main(String[] args)
	{
			Student s=new Student.StudentBulider(1,"dfsd").build();//only re.
			System.out.println(s);
			

			Student s2=new Student.StudentBulider(1,"dfsd").setEmail("@mail").setTrv_bus(true).build();
			System.out.println(s);
	}

}
