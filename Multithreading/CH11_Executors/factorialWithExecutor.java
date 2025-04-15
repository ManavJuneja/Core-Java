package Multithreading.CH11_Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class factorialWithExecutor {
    public static void main(String[] args) throws InterruptedException {
        //executor  ki help se saare kaam karege
        //ab thread se koi lene dena nahi ha
//can change pool thread also as now mentioned 9 we can change it to 3 or any other according to present resources
        ExecutorService executor = Executors.newFixedThreadPool(9);
        for(int i = 1; i < 10; i++){
            int finalI = i;
            executor.submit( () -> {
                try {
                    long result = fact(finalI);
                    System.out.println(result);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        //need to stop by
        executor.shutdown();
        //can't submit more task after shutdown
        //because shutdown is started
        //shutdown don't wait for as it run the ending statement before as need to calculate time
        //SOLUTION
        executor.awaitTermination(100, TimeUnit.SECONDS);//it will wait for executor shutdown for 100 second
    }
    private static long fact(int n) throws InterruptedException {
        Thread.sleep(1000);
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans *= i;
        }
        return ans;
    }
}
