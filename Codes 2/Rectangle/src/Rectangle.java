public class Rectangle {

    public static void main(String[] args)
    {
	    Rect r1=new Rect();
	    Rect r2=new Rect();
	    try
            {
                r1.setL(25);
            }
        catch (IllegalArgumentException e)
            {
                System.out.printf("%n%s%n",e.getMessage());
            }

        r1.setW(3);
	    r1.setL(12);
	    System.out.printf("%.2f%n",r1.area());
        float x= (float)  12.45;
        r2.setL(x);
        r2.setW(25);
        System.out.printf("%.2f%n",r2.area());



    }

}

