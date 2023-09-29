import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class SharedArrayTest
{
   public static void main(String[] arg)
   {
      // construct the shared object
      SimpleArray sharedSimpleArray = new SimpleArray(6);

      // create two tasks to write to the shared SimpleArray
      ArrayWriter writer1 = new ArrayWriter(1, sharedSimpleArray);
      ArrayWriter writer2 = new ArrayWriter(11, sharedSimpleArray);

      // execute the tasks with an ExecutorService
      ExecutorService executorService = Executors.newCachedThreadPool();
      executorService.execute(writer1);
      executorService.execute(writer2);

      executorService.shutdown();

      try
      {
         // wait 1 minute for both writers to finish executing
         // the boolean check if the thread has terminated before this time or not
         boolean tasksEnded = 
            executorService.awaitTermination(1, TimeUnit.MINUTES);

         if (tasksEnded)
         {
            System.out.printf("%nContents of SimpleArray:%n");
            System.out.println(sharedSimpleArray); // print contents
         }
         else
            System.out.println(
               "Timed out while waiting for tasks to finish.");
      } 
      catch (InterruptedException ex)
      {
         ex.printStackTrace();
      } 
   }
}