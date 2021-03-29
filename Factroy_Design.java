interface Features
{
	void cam_px();
}


class Samsang implements Features
{
	public void cam_px()
	{
		System.out.println("Samsang 20 Mpx");
	}
	
}
class Vivo implements Features
{
	public void cam_px()
	{
		System.out.println("Vivo 25 Mpx");
	}
	
}

class Apple implements Features
{
	public void cam_px()
	{
		System.out.println("Apple 12 Mpx dual cam");
	}
	
}

class Factroy_Design_Pattrn
{
	
	public Features getInstance(String m)
	{
		if(m.equals("vivo"))
			return new Vivo();
		else if(m.equals("sam"))
			return new Samsang();
		else
			return new Apple();
	}
}


public class Factroy_Design {

	public static void main(String[] args) 
	{
		/*		This when we dont use Factory Design Pattern
		 * 
		 * 
		 * 
			Features s=new Samsang();
			Features v=new Vivo();
			Features a=new Apple();
			
		
			s.cam_px();
			v.cam_px();
			a.cam_px();
		

		 * 
		 * 
		 * 
		 * 
		 * Factory pattern is one of the most used design patterns in Java. ... 
		 * In Factory pattern, we create object without exposing the creation 
		 * logic to the client and refer to newly created object using a common interface
		 */
			Factroy_Design_Pattrn f=new Factroy_Design_Pattrn();
			Features f1=f.getInstance("jhkjkjkk");
			f1.cam_px();
			
	}

}
