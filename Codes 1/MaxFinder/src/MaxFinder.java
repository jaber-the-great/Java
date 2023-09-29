
import java.util.Scanner;

public class MaxFinder {

    public static void main(String[] args) {
    Scanner Inp=new Scanner(System.in);
        System.out.printf("Enter 3 floating point value separated with space\n");
        double a=Inp.nextDouble();
        double b=Inp.nextDouble();
        double c=Inp.nextDouble();
        double result=max(a,b,c);
        System.out.printf("maximun is : " + result );//important session 53 of part I
        System.out.printf("maximum is : " + max(a,b,c));


    }
    public static double max(double a,double b,double c)
    {
        double maxim=a;
        if(b>maxim)
            maxim=b;
        if(c>maxim)
            maxim=c;

        return maxim;
    }


}

