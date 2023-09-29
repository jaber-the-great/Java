/**
 * Created by jaberdaneshamooz on 9/3/2016 AD.
 */
public class CommissionEmployee extends Employee
{
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstname,String lastname,String SSN,double commissionRate,double grossSales)
    {
        super(firstname,lastname,SSN);
        if(grossSales<0.0)
        {
            throw new IllegalArgumentException("gross sales must be >=0.0");
        }
        if(commissionRate<0.0)
        {
            throw new IllegalArgumentException("commission rate must be >=0");
        }
        this.commissionRate=commissionRate;
        this.grossSales=grossSales;

    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate<0.0)
        {
            throw new IllegalArgumentException("commission rate must be >=0");
        }
        this.commissionRate = commissionRate;
    }


    public double getGrossSales() {
        return grossSales;
    }


    public void setGrossSales(double grossSales) {
        if(grossSales<0.0)
        {
            throw new IllegalArgumentException("gross sales must be >=0.0");
        }
        this.grossSales = grossSales;
    }

    @Override
    public String toString()
    {
        return String.format("commission employee : %sGross Sales : %s%nCommission Rate : %s%n",super.toString(),
                getGrossSales(), getCommissionRate());
    }
    @Override
    public double earnings()
    {
    return getCommissionRate()*getGrossSales();
    }
}
