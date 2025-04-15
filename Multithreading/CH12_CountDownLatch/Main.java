package Multithreading.CH12_CountDownLatch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    public static void main(String[] args) {
        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        //Use when we want to wait thread for there completion so
        //it is so simple give number of operation in its number of service
        CountDownLatch latch = new CountDownLatch(numberOfServices);
    }

}
class DependentService implements Callable<String>{
    @Override
    public String call() throws Exception {
        return "";
    }
}
