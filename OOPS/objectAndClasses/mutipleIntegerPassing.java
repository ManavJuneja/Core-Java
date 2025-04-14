package OOPS;

public class mutipleIntegerPassing {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6));
    }
    public static int sum(int ...a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }
    public static boolean isPrime(int x){
        int res = 0;
        for(int i = 1; i < x / 2; i++){
            if(x % i== 0){
                res++;
            }
        }
        return res == 2;
    }
}
