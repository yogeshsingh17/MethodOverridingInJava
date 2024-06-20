package methodOverriding;

class FourWheeler
{
	public void wheels()
	{
		System.out.println("The four wheeler has 4 wheels");
	}
}

class Car extends FourWheeler
{
	public void wheels()
	{
		System.out.println("The car has 4 small wheels");
	}
}

class Truck extends FourWheeler
{
	public void wheels()
	{
		System.out.println("The truck has 4 large wheels");
	}
}

public class Vehicle 
{

	public static void main(String[] args) 
	{	
		Car c=new Car();
		c.wheels();

	}

}
