import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.nio.file.Paths;
import java.lang.IllegalStateException;
public class CreditInquiry
    {
        //creating an array of menu options
        private final static MenuOptions[] choice =MenuOptions.values();

    public static void main(String[] args) {
        //get request of user
        MenuOptions accountType =getRequest();
        while (accountType !=MenuOptions.END)
            {
                switch (accountType)
                    {
                        case ZERO_BALANCE:
                            System.out.println("Accounts with zero balance");
                            break;
                        case CREDIT_BALANCE:
                            System.out.println("Accounts with credit balance");
                            break;
                        case DEBIT_BALANCE:
                            System.out.println("Accounts with debit balance");
                            break;
                    }
                readRecords(accountType);
                accountType=getRequest();
            }

    }



        public static MenuOptions getRequest()
            {
                int request=4;
                System.out.printf("1 for zero balance%n2 for credit balance%n" +
                        "3 for debit balance%n4 for exit");

                try
                    {
                        Scanner inp=new Scanner(System.in);
                        do
                            {
                                System.out.printf("%n? ");
                                request=inp.nextInt();
                            }
                            while ((request<1)|| (request>4));
                    }
                catch (NoSuchElementException nsee)
                    {
                        System.err.printf("invalid input, terminating");
                    }
                return choice[request -1];
            }

        public static void readRecords(MenuOptions acctype)
            {
                //it is a try with resource statement, we create an object witch
                //will only be used for the duration of try block
                //scanner is auto closeable, witch has a method called close
                try (Scanner input=new Scanner(Paths.get("clients.txt")))
                    {
                        while (input.hasNext())
                            {
                                int accNumber=input.nextInt();
                                String fr=input.next();
                                String ls=input.next();
                                double balance=input.nextDouble();

                                    //if proper account type, then display records
                                    if(shouldDisplay(acctype,balance))
                                        {
                                            System.out.printf("%-10d,%-12s,%-12s,%10.2f",
                                                    accNumber,fr,ls,balance);
                                        }
                                    else
                                        {
                                            input.nextLine();
                                        }
                            }
                    }
                catch (NoSuchElementException | IllegalStateException | IOException e)
                    {
                        System.err.println("Error processing the file, terminating");
                        System.exit(1);
                    }

            }

        public static boolean shouldDisplay(MenuOptions acctype,double balance)
            {
                    if(acctype==MenuOptions.CREDIT_BALANCE && balance<0)
                        return true;
                    else if(acctype==MenuOptions.DEBIT_BALANCE && balance >0)
                        return true;
                    else if(acctype==MenuOptions.ZERO_BALANCE && balance==0)
                        return true;

                    return false;
            }


}
