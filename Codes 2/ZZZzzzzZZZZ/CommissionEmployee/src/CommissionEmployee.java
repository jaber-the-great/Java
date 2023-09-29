

public class CommissionEmployee extends Object
    // if we do not write extends Object , the compiler automatically implicitly calls it
    // like other single classes I've defined;
{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(String firstName ,String lastName, String socialSecurityNumber,double grossSale
            , double commissionRate)
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
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;
        this.grossSale=grossSale;
        this.commissionRate=commissionRate;

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


    public double earning ()
    {
        return commissionRate*grossSale;

    }
    @Override    //we are overriding the superclass method
    public String toString()
    {
        return String.format("%s: %s  %s%n%s:%s%n%s: %.2f%n%s: %.2f%n","Commission Employee : ",firstName,lastName,
                "Social Security Number : ",socialSecurityNumber,"Commission Rate Is : ",commissionRate,
                 "Gross Sale Is : ",grossSale);

    }

}
