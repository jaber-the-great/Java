public class SavingAccountTest
    {

    public static void main(String[] args)
        {
             SavingAccount saver1=new SavingAccount(2000.00);
             SavingAccount saver2=new SavingAccount(3000);
             SavingAccount.setRate(0.04);
             for(int i=0;i<12;i++)
                 {
                     saver1.CalculateMonthly();
                     saver2.CalculateMonthly();
                     System.out.printf("%.2f\t\t%.2f\n",saver1.getBalance(),saver2.getBalance());
                 }
            SavingAccount.setRate(0.05);
            System.out.println("interest of 5 percent");
            for(int i=0;i<12;i++)
                {
                    saver1.CalculateMonthly();
                    saver2.CalculateMonthly();
                    System.out.printf("%.2f\t\t%.2f\n",saver1.getBalance(),saver2.getBalance());
                }
        }
}
