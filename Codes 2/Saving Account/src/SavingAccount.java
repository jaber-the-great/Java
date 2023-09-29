/**
 * Created by jaberdaneshamooz on 7/16/2017 AD.
 */
public class SavingAccount
    {
        private static  double rate;
        private double balance;
        public SavingAccount(double b)
            {
                this.balance=b;
            }

        public void setBalance(double balance)
            {
                this.balance = balance;
            }


        public static void setRate(double rate)
            {
                SavingAccount.rate = rate;
            }

        public static double getRate()
            {
                return rate;
            }

        public double getBalance()
            {
                return balance;
            }

        public void CalculateMonthly()
            {
                this.balance+=this.balance*(this.rate/12);
            }

    }
