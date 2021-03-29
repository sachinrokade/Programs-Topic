package Queque;

import java.util.Comparator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

class Produser extends Thread
{
	PriorityBlockingQueue  bq;

	public Produser(PriorityBlockingQueue bq,String name) {
		super(name);
		this.bq = bq;
	}
	public void run()
	{
		while(true)
		{
			try {
			
				Student2 s1=new Student2("skjs",30);
				Student2 s2=new Student2("pqr", 70);
				Student2 s3=new Student2("mnp", 80);
				Student2 s4=new Student2("abc", 34);;
				Student2 s5=new Student2("Abc", 35);
				
				bq.put(s1);
				bq.put(s2);
				bq.put(s3);
				bq.put(s4);
				bq.put(s5);
				
					System.out.println("pocdusing "+bq);
					TimeUnit.SECONDS.sleep(2);
				}
			 catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
			
	}
	
	
}
class Consumer extends Thread
{
	PriorityBlockingQueue bq;

	public Consumer(PriorityBlockingQueue bq,String name) {
		super(name);
		this.bq = bq;
	}
	public void run()
	{
		while(true)
		{
			try {
				System.out.println("Consumeing "+bq);
			
				
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class StudComp  
{

			public static Comparator<Student2> byName=new Comparator<Student2>()
			{
				public int compare(Student2 o1, Student2 o2) 
				{
					return o1.getName().compareTo(o2.getName());
				}
	
			};
			
			public static Comparator<Student2> byAge=new Comparator<Student2>()
			{
				public int compare(Student2 o1, Student2 o2) 
				{
					return o1.getAge()-o2.getAge();
				}
	
			};
}
 class Student2 {//implements Comparable<Student2> {
    private String name;
    private int age;
    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
   	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", age=" + age + "]";
	}
}
public class BlockingPriority {

	public static void main(String[] args) {
		
		PriorityBlockingQueue bq=new PriorityBlockingQueue(5,StudComp.);		//
		Produser p=new Produser(bq,"Produser");
		Consumer c=new Consumer(bq,"Consumer");
		p.start();
		c.start();
	}
	

}
/*
 * 
 PriorityBlockingQueue is unbounded ques The elements added in it, is ordered on the basis of  Comparable or Comparator in this case name. 
 so that when we consume ABC is first consume and if we apply comprare in age then it consume 30 age first
 * 
 *
 */
