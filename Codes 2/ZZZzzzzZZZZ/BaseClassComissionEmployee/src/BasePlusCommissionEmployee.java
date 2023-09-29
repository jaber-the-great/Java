/**
 * Created by jaberdaneshamooz on 9/1/2016 AD.
 */
public class BasePlusCommissionEmployee
{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSale;
    private double commissionRate;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName , String lastName, String socialSecurityNumber, double grossSale
            , double commissionRate, double baseSalary)
    {
        //the implicit call of Object's default constructor occurs here

        if(grossSale<0.0)
        {
            throw new IllegalArgumentException("GrossSale must be a positive number");
        }

        if(commissionRate <=0 || commissionRate >= 1 )
        {
            throw new IllegalArgumentException("the commission must be > 0.0 and < 1.0");
        }
        if(baseSalary<0)
        {
            throw new IllegalArgumentException("baseSalary must be >=0");
        }
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;
        this.grossSale=grossSale;
        this.commissionRate=commissionRate;
        this.baseSalary=baseSalary;

    }

    public double getCommissionRate() {

        return commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    public void setCommissionRate(double commissionRate) {
        if(commissionRate <=0 || commissionRate >= 1 )
        {
            throw new IllegalArgumentException("the commission must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public void setGrossSale(double grossSale) {

        if(grossSale<0.0)
        {
            throw new IllegalArgumentException("GrossSale must be a positive number");
        }

        this.grossSale = grossSale;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary<0)
        {
            throw new IllegalArgumentException("baseSalary must be >=0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earning ()
    {
        return baseSalary + commissionRate*grossSale;

    }
    @Override    //we are overriding the superclass method
    public String toString()
    {
        return String.format("%s: %s  %s%n%s:%s%n%s: %.2f%n%s: %.2f%n%s : %.2f%n","Commission Employee  ",firstName,lastName,
                "Social Security Number  ",socialSecurityNumber,"Commission Rate Is  ",commissionRate,
                "Gross Sale Is  ",grossSale,"Base salary is  ",baseSalary);

    }

}

