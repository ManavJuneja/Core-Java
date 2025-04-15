package OOPS.encapsulation;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    public void deposit(double amount){
       if(amount > 0){
           balance += amount;
           System.out.println("Deposited " + amount + " in the account number "+accountNumber);
       }else{
           System.out.println("Invalid amount");
       }
    }
    public void withdraw(double amount){
         if(amount > balance || amount < 0){
             System.out.println("Un-sufficient Balance");
         }else{
             balance -= amount;
             System.out.println("Amount Debited ");
         }

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}
