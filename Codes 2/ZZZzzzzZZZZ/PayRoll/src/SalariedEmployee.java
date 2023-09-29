/**
 * Created by jaberdaneshamooz on 9/3/2016 AD.
 */
public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    public SalariedEmployee(String first,String last,String SSN,double weeklySalary)
    {
        super(first,last,SSN);
        if(weeklySalary<0)
        {
            throw new IllegalArgumentException ("Weekly Salary must be >=0");
        }
        this.weeklySalary=weeklySalary;

    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }
    @Override
    public double earnings()
    {
        return getWeeklySalary();
    }
    @Override
    public String toString()
    {
        return String.format("Salaried Employee : %sWeekly Salary : $%,.2f%n",super.toString(),getWeeklySalary());
    }
}
