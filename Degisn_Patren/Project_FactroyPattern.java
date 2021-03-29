package Degisn_Patren;
interface Device 
{
	
    String getDescibstion();
    String Ports();
}

class Routers implements Device {
    @Override
    public String getDescibstion() {
           return "Router\nDirects data in a network. Passes data between home computers, and between computers and the";
    }

	@Override
	public String Ports() {
		return "2/4/5/8	";
	}
}
class Switchs implements Device {
    @Override
    public String getDescibstion() {
           return "Switch\nAllow connections to multiple devices, manage ports, manage VLAN security settings";
    }
    @Override
	public String Ports() {
		return "Switch is multi port Bridge. 24/48 ports	";
	}
}
class Hubs implements Device {
    @Override
    public String getDescibstion() 
    {
           return "Hubs";
    }
    @Override
	public String Ports() {
		return "2/4/5/8	";
	}
}
class DeviceFactory 
{

    public static Device createDevice (String country) 
    {
    	
    	
    	if (country. equalsIgnoreCase ("router"))
    	{
           return new Routers();
    	}
    	else if(country. equalsIgnoreCase ("switch"))
    	{
           return new Switchs();
    	}
    	else if(country. equalsIgnoreCase ("hub"))
    	{
           return new Hubs();
    	}
    throw new IllegalArgumentException("No such Device");
    }
}
public class Project_FactroyPattern 
{
    public static void main(String args[]) 
    {
           Device Router = DeviceFactory.createDevice("switch");
           System.out.println(Router.getDescibstion());
           System.out.println(Router.Ports());
    }
}
