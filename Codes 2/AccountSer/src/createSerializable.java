import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.ObjectOutputStream;//lots of types of output steams
//for  manipulating byte based and text based streams
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class createSerializable
    {
        private static ObjectOutputStream output;//outputs data to a file

    public static void main(String[] args)

    {
	    openFile();
	    addRecord();
	    closeFile();
    }

        //when we open a file, if it does not exist, it will be created,
        //and if it exist, its content will be lost
        public static void openFile()
            {
                try
                    {
                        output = new ObjectOutputStream(Files.newOutputStream(Paths.get("clients.ser")));
                        //the suffix src can be replaced with everything
                        //the output stream changes out data to bytes and
                        //writes them to the file
                    }
                catch (IOException IOE)
                    {
                        System.err.println("Error opening file, terminating");
                        System.exit(1);
                    }
            }

        public static void addRecord()
            {
                Scanner inp=new Scanner(System.in);
                System.out.printf("%s%n%s%n","enter account number, first name, last name" +
                        "and balance","Enter oef indicator to terminate");
            while (inp.hasNext())
                {
                    try
                        {
                            AccountSer record = new AccountSer(inp.nextInt(), inp.next(),
                                    inp.next(), inp.nextDouble());

                            //serialize record object into the file
                            output.writeObject(record);
                        } catch (NoSuchElementException nsee)
                        {
                            System.err.println("Invalid input, try again");
                            inp.nextLine();
                        } catch (IOException ioe)
                        {
                            System.err.println("Error writing to the file, terminating");
                            break;
                        }
                    System.out.printf("? ");
                }


            }

        public static void closeFile()
            {
                try
                    {
                        if (output != null)
                            output.close();
                    }
                catch (IOException ioex)
                    {
                        System.err.println("Error closing the file, terminating");
                    }
            }
}
