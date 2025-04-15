package OOPS.exceptionHandling.custom;

public class test {
    public static void main(String[] args) {
        Bank bank = new Bank(100);
        try {
            bank.withdraw(200);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
