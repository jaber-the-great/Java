import java.math.BigDecimal;
public class bigDecimal

    {
    public static void main(String[] args)
        {
	        BigDecimal Ekhtelas=BigDecimal.valueOf(300000000);
			double a=2342.234;
			BigDecimal alaki=BigDecimal.valueOf(a);
			BigDecimal population=BigDecimal.valueOf(70000000);

//	       	a=Ekhtelas.divide(population).doubleValue();
//			BigDecimal sahm=BigDecimal.valueOf(a);
	        BigDecimal yaraneh=BigDecimal.valueOf(4.5);
	        if(Ekhtelas.compareTo(yaraneh)>0)
	            System.out.println("Fuck the life");


        }
    }
