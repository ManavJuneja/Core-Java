package OOPS.encapsulation;

public class test {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(123);
        bankAccount.setAccountHolderName("Manav");
        System.out.println(bankAccount.getBalance());
        bankAccount.deposit(44.33);
        System.out.println(bankAccount.getBalance());

    }
}
