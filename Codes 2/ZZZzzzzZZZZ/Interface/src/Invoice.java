/**
 * Created by jaberdaneshamooz on 9/7/2016 AD.
 */
//public class Invoice extends Object implements Payable
public class Invoice implements Payable
{
    private final String PartNumber;
    private final String PartDescription;
    private int quantity;
    private double PricePerNumber;

    public Invoice(String PartNumber,String PartDescription,int quantity,double PricePerNumber)
    {
        if(quantity<0)
        {
            throw new IllegalArgumentException("quantity must be >=0");

        }
        if(PricePerNumber <0.0)
        {
            throw new IllegalArgumentException("Price Per Number must be >=0");
        }
        this.PartDescription=PartDescription;
        this.PartNumber=PartNumber;
        this.quantity=quantity;
        this.PricePerNumber=PricePerNumber;

    }

    public void setPricePerNumber(double pricePerNumber) {
        if(PricePerNumber <0.0)
        {
            throw new IllegalArgumentException("Price Per Number must be >=0");
        }
        PricePerNumber = pricePerNumber;
    }

    public double getPricePerNumber() {

        return PricePerNumber;
    }

    public void setQuantity(int quantity) {
        if(quantity<0)
        {
            throw new IllegalArgumentException("quantity must be >=0");

        }
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPartDescription() {
        return PartDescription;
    }

    public String getPartNumber() {
        return PartNumber;
    }

    @Override
    public String toString()
    {
        return String.format("%s : %n%s : %s (%s) %n%s : %d %n%s : $%,.2f","Invoice","Part Number",getPartNumber(),
                getPartDescription(),"Quantity",getQuantity(),"Price Per Item ",getPricePerNumber());
    }

    @Override
    public double getPaymentAmount()
    {
return getQuantity() * getPricePerNumber();
    }
}
