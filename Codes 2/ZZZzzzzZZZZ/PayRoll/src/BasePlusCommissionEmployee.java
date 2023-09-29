/**
 * Created by jaberdaneshamooz on 9/3/2016 AD.
 */
public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstname, String lastname, String SSN, double commissionRate,
                              double grossSales,double baseSalary)
    {
        super(firstname, lastname, SSN,commissionRate,grossSales);
        if(baseSalary<0.0)
        {
            throw new IllegalArgumentException("base salary must be >=0");
        }
        this.baseSalary=baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary<0.0)
        {
            throw new IllegalArgumentException("base salary must be >=0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings()//because we defined earnings in Commisssion Employee, we are not forced
            //to provide this method here and vice versa because the the superclass(Commission Employee)
            //is concrete and is not abstract
    {
        return getBaseSalary()+super.earnings();
    }

    @Override
    public String toString()
    {
        return String.format("Base Salaried Employee : %sBase Salary : $%,.2f%n",super.toString(),getBaseSalary());
    }
}

