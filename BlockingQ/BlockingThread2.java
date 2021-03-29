package BlockingQ;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


class Student
{  
	ConcurrentMap
	
	int stud_id;
	String stud_name;
	String stud_address;
	public Student(int stud_id, String stud_name, String stud_address) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_address = stud_address;
	}
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_address=" + stud_address + "]";
	}
	
}

class Conusmer extends Thread
{

	ArrayList<Student> al;
	int size;
	
	public Conusmer(ArrayList<Student> set, int i, String name) {
		super(name);
		this.al=set;
		this.size=i;
	}

	public void run() {

		while(true)
		{
			try {
				
			synchronized(al)
			{
				while(al.isEmpty())
				{
						System.out.println("List is empty ");
						al.wait();
					
				}
				for (int i=0;i<=al.size();i++)
				{
					System.out.println(" Conusmeing "+al.get(i));

					TimeUnit.SECONDS.sleep(2);
					al.wait(100);
					//al.notifyAll();
				}
				
				}
			}catch (InterruptedException e) {
					// TODO Auto-generaal.notifyAll();
					e.printStackTrace();
				}
				
			}
		}
		
	}
	
class Produser extends Thread
{
	ArrayList<Student> al;
	int size;
	
	
	public Produser(ArrayList<Student> set, int i, String name) {
		super(name);
		this.al=set;
		this.size=i;
	}

	public void run() {

		while(true)
		{
			try {
				
			synchronized(al)
			{
				while(al.size()==size)
				{
						System.out.println("List is full");
						al.wait();
						
				}
					Student s1=new Student(1,"z","adr1");			//101
					Student s2=new Student(2,"x","adr3");			//102
					Student s3=new Student(5,"a","adr5");			//103
					Student s4=new Student(4,"b","adr4");			//112
					Student s5=new Student(3,"b","adr4");			//112
					
					al.add(s1);
					al.add(s2);
					al.add(s3);
					al.add(s4);
					al.add(s5);
					for (Student student : al) {
						TimeUnit.SECONDS.sleep(2);
						System.out.println("Produceing "+student);
						al.wait(100);
					}
					
					al.notifyAll();
					//break;
				
			}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
	
	
}

public class BlockingThread2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ArrayList<Student> set=new ArrayList<>();
		
		Produser t1=new Produser(set,5,"Produser");
		Conusmer t2=new Conusmer(set,5,"Conusmer");
		
		t1.start();
		t2.start();
		
	}

}
