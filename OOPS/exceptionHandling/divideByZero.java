package OOPS.exceptionHandling;

public class divideByZero {
    public static void main(String[] args) {
       int[] num = {10, 20, 30, 40};
       int[] den = {2, 3, 0, 4};
       for(int i = 0; i < num.length; i++){
           System.out.println(div(num[i], den[i]));
       }
        System.out.println("Good Job : ");
    }
    public static int div(int a, int b){
        try {
            return a / b;
        }catch (ArithmeticException e){
            System.out.println(e);
            return  -1;
        }
        catch (Exception e){
            System.out.println("Exception occur : "+e);
            return -1;
        }

    }
}
