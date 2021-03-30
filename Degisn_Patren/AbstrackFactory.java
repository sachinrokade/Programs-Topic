package Degisn_Patren;

interface NetworkDevicePropertice
{
	
	public void bandwiedt();
	public void experix();
	public void port();
}

class Switch implements NetworkDevicePropertice
{

	public Switch()
	{
		System.out.println("Switch");
	}
	@Override
	public void bandwiedt() {

		System.out.println("Switch 450mb andwidth");
		
	}

	@Override
	public void experix() {

		System.out.println("Switch 2018 exper");
		
	}

	@Override
	public void port() {

		System.out.println("Switch 24 port");
	}
	
}
class Router implements NetworkDevicePropertice
{

	public Router()
	{
		System.out.println("Router");
	}
	@Override
	public void bandwiedt() {

		System.out.println("Router 50GB andwidth");
		
	}

	@Override
	public void experix() {

		System.out.println("Router 2018 exper");
		
	}

	@Override
	public void port() {

		System.out.println("Router 12 port");
	}
	
}

public class AbstrackFactory {

	public static void main(String[] args) {
		NetworkDevicePropertice network;
		
		if("switch".equals("switch"))
			network=new Switch();

		if("rout".equals("rout"))
			network=new Router();
		
	}
}
