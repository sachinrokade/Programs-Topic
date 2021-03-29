import java.util.ArrayList;

import Queque.BlockingArray;

class TestExp1
{
	public void m1()
	{

		System.out.println("No Def Error 1");
	}
}


public class TestExpDefError
{
	public static void main(String[] args) 
	{
		
		
		TestExp1 t1=new TestExp1();
		t1.m1();
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(1235);
		al.add(125);
		al.add(1255);
		
		System.out.println("No Def Error "+al);
		
	}
}
