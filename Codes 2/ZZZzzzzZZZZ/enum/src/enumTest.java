import java.util.EnumSet;

public class enumTest {

    public static void main(String[] args)
    {
    for(Book jaber : Book.values())//important
    {
        System.out.printf("%-15s%-50s%s%n",jaber,jaber.getTitle(),jaber.getYear());//important
    }

        System.out.printf("%nUsing The range function of java class for enum :%n%n");
        for(Book Jaber : EnumSet.range(Book.HTDYH, Book.HTMPSIL))//Important
        {
         System.out.printf("%-15s%-50s%s%n", Jaber, Jaber.getTitle(), Jaber.getYear());

        }

    }
}
