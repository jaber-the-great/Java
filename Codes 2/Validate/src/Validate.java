// validate address does not work properly
import java.util.Scanner;
public class Validate
    {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter the first name:");
        String firstName=inp.nextLine();
        System.out.println("Please enter the last name:");
        String lastName=inp.nextLine();
        System.out.println("Please enter the Address:");
        String Address =inp.nextLine();
        System.out.println("Please enter the ZipCode:");
        String ZipCode=inp.nextLine();
        System.out.println("Please enter the PhoneNumber:");
        String PhoneNumber=inp.nextLine();

        if(!ValidateInput.validatefirstName(firstName))
            System.out.println("Invalid first name");
            else if(!ValidateInput.validatelastName(lastName))
                System.out.println("Invalid last name");

                else if(!ValidateInput.validateAddress(Address))
                    System.out.println("Invalid address");

                        else if(!ValidateInput.validateZipcode(ZipCode))
                            System.out.println("Invalid zip coed");

                            else if(!ValidateInput.validatePhonenumber(PhoneNumber))
                                System.out.println("Invalid phone number");
                            else
                                System.out.println("All the inputs ars valid");

      System.out.printf("%b%n",ValidateInput.validateAddress(Address));

    }
}
