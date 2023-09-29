import java.util.Scanner;

public class StudentsTest 
{

	public static void main(String[] args) 
	{
		Scanner inp=new Scanner (System.in);
		Students jaber=new Students("jaber",17.07);
		int counter=0,total=0,grade,avrage;
		while(counter<10)
		{
			System.out.println("Enter the number :");
			grade=inp.nextInt();
			total+=grade;
			counter++;
		}
		avrage=total/10;
		System.out.printf("The avrage is : %d%n%s%nthe total is : %d%n",avrage,jaber.GetLetterGrade(avrage),total);
	}




}
