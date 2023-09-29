/**
 * Created by jaberdaneshamooz on 5/15/2016 AD.
 */
public class GradeBook
{
private String CourseName;
    private int[] marks;

    public GradeBook(String name, int [] grade)
    {
        this.CourseName=name;
        this.marks=grade;       //important
    }


    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public void getCourseName() {
        System.out.printf("the course name is : %s",this.CourseName);
    }

    public int LowerGrade()
    {
    int lower=marks[0];
        for(int num :marks)
        {
            if (num<lower)
                lower=num;
        }
        return lower;

    }

    public void processGrade() //static method can only call static instances and methods
    {
    GetAverage();//it does not make problem to call a method that returns a value
        //but do not assigning it to related type
    LowerGrade();// it does not matter to define a method that is used in another  , after or before it
   // this.GetAverage();// is equal to prev line
        System.out.printf("the average is %2f%n",GetAverage());
        System.out.printf("the minimum grade is %d%n",LowerGrade());

    }

    public  double GetAverage()
    {
        int total=0;
        int counter=0;
        for (int num : marks)
        {
            total += num;
            counter++;
        }
        return (double) total / counter; //cast
    }
}
