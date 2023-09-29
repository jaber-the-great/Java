/**
 * Created by jaberdaneshamooz on 6/28/2016 AD.
 */
public class Employee
{
    private static int count=0;
    private String name;
    private String lastname;
    private Date birhday;
    private Date hiredate;


    public Employee(String name,String lastname,Date birhday,Date hiredate)//a constructor is a static method
    {
        count++;
        this.birhday=birhday;
        this.hiredate=hiredate;
        this.name=name;
        this.lastname=lastname;
    }

    public static int getCount()
    {
        return count;
    }
    public String toString()
    {

        return String.format("%s  %s  Hired : %s   Birthday : %s%n%d",name,lastname,hiredate,birhday,count);
    }

}
