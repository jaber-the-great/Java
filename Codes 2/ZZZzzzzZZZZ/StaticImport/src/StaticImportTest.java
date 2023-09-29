import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
import static java.lang.Math.*;// for all of static functions of math
public class StaticImportTest {

    public static void main(String[] args)
    {
	    System.out.printf("%.9f%n",PI);
        System.out.printf("%.4f%n",sqrt(891));
        
        System.out.printf("%d%n",abs(-15));
        System.out.printf("%.12f%n",E);

    }
}
