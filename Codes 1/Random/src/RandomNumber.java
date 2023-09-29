import java.security.SecureRandom;
//import java.security.*; uses all of the classes of package

public class RandomNumber
{

    public static void main(String[] args)
    {

                int fre1=0,fre2=0,fre3=0,fre4=0,fre5=0,fre6=0;

                int dice;
                SecureRandom SRand = new SecureRandom();
                for (int i=0; i <=6000000; i++)
                {
                    dice=1+SRand.nextInt(6);
                   // System.out.printf("%d%n" , dice);
                    switch (dice)
                    {
                        case 1:
                            fre1++;
                            break;
                        case 2:
                            fre2++;
                            break;
                        case 3:
                            fre3++;
                            break;
                        case 4:
                            fre4++;
                            break;
                        case 5:
                            fre5++;
                            break;
                        case 6:
                            fre6++;
                            break;

                    }
                }
System.out.printf("%d%n%d%n%d%n%d%n%d%n%d%n" , fre1,fre2,fre3,fre4,fre5,fre6);

    }
}
