package methodOverriding;

class Bank
{
	public void interestRate()
	{
		System.out.println("The iterest rate are: 0%");
	}
}

class PNB extends Bank
{
	public void interestRate()
	{
		System.out.println("The interest rate in PNB is: 6.5%");	
	}
}

class SBI extends Bank
{
	public void interestRate()
	{
		System.out.println("The interest rate in SBI is: 7%");
	}
}

public class Banking 
{

	public static void main(String[] args) 
	{
		SBI s=new SBI();
		s.interestRate();

	}

}
