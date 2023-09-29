//comparing numbers

import java.util.Scanner;

public class Comparison 
{

	public static void main(String[] args) 
	{
		int num1,num2;
		Scanner input = new Scanner(System.in);
		System.out.printf("enter the first number :");
		num1=input.nextInt();
		System.out.printf("enter the second number :");
		num2=input.nextInt();
		if(num1==num2)
		{
			System.out.printf("%d == %d%n",num1,num2);
		}
		if(num1!=num2)
		{
			System.out.printf("%d != %d%n",num1,num2);
		}
		if(num1>num2)
		{
			System.out.printf("%d > %d%n",num1,num2);
		}
		if(num1<num2)
		{
			System.out.printf("%d < %d%n",num1,num2);
		}
		
	}

}
