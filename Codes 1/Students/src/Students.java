
public class Students 
{
	private String name;
	private double Avg;
	
	public Students (String name, double Avg)
	{
		this.name=name;
		if(Avg>=0.0)
		{
			if(Avg<=100.0)
			{
				this.Avg=Avg;
			}
		}
	}
	
	public String GetLetterGrade(int Avg1)
	{
		String letter="";
		
		
		if(Avg1>=70)
			letter="A";
		else if(Avg1>=50)
			letter="b";
		else if(Avg1>=30)
			letter="c";
		else 
			letter="d";
		
		return letter;
	}
	
	
	
}
