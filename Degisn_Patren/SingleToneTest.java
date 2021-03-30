package Degisn_Patren;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 * 		SingleToneTest Class
 * 						only one copy of object is created of that class	
 * 
 * 				The Singleton design pattern is one of the simplest design patterns: 
 * 				It involves only one class throughout the application that is responsible 
 * 				
 * 				for instantiating itself to make sure it creates one instance. At the same time, 
 * 				it provides a global point of access to that instance. 
 * 				In this case, the same instance can be used from everywhere
 * 
 * 			Example database configuration object, SessionFactory,
 * 
 * 
 * Difference between Loose Coupling and Tight Coupling in Java With Examples. ... 
 * In short Loose coupling means reducing dependencies of a class that use different class directly . 
 * Tight coupling means classes and objects are dependent on one another
 * 
 */

class SingleTone implements Serializable,Cloneable
{
	public static SingleTone st=null;						 // layz loading
	//public static SingleTone st=new SingleTone();			// eager loading
	private SingleTone() 
	{

	}
	public static SingleTone getInstance()
	{
		if(st==null)
		{
			st=new SingleTone();			
		}
		return st;
		
	}
	public SingleTone clone()
	{
		return st;
	}


}
public class SingleToneTest 
{
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException, IOException, ClassNotFoundException
	{
		System.out.println("Singleton");
		SingleTone st1 = SingleTone.getInstance();
		SingleTone st2 = SingleTone.getInstance();
		
		SingleTone st3=st2.clone();
		System.out.println();
	
	System.out.println("s1 "+st1.hashCode()+"\n s2 "+st2.hashCode()+"\n s3 "+st3.hashCode()); //true
	
	// SingleTone Brack by Using Reflection Techinqe
	
//	Constructor c[]=SingleTone.class.getDeclaredConstructors();
//	
//	for (Constructor con: c) 
//	{
//		con.setAccessible(true);
//		System.out.println("name of Constructor "+con.getName());
//		System.out.println("return false if cretate Tow Object  "+(st1==con.newInstance()));
//	}

	
/*
 * Overcome reflection issue: To overcome issue raised by reflection, enums are used because java ensures internally that enum value is instantiated only once. Since java Enums are globally accessible, they can be used for singletons. Its only drawback is that it is not flexible i.e it does not allow lazy initialization.

//Java program for Enum type singleton 
public enum GFG  
{ 
  INSTANCE; 
}
 
As enums don’t have any constructor so it is not possible for Reflection to utilize it. Enums have their by-default constructor, we can’t invoke them by ourself. JVM handles the creation and invocation of enum constructors internally. As enums don’t give their constructor definition to the program, it is not possible for us to access them by Reflection also. Hence, reflection can’t break singleton property in case of enums.
 */
	
	
	
	//SingleTone breck  useing  Serializable
	
	/*
	 * Serialization:- Serialization can also cause breakage of singleton property of singleton classes. Serialization is used to convert an object of byte stream and save in a file or send over a network. Suppose you serialize an object of a singleton class. Then if you de-serialize that object it will create a new instance and hence break the singleton pattern.
	 * 
	 * 
	 * Overcome serialization issue:- To overcome this issue, we have to implement method readResolve() method.


	 */
	
	
	FileOutputStream fout=new FileOutputStream("C:\\Users\\Sachin\\Desktop\\sp.txt");
	ObjectOutputStream oout=new ObjectOutputStream(fout);
	oout.writeObject(st1);									// write SingleTone object st1 in file sp.txt
	
	FileInputStream fin=new FileInputStream("C:\\Users\\Sachin\\Desktop\\sp.txt");
	ObjectInputStream oin=new ObjectInputStream(fin);
	SingleTone instance2 = (SingleTone) oin.readObject(); 
     oin.close(); 

     System.out.println("instance1 hashCode:- " +( st1.hashCode()==instance2.hashCode())); 
		
	}
	
}
