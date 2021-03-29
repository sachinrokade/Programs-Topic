package Degisn_Patren;
abstract class Animal
{
	abstract String speck();
	
}

class Cat extends Animal
{
	
	String speck() 
	{
		return "Meow";
	}
	
}
class Lion extends Animal
{
	String speck() 
	{
		return "Rore";
	}
	
}
class Shark extends Animal
{
	String speck() 
	{
		return "Cant speak";
	}
	
}
class Octops extends Animal
{
	String speck() 
	{
		return "Squawck";
	}
	
}
class Dog extends Animal
{
	String speck() 
	{
		return "Bark Bark";
	}
	
}
interface AnimalFactoreis
{
  Animal getAnimal(String type);
}

class LandFactory implements AnimalFactoreis
{

	@Override
	public Animal getAnimal(String type) 
	{
		
		if(type.equals("Cat"))
			return new Cat();
		else if(type.equals("Dog"))
			return new Dog();
		else if(type.equals("Lion"))
			return new Lion();
		else
			return null;
	}
	
}

class SeaFactory implements AnimalFactoreis
{

	@Override
	public Animal getAnimal(String type) 
	{
		if(type.equals("Shark"))
			return new Shark();
		else if(type.equals("Octopas"))
			return new Octops();
		else
			return null;
	}
}
class AnimalFactory 
{
	public static Animal getInstance(AnimalFactoreis a,String type)
	{
		return a.getAnimal(type);
		
	}
}


public class AbstractFactory_Design {

	public static void main(String[] args) 
	{
		
		AnimalFactoreis af=new SeaFactory();
		Animal l=AnimalFactory.getInstance(af,"Dog");
		System.out.println(l.speck());
	}

}


/**
  *
 *
 *
 *
 */

