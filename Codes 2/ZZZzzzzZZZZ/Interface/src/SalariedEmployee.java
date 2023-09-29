/**
 * Created by jaberdaneshamooz on 9/7/2016 AD.
 */
public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    public SalariedEmployee(String firstname, String lastname, String socialSecurityNumber, double weeklySalary)
    {
        super(firstname, lastname, socialSecurityNumber);
        if(weeklySalary<0.0)
        {
            throw new IllegalArgumentException("weekly salary must be .=0");
        }
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary<0.0)
        {
            throw new IllegalArgumentException("weekly salary must be .=0");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return String.format("Salaried Employee : %sWeekly Salary : $%,.2f",super.toString(),getWeeklySalary());
    }

    @Override
    public double getPaymentAmount()
    {
        return getWeeklySalary();
    }
}
