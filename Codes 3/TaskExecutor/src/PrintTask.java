import java.security.SecureRandom;

public class PrintTask implements Runnable {


    private final static SecureRandom generator = new SecureRandom();
    private final int sleepTime;
    private final String taskName;

    public PrintTask(String taskName)
    {
        this.taskName = taskName;
        this.sleepTime = generator.nextInt(5000);//mill isecond
    }

    @Override
    public void run() {
        try{

            System.out.printf("Task %s is going to sleep for %d milliseconds%n",this.taskName,this.sleepTime);
            Thread.sleep(sleepTime);
        }
        catch (InterruptedException e)
        {
            System.err.println(e);
            e.printStackTrace();
            Thread.currentThread().interrupt(); // Re-interrupt the thread
        }

        System.out.printf("%s done sleeping%n",this.taskName);
    }
}
