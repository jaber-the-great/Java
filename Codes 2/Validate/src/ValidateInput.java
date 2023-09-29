/**
 * Created by jaberdaneshamooz on 10/5/2017 AD.
 */
public class ValidateInput
    {

        public static boolean validatefirstName(String firstname)
            {
                return firstname.matches("[A-Z][a-z A-Z]*");
                //first name starts with capital letter and the rest
                //should be capital or lowercase letters
                //* is applied to second bracket; zero or more
            }

        public static boolean validatelastName(String lastname)
            {
                return lastname.matches("[a-z A-Z]+(['-][a-z A-Z]+)*");
                        //first + applied to first bracket ; one or more
                // * is applied to whole parenthesis

            }
        public static boolean validateAddress(String address)
            {
                return address.matches("\\d+\\s+([a-z A-Z]| [a-z A-Z]+\\s[a-z A-Z]+)");
                //does not work correctly
                //problematic
                // \\d is \d
                //one or more digits followed by one of more spaces
            }

        public static boolean validateZipcode(String zipcode)
            {
               return zipcode.matches("\\d{5}");
               // we want precisely 5 digits
            }
        public static boolean validatePhonenumber(String phonenumbre)
            {
                return phonenumbre.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
                // [1-9] because it can not start with zero
            }


    }
