import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/*
 * 
 * 		Set [i]
 * 		||
 * 		||----------------------SortedSet[i]
 * 		|						|
 * 		|						|
 * 		|						|------ NavigableSet {C}
 * 		|						|
 * 		|---HshSet {C}			|
 * 		|						|
 * 		|						|-------TreeSet    {C}
 * 		|						
 * 		|						
 * 		|---LinkedHashSet{C} 
 * 
 * 				
 * 											Itarable [i]
 *     											|
 *     											|
 *     										Collection[i]
 *     											|
 *     											|
 *     				-----------------------------------------------------------											
 *     				|						     |						      |				
 *     				|						     |						      |
 *     			  List [i]					   Queqe [i]				   Set [i]
 *     				|							^							|	|
 *     				|							|							|	|
 *     				|							|							|	|-------------------------Sorted[i]
 *     				|							|							|								|
 *     				|---ArrayList(C)			|---Priority Queue(C)		|-----HashSet(C)				|-----NavigabelSet(I)
 *     				|							|							|								|
 *     				|							|							|								|------TreeSet(C)
 *     				|---Vector(C)				|							|-----LinkedHashSet(C)
 *     				|		|					|							
 *     				|		|-----Stack			|
 *     				|							|
 *     				|							|							
 *     				|---LinkedList(C)-----------|												
 *     				
 * 
 * 
 * 																							
 *     																			-
 *     																			
 *     
 *     
 * 
 * 
 * 	TreeSet 
 * 			mentend insertion Order
 * 			null not allowed 
 * 
 * 		Why and when we use TreeSet ?
			We prefer TreeSet in order  to maintain the unique elements  in the sorted order .
 * 
 * 
 *		What happend when we store User Deffiend Object in TreeSet
 *				if User Deffined Object Dont Overrried Comparable Interfase in That time the complier give 
 *				ClassCastException: so that the user Object should be implemted compareTo() in class in order 
 *				to store that object in TreeSet
 *
 *		Note ----- this not requre when we store some prediffend class like Integer/String etc
 *					bcose java has allready implemated that interfase
 *			
 * 		Why do we need TreeSet when we already had SortedSet ?
				sortedSet is an interface while TreeSet is the class implementing it. As we know, in java, we can not 
				create the objects of the interface. The class implementing the interface must fulfill the contract of 
				interface, i.e , concrete class must implement all the methods present in the interface. TreeSet is such 
				an implementation.
 * 			
 * 				What happens if the TreeSet is concurrently modified while iterating the elements ?
						The iterator's returned by the TreeSet class iterator method are fail-fast.  
						fail-fast means if the set is modified at any time after the iterator is created , 
						in any way except the iterator's own remove method  , the iterator will throw a 
						ConcurrentModificationException. Thus , in the face of concurrent modification , 
						the iterator fails quickly and cleanly .
		
		Difference between Fail Fast iterator and Fail Safe iterator
						
				http://javahungry.blogspot.com/2014/04/fail-fast-iterator-vs-fail-safe-iterator-difference-with-example-in-java.html
 * 			
 * 		
															Fail Fast Iterator		Fail Safe Iterator
					Throw ConcurrentModification Exception		Yes							 No
					Clone object								No							Yes
					Memory Overhead								No							Yes
					Examples								HashMap,Vector				CopyOnWriteArrayList,
															ArrayList,HashSet			ConcurrentHashMap
 * 		
 * 
 */
import java.util.concurrent.ConcurrentHashMap;

public class CollectionTreeSet {

	public static void main(String[] args) 
	{
		Student s1=new Student(1,"z",90.23);			//101
		Student s2=new Student(2,"x",89.505);			//102
		Student s3=new Student(3,"a",2.63);			//103
		Student s4=new Student(5,"b",10.2552);			//112
		
		
			//TreeSet<Student> list=new TreeSet<>();
		ConcurrentHashMap<Student,String> list=new ConcurrentHashMap<>();
			list.put(s1,"s1");
			list.put(s2,"s2");
			list.put(s3,"s2");
			list.put(s4,"s3");
			
			Set<Student> st=list.keySet();
			
			Iterator<Student> it=st.iterator();
			while (it.hasNext()) 
			{
				Student student = (Student) it.next();

				System.out.println("b "+student);
				list.remove(student);
				System.out.println(" a "+student);
			}
			System.out.println(" \n aftre ");
			
			while (it.hasNext()) 
			{
				Student student = (Student) it.next();

				System.out.println(""+student);
				
			}
			

	}

}
