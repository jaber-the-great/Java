import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        //These are runnable objects that can be executed by threads
        PrintTask task1 = new PrintTask("task1");
        PrintTask task2 = new PrintTask("task2");
        PrintTask task3 = new PrintTask("task3");
//        (new Thread(new PrintTask("jaber"))).start();
        (new Thread(task3)).start();
        System.out.println("Starting Executor");
//        try {
//            Thread.sleep(5000);
//        }
//        catch (InterruptedException e)
//        {
//            System.out.println(e);
//        }

//invoking run function of the class would not do the same thing, it runs them sequentially


        //create executor service to manage threads
        ExecutorService execServ = Executors.newCachedThreadPool();

        //starts the threads
        execServ.execute(task1);
        execServ.execute(task2);
//        execServ.execute(task3);

        //Shutdown Executor service  ---> it decides when to shut down threads
        execServ.shutdown();
        System.out.println("tasks started, main ends");

    }
}
