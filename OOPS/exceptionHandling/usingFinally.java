package OOPS.exceptionHandling;

public class usingFinally {
    public static void main(String[] args) {
        System.out.println(divides(10, 0));
    }
    public static int divides(int a, int b){
        try{
            System.out.println("Inside try");
            return a / b;

        }catch (Exception e){
            System.out.println("Inside Catch");
            return -1;
        }finally {
            System.out.println("Inside Finally");
        }
    }
}
