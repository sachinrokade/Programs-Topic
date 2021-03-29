

import java.util.HashSet;
import java.util.Hashtable;

/*
 *
 *
 *  in this program we cant override hashCode and equals methods of student class for that reason java called its own hashCode and equals 
 *  methods of Object and hashCode() and equals() are perform action on the basic of memoery add. i.e
 *  
 *  hashCode()	== check address base compersion
 *  equals()	== check ref. based equlity
 *  
 *  and in following program each object store in deffernt location even if object content same value and each location has deffernt memory
 *  add. and our hashcode is calculate on the basis of memory add. which never same 
 * 
 *  	
 *  
 *  			
 *  
 *  thats whay its break the set properties
 *  Set properties
 *  				
 *  				1) duplicates are not allowed
 * 					2) single null is allowed
 * 											only one null object is allowed
 * 					3) sequence order is not maintained
 * 											becouse in set object is store in bucket [index]
 * 											and index are calculate base on memory add. and 
 * 											memory add. is vary for  object.	
 * 
 * 		
 * HOW THE FOLLOWING PROGRAM RUN
 * 
 * 
 *P1) 		when we create HashSet<Student> set=new HashSet<>(); constructer
 * 			its call HashMap constructer becouse HashSet internal work on Map principle [p1.1]
 * 			and when we call add() of HashSet  its called put() of Map
 * 
 * 
 * 			RT		 		MT
 * 	m1)		boolean 		add( Object )
 * 	m2)		Object			put (K (Object) ,V (Present) )	V= Present in case of HashSet
 * 	
 * 			if(m2==null)
 * 							Then two Object is not Duplicates
 * 			if(m2!=null)
 * 							Then it return value of pervious Object.
 * 
 * 
 * 		p1.1) What is Hashing 
 * 			Hashing is a simplest way to assgin uniqe code for Object after applying some algo/funaction on its value
 * 			*	 a Hash Function should return same HashCode each and every time
 * 			*	 when  Hash Function is applied on some 2 equals Objects the 2 equals sholud be produce same hashCode 
 * 				it means that two equals Objects has must be same HashCode
 *			
 *			Hashing----->Bucket------->index [P2] 
 * 
 *
 * 
 * 
 *P2)		How to find bucket [index]	?
 * 					following are some procdeuer to find bucket [index]
 * 					Note The By Defualt Buket Size is 16 
 * 					this Buket use Array Data Structer .
 * 
 * 		
 * 						return        	methode												Des.
 * 		
 *			M1) 		HEX				HashCode() 									this method return Hex. number this is acutal memory 
 * 																					address of object this add. is genretd by OS so java use
 * 																					native mothods for and we dont pass any parametre in thiis 
 * 																					method but this Hex. no. we cant use in bucket 
 * 																					so we must need to convert into Integer
 * 
 *			M2) 		int				Hash(HashCode())								this method return integer conversation of Hex. number we
 * 										or HashValue(HashCode())						calculate on HashCode() 
 * 									
 * 			M3)			int 			indexFor(hash,TableSize OR Bucket Length)	this method give the acutal bucket index, in this method we pass
 * 																					two value 1 is value we calculate form [M3] and 2nd is length of 
 * 																					ur bucket which intile 16 java does this calculation by useing 
 * 																					some formula that is 
 * 																							int bucket_index=memoery add & range;
 * 																					example
 * 																							int bucket_index=10001 & 15;
 * 																					Note ==	we pass rang is between 1 to 15 becouse
 * 																					0th index is reserve for null Object
 * 
 * 
 * P3) 			After finding Index we store one Object in that is index this Objcet is called as Entery Object
 * 				Entery Object has some structre like LinkedList
 * 
 * 				
 * 
 * 				static class Entry<K ,V> implements Map.Entry<K ,V>
				{
    				final K key;			//actual Object i.e User Object
    				V value;				// Defulat value is Present in case of Set collection [of type Object] 
    				Entry<K ,V> next;		//ref. of the current Entry<K ,V>
    				final int hash;			//Bucket Index 
    			}
 * 
 * Bucket Struchre
 * 
 * Index
 * 			------------
 * 0		|			|
 *  		------------						---------------------------------
 * 1		|			|	---------------		| Key	| Value	| Hash	| next   |
 *  		-------------						---------------------------------
 * 2 		|			
 * ' 		-------------
 * 15 		|			|
 *  		------------
 *  
 *  In Our Program
 *  
 *  
 *  Index
 * 			------------
 * 0		|			|
 *  		------------						---------------------------------
 * 1		|			|	---------------		| 	| Value	| Hash	| next   |
 *  		-------------						---------------------------------
 * 2 		|			
 * ' 		-------------
 * 15 		|			|
 *  		------------
 *  
 *  
 *  			*	two Differnt Object has same Bucket
 * 				*	if Object has same Content the Bucket should be same
 * 
 * 				WHAT IS HASH COLLESION
 *  				Tow or more Object store in same bucket that time Hash Collesion condn. comes
 * 
 *
 * P4) 				consider that if two unequal objects can have same hashcode value, how two different objects will be stored in same bucket.
 * 					in Entry class had an attribute “next”. This attribute always points to next object in chain. This is exactly the behavior
 * 					 of LinkedList. So, in case of collision, Entry objects are stored in LinkedList form. When an Entry object needs to be stored in 
 * 					particular index, HashMap checks whether there is already an entry?? 
 * 
 * 					If there is no entry already present, Entry object is stored in this location.
 * 					If there is already an object sitting on calculated index, its next attribute is checked. 
 * 						If it is null, and current Entry object becomes next node in LinkedList. 
 * 						If next variable is not null, procedure is followed until next is evaluated as null.
 * 
 * 				    What if we add the another value object with same key as entered before. 
 * 					Logically, it should replace the old value. How it is done? Well, after determining the index position of Entry object, 
 * 					while iterating over LinkedList on calculated index, HashMap calls equals method on key object for each Entry object. 
 * 					All these Entry objects in LinkedList will have similar hash code but equals() method will test for true equality. 
 * 					If key.equals(k) will be true then both keys are treated as same key object. This will cause the replacing of value 
 * 					object inside Entry object only.In this way, HashMap ensure the uniqueness of keys. 
 * 
 *  
 *  
 *  
 *  
 * 		
 */

public class CollectionSet1{

	public static void main(String[] args) 
	{
		Student s1=new Student(1,"z",90.23);			//101
		Student s2=new Student(2,"x",89.505);			//102
		Student s3=new Student(1,"a",2.63);				//103
		Student s4=new Student(1,"b",10.2552);			//112

		HashSet<Student> set=new HashSet<>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		System.out.println(""+set.size());
		
		for(int i=101;i<=104;i++)
		{
			System.out.println(i+" add of Bucket "+(i%10));
		}
	}
}