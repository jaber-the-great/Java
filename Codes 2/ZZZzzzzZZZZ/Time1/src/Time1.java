/**
 * Created by jaberdaneshamooz on 5/18/2016 AD.
 */
public class Time1
{
private int sec,min,hour;
   public void SetTime(int hour,int min , int sec)
    {
        if (hour<0 || hour>23 )
        {
            throw new IllegalArgumentException("hour is out of range");
        }

        if(min<0 || min > 59)
        {
            throw new IllegalArgumentException("minute is out of range");

        }
        if(sec<0 || sec >59)
        {
            throw new IllegalArgumentException("second is out of range");
        }

        this.sec=sec;
        this.min=min;
        this.hour=hour;

    }



    public Time1()
    {
        this (0,0,0);
    }

    public Time1(int hour)
    {
        this(hour,0,0);
    }

    public Time1(int hour,int min)
    {

        this(hour,min,0);
    }


    public Time1(int hour,int min , int sec)//if this function does not exist , the three upper function
            // does not work and have compilation error
    {
        if (hour<0 || hour>23 )
        {
            throw new IllegalArgumentException("hour is out of range");
        }

        if(min<0 || min > 59)
        {
            throw new IllegalArgumentException("minute is out of range");

        }
        if(sec<0 || sec >59)
        {
            throw new IllegalArgumentException("second is out of range");
        }

        this.sec=sec;
        this.min=min;
        this.hour=hour;

    }

    public Time1(Time1 time)

    {

        this (time.getHour(),time.getMin(),time.getSec());
       // this(time.hour,time.min,time.sec);//in a method of a class , we can directly access the private data
        //of the other object of the exact the same class

    }
    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }


    public void setSec(int sec) {
        this.sec = sec;
    }

    public String ToUniversalString()//important
    {
        return String.format("%02d:%02d:%02d",hour,min,sec); //left zero fill

    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d:%s",((hour ==0 || hour==12) ? 12 : hour%12),min,sec,
                (hour <12 ? "AM" : "PM"));
    }
}
