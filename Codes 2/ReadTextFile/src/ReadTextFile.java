import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
    {
        private static Scanner inp;
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
                        inp=new Scanner(Paths.get("clients.txt"));
                    }
                catch (IOException ioe)//many exceptions inherit io exception
                        //instead of having separate catches for each one, we use this super class
                    {
                        System.err.println("Error opening file, terminating");
                        System.exit(1);
                    }

            }

        public static void readRecord()
            {
                System.out.printf("%-10s%-12s%-12s,%10s%n","Account",
                        "firstname","lastname","balance");

                try
                    {
                        while (inp.hasNext())
                            {
                                System.out.printf("%-10d%-12s%-12s,%10.2f%n",
                                        inp.nextInt(),inp.next(),inp.next(),inp.nextDouble());
                            }
                    }
                catch (NoSuchElementException nsee)
                    {
                        System.err.println("File improperly formed, terminating");
                    }
                catch (IllegalStateException ise)
                    {
                        System.err.println("Error reading from file, terminating");
                    }

            }

        public static void closeFile()
            {
                if(inp !=null)
                    inp.close();
            }
}
