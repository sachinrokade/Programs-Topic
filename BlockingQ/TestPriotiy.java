package BlockingQ;

public class TestPriotiy {
	static int count=0;
	{
	count++; //instance block
	}
	TestPriotiy()
	{}
	TestPriotiy(int i)
	{}
public static void main(String[] args) {
	
	
	TestPriotiy t1=new Test();
	Test t2=new Test(10);
	Test t3=new Test();
	System.out.println(count);//3
	/*PriorityQueue<String> pq = new PriorityQueue<String>(); 
	 pq.add("2"); 
	 pq.add("4");

	 System.out.println("show "+pq);
	 System.out.println(pq.peek() + " ");
 	 pq.offer("1");  
 	 pq.add("3");  

	 System.out.println("show "+pq);
 	 
 	 pq.remove("1");
	  System.out.println(pq.poll() + " ");

	 if(pq.remove("2")) 
		 System.out.println(pq.poll() + " ");
	 else
		 System.out.println(pq.poll() + " " +pq.peek());*/
}
}
