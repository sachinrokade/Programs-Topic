package Degisn_Patren;
interface Currency 
{
    String getSymbol();
}

class Rupee implements Currency {
    @Override
    public String getSymbol() {
           return "Rs";
    }
}
class SGDDollar implements Currency {
    @Override
    public String getSymbol() {
           return "SGD";
    }
}
class USDollar implements Currency {
    @Override
    public String getSymbol() 
    {
           return "USD";
    }
}
class CurrencyFactory 
{

    public static Currency createCurrency (String country) 
    {
    	if (country. equalsIgnoreCase ("India"))
    	{
           return new Rupee();
    	}
    	else if(country. equalsIgnoreCase ("Singapore"))
    	{
           return new SGDDollar();
    	}
    	else if(country. equalsIgnoreCase ("US"))
    	{
           return new USDollar();
    	}
    throw new IllegalArgumentException("No such currency");
    }
}
public class Factroy_Design 
{
    public static void main(String args[]) 
    {
           Currency rupee = CurrencyFactory.createCurrency("india");
           System.out.println(rupee.getSymbol());
    }
}
