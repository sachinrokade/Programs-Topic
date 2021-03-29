import java.util.Date;

/*
 * Question  : How To Create Immutable class?		 
	Answer    :			 
			 1) Don’t provide “setter” methods — methods that modify fields or objects referred to by fields.
				Setter methods are meant to change the state of object and this is what we want to prevent here.

			 2) Make all fields final and private
				This is another way to increase immutability. Fields declared private will not be accessible outside 
				the class and making them final will ensure the even accidentally you can not change them.

			 3) Don’t allow subclasses to override methods
			    The simplest way to do this is to declare the class as final. Final classes in java can not be overridden.

             4) Special attention when having mutable instance variables
				Always remember that your instance variables will be either mutable or immutable. 
				Identify them and return new objects with copied content for all mutable objects. 
				Immutable variables can be returned safely without extra effort.
				
				following are some Immutable Class
			a)	java.lang.String
			b)	java.lang.All Wrapper classes
			c)	java.lang.StackTraceElement 
			d)	java.io.File.
			e)	java.awt.Font
			f)	java.awt.Color
 * 
 * 
 * 
 * Case A)
 * 		 if you what to create your mutable class StudentImm
 * 
 * 		1) make all varable are private
 * 				which means value can not be change
 * 		2) provide only geter methods 
				so that we restric set value
 * 		3) make class is final	
 * 
 * Case B) What is if ur class used some other Class
 * 			in that case ur that  class should be immutable  
 * 
 * Case C) What is if ur  class used 3rd party Java mutabel class   ex Date/etc.
 * 			in that case every time provide new object of that class 
 * 		
 */
class Address
{
	final private int pin;
	final private String city;
	
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}

	public Address() {
		pin=0;
		city="";
	}

	public int getPin() {
		return pin;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}

	
	
}




final class StudentImm 
{
	 
	 private final int id;
	 private final String name;
	 private final  Address ad;
	 private final Date date;
	 
	public StudentImm(int id, String name, Address ad, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.ad = ad;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Date getDate() {
		
		return new Date(date.getDate());
	}
	@Override
	public String toString() {
		return "StudentImm [id=" + id + ", name=" + name + ", ad=" + ad + ", date=" + date + "]";
	}
	

	
}






public class ImmutableClass {

	public static void main(String[] args) 
	{
		//StudentImm im=new StudentImm(101,"ABC");		// Case A we can say that this Student class is Immutable
		
//		Address ad=new Address(444,"Pune");				// Case B we can say that this Address class is also Immutable
//		StudentImm im1=new StudentImm(101,"ABC",ad);		
//		System.out.println(""+im1);
		
		Address ad=new Address(444,"Pune");				// Case C we can say that Java mutable (Date) class is also Immutable
		StudentImm im1=new StudentImm(101,"ABC",ad,new Date());		
		
		Address ad2=new Address();
		System.out.println(""+im1);
	}

}
