package OOPS.exceptionHandling.custom;

public class Bank {
    private double balance;
    public Bank(double balance){
        this.balance = balance;
    }
    public void withdraw(double amount) throws Exception {
        if(amount > balance){
            throw new InsufficientFundsException();
        }
        balance -= amount;
    }
}
