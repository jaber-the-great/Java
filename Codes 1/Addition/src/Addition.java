
//Receiving and adding 2 numbers and showing the sum

import java.util.Scanner;
//import java.util.*;//this file using all of the classes of java.util package
public class  Addition
{

	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
	int num1,num2,sum;
    System.out.println("Enter the first numner :");
    num1=input.nextInt();
    System.out.println("Enter the second numner :");
    num2=input.nextInt();
    sum=num1+num2;
    System.out.printf("sum is \t %d ", sum);
	}

}
 