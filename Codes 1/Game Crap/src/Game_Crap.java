import java.security.SecureRandom;

public class Game_Crap
{
    private static final SecureRandom randnum=new SecureRandom();
//final : reference never will refer to another object ===> constant
    private enum Status {Conti ,won, lost};//conti is 0 ,won is 1,lost is 2 like true/false
    private static final int Snake_EYES=2;
    private static final int tery=3;
    private static final int SeVen=7;
    private static final int yoleween=11;
    private static final int boxcars=12;
    
    public static void main(String[] args)
    {
    int totalpoint=0;
        Status gamestatus;
        int sumroll=Roll();
        switch (sumroll)
        {
            case SeVen:
            case yoleween:
                gamestatus=Status.won;
            case Snake_EYES:
            case tery:
            case boxcars:
                gamestatus=Status.lost;
                default:
                    gamestatus=Status.Conti;
                    totalpoint=sumroll;
                    System.out.printf("point is : %d%n ",totalpoint);
                    break;
        }
        while (gamestatus == Status.Conti)
        {

        sumroll= Roll();
            if(totalpoint==sumroll)
            {
                gamestatus=Status.won;
            }
            else if (sumroll==SeVen)
            {
                gamestatus=Status.lost;
            }
        }
    if(gamestatus==Status.won) {
        System.out.printf("player won");
    }
        else
        System.out.printf("player lost");
    }

    public static int Roll()
    {
        int dice1,dice2;
        dice1=1+randnum.nextInt(6);
        dice2=1+randnum.nextInt(6);
        int sum=dice1+dice2;
        System.out.printf("%d\t%d\t%d%n",dice1,dice2,sum);


        return sum;
    }



}
