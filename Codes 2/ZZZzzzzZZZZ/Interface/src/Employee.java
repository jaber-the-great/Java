/**
 * Created by jaberdaneshamooz on 9/7/2016 AD.
 */
public abstract class Employee implements Payable
    // we did not implement the getPayableAmount method of Payable interface
    // so we defined Employee class abstract to prevent compilation error
{
    private final String firstname;
    private final String lastname;
    private final String socialSecurityNumber;

    public Employee(String firstname, String lastname, String socialSecurityNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString()
    {
        return String.format("%s   %s%nSSN : %s%n",getFirstname(),getLastname(),getSocialSecurityNumber());
    }

}
