/**
 * Created by jaberdaneshamooz on 9/1/2016 AD.
 */

//in extends inheritance
//public instances and methods are accessible every where
//protected instance and methods are accessible just in superclass and subclasses not by objects of subclasses
//private instance and methods are not accessible



public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName ,String lastName, String socialSecurityNumber,double grossSale
            , double commissionRate,double baseSalary)
    {

        super(firstName,lastName,socialSecurityNumber,grossSale,commissionRate);

        if(baseSalary<0)
        {
            throw new IllegalArgumentException("base salary must be >=0");
        }

      this.baseSalary=baseSalary;

    }



    public void setBaseSalary(double baseSalary) {


        if(baseSalary<0)
        {
            throw new IllegalArgumentException("base salary must be >=0");
        }

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earning() {
        return baseSalary + (getCommissionRate()*getGrossSale());//privates are accessible through
        //public methods of super class
    }

    public double earning1()
    {
        return getBaseSalary() + super.earning();
    }

    public String toString()
    {

        return String.format( "%s%s%.2f%n", super.toString(),"base Salary :", getBaseSalary());

        /*return String.format("%s: %s  %s%n%s:%s%n%s: %.2f%n%s: %.2f%n%s : %.2f%n","Commission Employee : ",getFirstName(),
                getLastName(), "Social Security Number : ",getSocialSecurityNumber(),"Commission Rate Is : ",
                getCommissionRate(), "Gross Sale Is : ",getGrossSale(),"Base Salary is : ",baseSalary);
        */
    }


}