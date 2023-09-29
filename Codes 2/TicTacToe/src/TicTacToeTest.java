import java.util.Scanner;
public class TicTacToeTest
    {

    public static void main(String[] args)
        {
           Scanner inp=new Scanner(System.in);
           boolean flag=false;
           int pos=0;
           int moveNumber=9;
	       TicTacToe t =new TicTacToe();
	       t.print();
	       while(moveNumber!=0)
               {
                   pos = inp.nextInt();
                   if (t.Movement(pos, flag))
                       {
                           moveNumber--;
                           flag = !flag;
                           t.print();
                       }
                   else
                       {
                           System.out.println("You have entered a wrong position");
                       }
               }
        }

}
