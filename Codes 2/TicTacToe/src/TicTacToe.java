/**
 * Created by jaberdaneshamooz on 7/16/2017 AD.
 */
public class TicTacToe
    {
        private  State ch [][]=new State [3][3];

        public TicTacToe()
            {
                for(int i=0;i<3;i++)
                    {
                        for (int j=0;j<3;j++)
                            {
                                ch[i][j]=State.em;
                            }
                    }
            }

        public  void print()
            {
                for(State []temp : ch)
                    {
                        System.out.println("");
                        for(State temp1 : temp)
                            {
                                System.out.printf("%s\t\t",temp1.getName());
                            }
                    }
                System.out.println();
            }
        public boolean CanMove(int pos)
            {
                if(ch[pos/10][pos%10]==State.em)
                    return true;

                return false;
            }

        public boolean Movement(int pos,boolean flag)
            {
                if(CanMove(pos) && flag)
                    {
                        ch[pos/10][pos%10]=State.isO;
                        return true;
                    }
                else if(CanMove(pos) && !flag)
                    {
                        ch[pos/10][pos%10]=State.isx;
                        return true;
                    }
                else
                    System.out.println("Wrong Position");
                    return false;
            }
    }
