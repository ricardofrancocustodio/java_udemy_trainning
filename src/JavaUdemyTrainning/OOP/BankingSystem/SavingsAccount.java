package JavaUdemyTrainning.OOP.BankingSystem;

public class SavingsAccount implements Account {

    private int accountNumber;
    private int accountBalance;


    public SavingsAccount(int accountNumber, int accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public void deposit(double amount) {
        this.accountBalance += amount;


    }

    @Override
    public void withdraw(double amount) {
        this.accountBalance -= amount;
    }

    @Override
    public int balanceInquiry() {
        return (getAccountNumber() == accountNumber) ? getAccountBalance() : 0;
    }


    public int getAccountNumber() {
        return accountNumber;
    }


    public int getAccountBalance() {
        return accountBalance;
    }


    public String toString(){
        return "Savings Account Number= "+ this.accountNumber +" and Account balance= "+accountBalance;
    }


}