public class UsingException1 {

    public static void main(String[] args)
    {

        try
        {
         method1();
        }

        catch (Exception except)
        {
            System.out.printf("%s%n%n",except.getMessage());
            except.printStackTrace();

            StackTraceElement [] traceElements =except.getStackTrace();

            System.out.printf("%nStackTrace from getStackTrace : %n");
            System.out.println("Class\t\t\tFile\t\t\t\t\tLine\t\tMethod%n");
            for(StackTraceElement element : traceElements)
            {
                System.out.printf("%s\t",element.getClassName());
                System.out.printf("%s\t",element.getFileName());
                System.out.printf("%s\t\t\t",element.getLineNumber());
                System.out.printf("%s%n",element.getMethodName());
            }

        }
    }


    public static void method1() throws Exception
    {
        method2();
    }

    public static void method2() throws Exception
    {
        method3();
    }

    public static void method3() throws Exception
    {
        throw new Exception("Exception thrown in method3");
    }
}
