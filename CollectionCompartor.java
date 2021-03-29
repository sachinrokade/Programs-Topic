import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * 
 * How we can compaer two user defiend Object
 * 
 * follwoing are Two interfase which used to compare user Object
 * 
 * 
 * 
 *1)	 Comparable -
 * 				comparable is an interface, used for natural sorting -
 * 				What is natural sorting
 * 					natural sorting  collection sort no need to specify
 * 				soring mechanism(Paramiter) it means that on what based
 * 			 	which whant to sort as it takes based on domain object
 * 				
 * 			    comparable Intefase has  methods
 * 
 * 					RT	MT
 * 
 *  		m1)		int compareTo(ob)
 * 						in this method we pass an compareable object at a time we can have only one sorting seq, becse this methods return
 * 					only single int value but in case your client want other sorting seq you need to change the domain class compareto 
 * 					method sorting logic
 * 					-- java.lang
 * 	
 * 
 *2)	Comparator
 * 				Comparator is also an interface, used for customized sorting
 * 				what is customized -- in collection sort you can specify sorting seq
 * 		
 * 					RT		MT
 * 
 * 			m1)		int 	compare(ob1,o2)
 * 							this methods take two object as a paramitere one is Collecton an second is user object 
 * 		 	m2)		boolean equals(ob1)  
							this method no need to override bydefault taken it from object class in which we have already an 
							implementation which performs ref equality
 * 		
				in this interfase we can perform many sorting sequences and no need to make changes in domain class becouse we write other class
				for compareing object
 * 				-- java.util
 *     			
 * 
 * 0 -- both objects are equal
 * + -- LHS object is greater so swap is required
 * - -- RHS object is smaller keep as it is
 * 
 * 
 */


public class CollectionCompartor {

	public static void main(String[] args) 
	{

		Student s1=new Student(1,"z",90.23);			//101
		Student s2=new Student(2,"x",89.505);			//102
		Student s3=new Student(1,"a",2.63);			//103
		Student s4=new Student(1,"b",10.2552);			//112
		
		
		//HashSet<Student> set=new HashSet<>();
		ArrayList<Student> list=new ArrayList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
		System.out.println("B4 sort");
		list.forEach(student ->System.out.println(""+student));
/*
 *		by Useing Comparable Interfase
 * 		
 * 
 * 		Collections.sort(list);		//besed On ID
 *		Collections.sort(list);		//besed On Name
 * 		
 */
		
		//by Useing Comparable Interfase
		
		//Collections.sort(list);		//besed On ID
		//Collections.sort(list);		//besed On Name
		
		
		//by Useing Comparator Interfase
		
		//Collections.sort(list);		//besed On ID
		
		
		Collections.sort(list,StudentCompare.stByID);	//besed On Id
		System.out.println("sort By ID");
		list.forEach(student ->System.out.println(""+student));
		
		
		
		Collections.sort(list,StudentCompare.stByName);	//besed On Name
		System.out.println("sort By Name");
		list.forEach(student ->System.out.println(""+student));
		
		
		Collections.sort(list,StudentCompare.stByPrice);	//besed On Price
		System.out.println("sort By Price");
		list.forEach(student ->System.out.println(""+student));
		
		
		Collections.sort(list,StudentCompare.stByPriceAnID);	//besed On Price and ID
		System.out.println("sort By Price and ID");
		list.forEach(student ->System.out.println(""+student));
		
		
		
		
		Collections.sort(list,StudentCompare.stByNameAnID);	//besed On Name and ID
		System.out.println("sort By Name and ID");
		list.forEach(student ->System.out.println(""+student));
		
		
		
		Collections.sort(list,StudentCompare.stByAll);	//besed On All filds
		System.out.println("sort All");
		list.forEach(student ->System.out.println(""+student));


		
	}

}
