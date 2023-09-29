
import java.util.Scanner;

public class AccountTest
{

	public static void main(String[] args) 
	{
	Scanner inp=new Scanner (System.in);
	//Account jaber=new Account();//for when we do not have defined a constructor and java runs it's default constructor
	//and gives the instance variable the null value
	Account account1 = new Account ("jaber daneshamooz",100.13);
	Account account2=  new Account ("john broke",-3);
	//System.out.printf("Initial name is : %d%n",jaber.Getname());
	System.out.printf("%s\t%.2f$\n",account1.Getname(),account1.GetBalance());
	System.out.printf("%s\t%.2f$\n",account2.Getname(),account2.GetBalance());
	System.out.println("Enter the name :");
	String thename=inp.nextLine();
	account1.Setname(thename);
        double depos=inp.nextDouble();
    
	account1.deposit(depos);
		System.out.printf("changin the account 1 %n%s\t%.2f$\n",account1.Getname(),account1.GetBalance());
	System.out.println("Enter the balance :");
	Double thebalance=inp.nextDouble();
	Account account3= new Account(thename,thebalance);
	System.out.printf("%s\t%.2f$\n",account3.Getname(),account3.GetBalance());
	
	}

}
