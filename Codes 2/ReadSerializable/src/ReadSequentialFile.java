import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile
    {

    private static ObjectInputStream input;
    //it is a logical stream, not a physical one
    public static void main(String[] args)
    {
        openFile();
        readRecord();
        closeFile();


    }


        public static void openFile()
            {
                try
                    {
                        input=new ObjectInputStream(Files.newInputStream(Paths.get("clients.ser")));
                    }
                catch (IOException ioe)
                    {
                        System.err.println("error opening file");
                        System.exit(1);
                    }

            }

        public static void readRecord()
            {
                System.out.printf("%-10s%-12s%-12s%-10s",
                        "Account","First name","Last name","Balance");
                try
                    {
                        while (true)//loop until there is an io exception
                            {
                                Accounts record=(Accounts) input.readObject();//casting

                                System.out.printf("%-10d%-12s%-12s%10.2f%n",record.getAccount(),
                                        record.getFirstname(),record.getLastname(),record.getBalance());

                            }
                    }
                catch (EOFException eofe)
                    {
                        System.err.println("%nNo more records");
                    }
                catch (ClassNotFoundException cnfe)
                    {
                        System.err.println("Invalid object type, terminating");
                    }
                catch (IOException ioe)
                    {
                        System.err.println("Error reading from file, terminating");
                    }
            }


        public static void closeFile()
            {
                try
                    {
                    if(input!=null)
                        input.close();
                    }
                catch (IOException ioe)
                    {
                        System.err.println("can not close the file, terminating");
                    }

            }
}
