
public class Benefit {

    public static void main(String[] args)
    {
    double amount=0,principal=10000.00,rate=0.20;
    System.out.printf("%s%20s%n","Year","amount of deposit");//important
    for(int Year=0;Year<=10;Year++)
    {
        amount=principal * Math.pow(rate+1.00,Year);
        System.out.printf("%4d%,20.2f%n",Year,amount);//important specially the comma for dividing
        //every 3 digit from right
        //we can use a - before the 4 or 20 to fill the column from left
    }

    }
}
