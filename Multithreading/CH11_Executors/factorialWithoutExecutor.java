package Multithreading.CH11_Executors;

public class factorialWithoutExecutor {
//saab kuch hum hi kar rahe ha
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[9];
        for(int i = 1; i < 10; i++){
            int finalI = i;
            threads[i - 1] = new Thread(
                    () -> {
                        long result = 0;
                        try {
                            result = fact(finalI);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println(result);
                    }
            );
            threads[i-1].start();
        }
        for(Thread thread : threads){
            try{
                thread.join();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Total time : " + (System.currentTimeMillis() - startTime));
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
