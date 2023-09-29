//Printing in Java
public class Welcome 
{

	public static void main(String[] args) 
	{
	 System.out.println("Welcome to Java programming!"); 
	 System.out.println("this is the next line!");
	 System.out.print("Welcome to Java programming!"); 
	 System.out.println("this is  _NOT_ the next line!");
	 System.out.print("Welcome\nto\nJava\nprogramming!\n/////////////");//the \n is NOT portable all times
	 System.out.printf("%n%n%s%n%s%n%s","Welcome to","Java programming","this is the portable newline command");
	 //this was the portable newline command
	}

}
