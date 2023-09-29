import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionHandling {

    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        boolean ContinueLoop =true;
        int numerator;
        int denominator;
        int result;

        do {
            try
            {
                System.out.print("Enter numerator : ");
                numerator = inp.nextInt();
                System.out.print("Enter denominator : ");
                denominator = inp.nextInt();
                result=quotient(numerator,denominator);
                System.out.printf("Result = %s",result);
                ContinueLoop=false;
            }

            catch (InputMismatchException inpMisMach) {
                System.err.printf("%nException : %s%n", inpMisMach);// it can be System.out.printf() and
                //have a better look in console
                inp.nextLine();// we assign it to nothing so it discards the inp Object
                // if we don't write prev line , after we catch this kind of exception , we will
                // trap into an infinite loop
                System.out.printf("you must input integer values :%n");

            }
            catch (ArithmeticException ArithEx)
            {
                System.err.printf("%nException : %s%n",ArithEx);
                System.out.printf("Zero is an invalid denominator :%n");
            }
        }while(ContinueLoop);

    }

    public static int quotient(int numerator,int denominator )
            throws ArithmeticException   //it is declared out of block!!!!!!!!!!!!!!!!!
    {
        return numerator/denominator;
    }
}
