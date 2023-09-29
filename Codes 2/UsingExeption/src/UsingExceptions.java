
import java.util.Scanner;
public class UsingExceptions {

    public static void main(String[] args)
    {
       // Scanner inp=new Scanner(System.in);
       // int a;
      //  a=inp.nextInt();
        try
        {
            throwException();
        }

        catch (Exception exception)
        {
        System.err.println("Exception Handled in Main ");
        }

        doesNotThrowException();

    }



    public static void throwException() throws Exception
    {
        try
        {
        System.out.println("Method Throw Exception");// with err , it is better to use println
        throw new Exception();
            //codes after throw does not execute
        }
        catch (Exception exception)
        {
            System.err.println("Exception Handled in method throwException%n");
            throw exception;// rethrow for further processing
            //codes after throw does not execute
        }
        finally {
            System.err.println("finally block executed in method throwException");

        }
    }



    public static void doesNotThrowException()
    {
        try
        {
            System.out.println("method doesNotThrowException");
        }
        catch (Exception exception)//does not execute because try block does not throw exception
        {
            System.err.println(exception);
        }
        finally
        {
            System.err.println("finally block executed in doesNotThrowException method");
        }

        System.out.println("end of doesNotThrowExecption method");
    }


}
