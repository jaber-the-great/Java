//defining  a class 

public class Account
{
	private String name;//instance variable - it will be self initialized if we don't assign
	//for strings , it is null for other is 0
	private double balance;//
	
	public Account(String name,double balance)//constructor
	{
		this.name=name;
		
		if(balance>0.0)
		{
		this.balance=balance;
		}
	}
	
	public void deposit(double depositAmmount)
	{
		if(depositAmmount>0.0)
			balance+=depositAmmount;
	}
	
	public double GetBalance()
	{
		return balance;
	}
	public void Setname(String name)//method
	{
		this.name=name;
	}
	public String Getname()
	{
		return name;
	}
	
}

/***********************************************************************/