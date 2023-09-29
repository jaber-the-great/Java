import java.util.Scanner;

public class Population
{

    public static void main(String[] args)
    {
     Scanner inp=new Scanner(System.in);
        double future;
        double rate;
        long pop;
        System.out.printf("Enter The Current Population And Growth Rate : %n");
        pop=inp.nextLong();
        rate=inp.nextDouble();

        for(int year=0;year<6;year++)
        {
            future=pop*Math.pow(1+rate,year);
            System.out.printf("%-10d%d%n",year,(long)future);
        }


    }
}
