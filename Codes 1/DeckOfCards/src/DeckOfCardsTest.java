public class DeckOfCardsTest {

    public static void main(String[] args)
    {
    DeckOfCards Mydeck=new DeckOfCards();
        Mydeck.Shuffle();

        for(int i=1;i<=52;i++)
        {
            System.out.printf("%-25s",Mydeck.DealCards());//important for printing
           // System.out.printf("$-25s",Mydeck.DealCards().toString()); //equals to prev line;
            //at this line it class toString() explicitly and at the prev it class implicitly
            if(i%4 ==0)
                System.out.println();
        }

    }
}
