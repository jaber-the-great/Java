/**
 * Created by jaberdaneshamooz on 6/28/2016 AD.
 */
public class Date
{
    private int day;
    private int month;
    private int year;

    private static final int DaysOfMonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};

    public Date(int year,int month,int day)

    {
        if(month<=0 || month>12)
        {
            throw new IllegalArgumentException(" Monthe " + month + "is out of range");//important
        }

        if (day<=0 || (day>DaysOfMonth[month] && !(month==2 && day==29)))
        {
            throw new IllegalArgumentException("day" + day + "is out of range");
        }
        if(month==2 && day==29 && !(year%400 ==0 || (year%4==0 && year%100!=0)))
        {
            throw new IllegalArgumentException("day" + day + "is out of range");
        }
        this.year=year;
        this.month=month;
        this.day=day;

        System.out.printf("the constructor for Date class is %s%n" , this);//implicitly call toString method

    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d",year,month,day);
    }
}
