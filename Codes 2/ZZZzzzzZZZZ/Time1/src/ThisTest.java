/**
 * Created by jaberdaneshamooz on 6/28/2016 AD.
 */
public class ThisTest
{
    public static void main(String[] args)
    {

        SimpleTime time =new SimpleTime(12,43,17) ;
        System.out.println(time.buildString());


    }

}


class SimpleTime {
    private int hour;
    private int minute;
    private int secound;

    public SimpleTime(int hour, int minute, int secound) {
        this.hour = hour;
        this.minute = minute;
        this.secound = secound;


    }


    public String buildString() {

        return String.format("this.toUninversalString %s%ntoUniversalString %s%n ", this.toUiversalString(), toUiversalString());
    }

  public String toUiversalString()
  {

    return String.format("%02d:%02d:%02d",this.hour,this.minute,this.secound);

  }


}