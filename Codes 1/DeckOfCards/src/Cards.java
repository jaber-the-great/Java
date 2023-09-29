/**
 * Created by jaberdaneshamooz on 5/15/2016 AD.
 */
public class Cards {
    private final String face;
    private final String suit;

    public Cards(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

     public String toString() {
        return face  +  " Of "  +  suit;
    }
}