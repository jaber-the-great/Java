public class ChainedException {

    public static void main(String[] args)
    {
        try
        {
            method1();
        }
        catch (Exception except)
        {
            except.printStackTrace();
        }
    }

    public static void method1() throws Exception
    {
        try
        {
            method2();
        }
        catch (Exception except)
        {
            throw new Exception("Exception thrown in method1 ",except);
        }

    }

    public static void method2() throws Exception
    {
        try
        {
            method3();
        }
        catch (Exception except)
        {
            throw new Exception("Exception thrown in method2 ",except);
        }
    }

    public static void method3() throws Exception
    {
        throw new Exception("Exception thrown in method3");
    }
}
