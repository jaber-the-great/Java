public class MethodOverloading {

    public static void main(String[] args)

    {
        System.out.printf("the integer square is : %d%n",square(42));
        System.out.printf("the double square is : %f%n",square(3.97));
    }
    public static int square (int num)
    {
        return num*num;
    }

    public static double square(double num)
    {
        return num*num;
    }
}
