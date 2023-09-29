import javax.imageio.metadata.IIOMetadataNode;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Interest
{
    public static void main(String[] args)
    {
        BigDecimal Principal =BigDecimal.valueOf(1000000.0);
        BigDecimal rate =BigDecimal.valueOf(0.5);

        System.out.printf("%-20s%s%n","Year","Deposit Amount");
        BigDecimal amount=BigDecimal.valueOf(0.0);
        for(int year=0;year<=10;year++)
        {
             amount=Principal.multiply(rate.add(BigDecimal.ONE).pow(year));
        //    System.out.printf("%-20d%s%n",year,amount);//we use %s for showing BigDecimal
            System.out.printf("%-20d%s%n",year,NumberFormat.getCurrencyInstance().format(amount));
            //it is local specific . because I am in Iran , the currency unit is IRR(Iran Rial)

        }
        System.out.printf("The self allocated local is :%20s%n", NumberFormat.getCurrencyInstance(Locale.GERMANY).format(amount));

    }
}
