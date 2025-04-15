package Multithreading.CH11_Executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class check {
    //Kuch return karwana haa toh callable use karo
    //Kuch return nahi karwana ha toh runnable use karo
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<Integer> future= executorService.submit(() -> 42);
        Future<?> future = executorService.submit(() -> System.out.println("Hello"));
        if(future.isDone()){//Returns true if this task completed. Completion may be due to normal termination, an exception, or cancellation -- in all of these cases, this method will return true.
            System.out.println("Task is done");
        }
        //study callable and runnable
        System.out.println(future.get());//Waits if necessary for the computation to complete, and then retrieves its result.
        executorService.shutdown();

    }
}
