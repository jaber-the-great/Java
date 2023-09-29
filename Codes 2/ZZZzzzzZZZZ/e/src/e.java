import java.util.Scanner;
public class e {

    public static void main(String[] args)
    {
        double e=1;
        for(int i=1;i<=20;i++)
        {
        e+=((double)1/Fact(i));
            System.out.printf("%d%n",Fact(i));
        }
        System.out.printf("%.15f is the compiler e and %.15f is the calculated e %n",Math.E,e);
    }

    public static long Fact(int inp)
    {
        long ans=1;
        for(int i=1;i<=inp;i++)
        {
            ans*=i;
        }
        return ans;
    }
}
