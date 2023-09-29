import java.util.IllegalFormatCodePointException;
import java.util.concurrent.TimeUnit;

public class Time1_test
{

    public static void main(String[] args) throws InterruptedException
        {
        Time1 time=new Time1();
        Display("Afther creating the object",time);
      //  time.SetTime(16,75,26);
      //  Display("After calling settime with illegal argument",time);
        time.SetTime(17,14,56);
        Display("After calling settime with correct argument",time);
        Time1 t1=new Time1();
        Time1 t2=new Time1(12);
        Time1 t3=new Time1(7,3);
        Time1 t4=new Time1(15,7,39);
        Time1 t5=new Time1(t4);
        Display("t1 is : ",t1);
        Display("t2 is : ",t2);
        Display("t3 is : ",t3);
        Display("t4 is : ",t4);
        Display("t5 is : ",t5);
        TimeUnit.SECONDS.sleep(1);// for sleeping


        try
        {
            time.SetTime(17,99,99);
        }
        catch ( IllegalArgumentException e)
        {
            System.out.printf("Exception %s%n",e.getMessage());//important
        }
        Display("After Exception",time);

    }



    public static void Display(String header,Time1 t)
    {
    System.out.printf("%s%n%s\t%s%n",header,t.ToUniversalString(),t.toString());
       // System.out.printf("%s\t%s\t%s%n",header,t.ToUniversalString(),t); //eqaul to prev line
    }
}
