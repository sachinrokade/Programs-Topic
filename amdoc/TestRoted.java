package amdoc;

import java.util.LinkedList;
import java.util.Stack;

public class TestRoted {

	public static void main(String[] args) {
		LinkedList<Box> listBoxes = new LinkedList<>();
		Stack<Box> anotherBoxList=new Stack<>();
		
		Box a = new Box(5.1f,"India");
		Box b = new Box(3.7f,"Japan");
		Box c = new Box(8.2f,"Thailand");
		listBoxes.add(a);
		listBoxes.add(b);
		listBoxes.add(c);
		
		anotherBoxList.push(a);
		anotherBoxList.push(b);
		anotherBoxList.push(c);
		
		System.out.println(listBoxes.poll().equals(anotherBoxList.pop()));
	/*
		File sr=new File("C:\\Users\\sachin\\Desktop\\input.txt");
		File des=new File("C:\\Users\\sachin\\Desktop\\out.txt");
		copy(sr,des);*/
		
	}
}

class Box{
	private float weight;
	private String address;
	public Box(float weight,String address) {
		super();
		this.weight=weight;
		this.address=address;
		
	}
	

	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

}
	/*public static void copy(File src, File des) throws FileNotFoundException, IOException {
		
		try(InputStream input=new FileInputStream(src);
				OutputStream out=new FileOutputStream(des))
		{
			byte[] buffer=new byte[1024];
			int byteRead=0;
			while((byteRead=input.read(buffer))>0)
			{
				out.write(buffer,0,byteRead);
			}
		}
	}
	
}*/