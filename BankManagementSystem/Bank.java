package BankManagementSystem;

public class Bank {
    private String bankName;
    private int noOfUser;
    private int noOfAccounts;

    public Bank(String bankName, int noOfUser, int noOfAccounts) {
        this.bankName = bankName;
        this.noOfUser = noOfUser;
        this.noOfAccounts = noOfAccounts;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getNoOfUser() {
        return noOfUser;
    }

    public void setNoOfUser(int noOfUser) {
        this.noOfUser = noOfUser;
    }

    public int getNoOfAccounts() {
        return noOfAccounts;
    }

    public void setNoOfAccounts(int noOfAccounts) {
        this.noOfAccounts = noOfAccounts;
    }
}
