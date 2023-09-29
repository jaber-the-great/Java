/**
 * Created by jaberdaneshamooz on 5/15/2016 AD.
 */

import java.security.SecureRandom;
public class DeckOfCards
{
    private static final int NumOfCards=52;
    private static final SecureRandom RandNum=new SecureRandom();
    private  int CurrentCard;
    private Cards [] deck;

    public DeckOfCards()
    {
        String [] faces={"Ace","Deuce","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
        String [] suits={"Hearts","Diamonds","Clubs","Spades"};

        deck =new Cards[NumOfCards];
        CurrentCard=0;
        for (int i=0;i<deck.length;i++)
        {

            deck[i]=new Cards(faces[i%13],suits[i/13]);

        }


    }
    public void Shuffle()//important
    {
        CurrentCard=0;
        for (int i=0;i<deck.length;i++)
        {
            int temporary= RandNum.nextInt(NumOfCards);


        Cards tmp=deck[i];
        deck[i]=deck[temporary];
        deck[temporary]=tmp;

        }

    }
    public Cards DealCards()
    {
        if(CurrentCard<deck.length)
        {
            return deck[CurrentCard++];
        }
    else
            return null;
    }
}
