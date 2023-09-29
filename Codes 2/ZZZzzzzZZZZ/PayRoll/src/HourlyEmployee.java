/**
 * Created by jaberdaneshamooz on 9/3/2016 AD.
 */
public class HourlyEmployee extends Employee
{
    private double wage;
    private double hours;

    public HourlyEmployee(String first,String last,String SSN,double wage,double hours)
    {
        super(first,last,SSN);
        if (wage<0.0)
        {
            throw new IllegalArgumentException("wage must be >=0");
        }
        if ((hours<0.0) || (hours>168.0))
        {
            throw new IllegalArgumentException("hours worked must be >=0 or <=168");
        }

        this.wage=wage;
        this.hours=hours;
    }

    public void setHours(double hours) {
        if ((hours<0.0) || (hours>168.0))
        {
            throw new IllegalArgumentException("hours worked must be >=0 or <=168");
        }
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }

    public void setWage(double wage){
        if (wage<0.0)
        {
            throw new IllegalArgumentException("wage must be >=0");
        }
        this.wage=wage;
    }

    public double getWage(){
        return wage;
    }

    @Override
    public String toString()
    {
    return String.format("Hourly Employee : %sHourly Wage : $%,.2f%nHours Wage : $%,.2f%n",super.toString()
    ,getHours(),getWage());

    }

    @Override
    public double earnings()
    {
     if(getHours()<=40.0)
     {
         return getHours()*getWage();
     }
        else
         return 40*getWage() + (getHours()-40)*getWage()*1.5;
    }
}





