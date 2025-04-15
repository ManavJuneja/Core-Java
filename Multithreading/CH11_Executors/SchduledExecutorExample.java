package Multithreading.CH11_Executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchduledExecutorExample
{
    public static void main(String[] args) {
        //At regular interval
        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(1);
        scheduled.schedule( () -> System.out.println("Task Executed after 5 sec delay"), 5, TimeUnit.SECONDS);
        scheduled.schedule(()-> {
            System.out.println("Initiating Shutdown");
            scheduled.shutdown();
        },20,TimeUnit.SECONDS);
        scheduled.shutdown();
    }
}
