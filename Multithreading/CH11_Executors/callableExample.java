package Multithreading.CH11_Executors;

import java.util.concurrent.*;

public class callableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //below is creation of thread pool with single thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        //now create callable task
        Callable<String> task = () -> {
            Thread.sleep(1000);//Simulate long-running task
            return "Task result after delay";
        };

        //submit the task to executor

        Future<String> future = executor.submit(task);

        //Can do other stuff here

        String result = future.get();
        System.out.println("Result from Callable: "+result);

        //shutdown the executor

        executor.shutdown();
    }
}
