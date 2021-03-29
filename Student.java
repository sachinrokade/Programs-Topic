import java.util.Comparator;

class Student implements Cloneable//Comparable<Student>
{
	int ID;
	String name;
	Double  price;
	public Student(int iD, String name, Double price) {
		super();
		ID = iD;
		this.name = name;
		this.price = price;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", price=" + price + "]";
	}
	
public Student getClone() throws CloneNotSupportedException
{
	Student s=(Student)super.clone();
	return s;
}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * 
	 * 
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return this.getID()-o.getID();   					//besed On ID
		
		return this.getName().compareTo(o.getName());		//besed On name
	}
	 */
	
}
class StudentCompare
{
	
	public static Comparator<Student> stByID=new Comparator<Student>() {
	
		public  int compare(Student o1, Student o2) 
		{
			return o1.getID()-o2.getID();  
		}
	};
	public static Comparator<Student> stByName=new Comparator<Student>() {
		
		public  int compare(Student o1, Student o2) 
		{
			return o1.getName().compareTo(o2.getName()); 
		}
	};
	
	public static Comparator<Student> stByPrice=new Comparator<Student>() {
		
		public  int compare(Student o1, Student o2) 
		{
			return (int) (o1.getPrice()-o2.getPrice()); 
		}
	};
	
	
	public static Comparator<Student> stByPriceAnID = new Comparator<Student>(){
		@Override
		public int compare(Student o1, Student o2) {
			int temp = o1.getID()-o2.getID();
			if(temp==0){
				temp = (int) (o1.getPrice()-o2.getPrice());
			}
			return temp;
		}
	};
	
	public static Comparator<Student> stByNameAnID = new Comparator<Student>(){
		@Override
		public int compare(Student o1, Student o2) {
			
			int temp = o1.getName().trim().compareTo(o2.getName().trim()); 
			if(temp==0){
				temp = o1.getID()-o2.getID();
			}
			return temp;
		}
	};
	public static Comparator<Student> stByAll = new Comparator<Student>()
	{
		@Override
		public int compare(Student o1, Student o2) 
		{
			
			int temp = temp = o1.getID()-o2.getID();						// id
			if(temp==0)
			{
				temp=(int) (o1.getPrice()-o2.getPrice());					//price
				if(temp==0)
				{
					temp=o1.getName().compareTo(o2.getName());				//name
				}
			}
			return temp;
		}
	};
	
	
	
}
