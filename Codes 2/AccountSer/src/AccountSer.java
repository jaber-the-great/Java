import java.io.Serializable; //it is an interface
public class AccountSer implements Serializable
    {
        //all parameters of a serializable class must be serializable and the
        //class must implement no argument constructor,because deserializable mechanism
        //would use it and instant variables need to be public or u should  for this mechanism
        //or u have to provide set and get methods for working correctly
        //primitive types and arrays are serializable, for others we look at documentation
        //a class is serializable if implements it or inherit it from the super class
        //static variables are not serialized
        //using "transient" keyword to say that u do not want to serialize sth
        private int account;
        private String firstname;
        private String lastname;
        private double balance;

        public AccountSer()
            {
                this(0, "", "", 0.0);//call other constructor
            }

        public AccountSer(int acc, String fr, String ls, double balance)
            {
                this.account = acc;
                this.firstname = fr;
                this.lastname = ls;
                this.balance = balance;
            }
        public void setAccount(int acc)
            {
                this.account=acc;
            }
        public void setFirstname(String fs)
            {
                this.firstname=fs;
            }
        public void setLastname(String ls)
            {
                this.lastname=ls;
            }
        public void setBalance(double balance)
            {
                this.balance = balance;
            }
        public int getAccount()
            {
                return this.account;
            }
        public String getFirstname()
            {
                return this.firstname;
            }
        public String getLastname()
            {
                return this.lastname;
            }
        public double getBalance()
            {
                return this.getBalance();
            }

    }
