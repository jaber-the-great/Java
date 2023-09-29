public class PayableInterfaceTest {

    public static void main(String[] args)
    {

        Payable [] PayablePersons=new Payable[4];
        PayablePersons[0]=new Invoice("34239","seat",254,64.3);
        PayablePersons[1]=new Invoice("82342","laptop",25,1999.9);
        PayablePersons[2]=new SalariedEmployee("Jaber","Danesh","234-51-9371",840.72);
        PayablePersons[3]=new SalariedEmployee("Abazar","Danesh","111-25-9238",421.5);


        System.out.printf("The Polymorphic Processing : %n");

        for(Payable currentPerson :PayablePersons )
        {
            System.out.printf("%s%nPayment due : $%,.2f%n%n",currentPerson,currentPerson.getPaymentAmount());
        }
    }
}
