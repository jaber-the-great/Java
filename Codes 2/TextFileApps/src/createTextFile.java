import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.SecurityException;//when u do not have privilage to access a file
//or folder
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

public class createTextFile
    {
        private static Formatter output;//outputs text to a file

    public static void main(String[] args)
    {
        openFile();
        addRecord();
        closeFile();

    }
        // open file "clients.txt"
        public static void openFile()
            {
                try
                    {
                        output = new Formatter("clients.txt");//opens the file
                    }
                catch (SecurityException se)
                {
                    System.err.println("Write permission denied: Terminating");
                    System.exit(1);//terminates the program
                }
                catch (FileNotFoundException fne)
                {
                    System.err.println("Error opening file : Terminating");
                    System.exit(1);
                }
            }

        public static void addRecord()
            {
                Scanner inp=new Scanner(System.in);
                System.out.printf("%s%n%s%n?","Enter account number, first name, last name and balance",
                        "Enter end of file indicator to terminate");
                while (inp.hasNext())//loops until eof indicator
                try
                    {
                        //output new record to file, assume valid input
                        output.format("%d %s %s %.2f%n",inp.nextInt(),inp.next(),inp.next(),
                                inp.nextDouble());
                    }
                catch (FormatterClosedException fc)
                    {
                        System.err.println("Error in writing to the file. Terminating");
                        break;

                    }
                catch (NoSuchElementException nsee)
                    {
                        System.err.println("Invalid input, please try again");
                        inp.nextLine();
                    }
                System.out.printf("? ");

            }
        public static void closeFile()
            {
                if(output !=null)
                    output.close();;

            }

}

