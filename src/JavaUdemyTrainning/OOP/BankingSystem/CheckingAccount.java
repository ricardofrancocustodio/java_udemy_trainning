package JavaUdemyTrainning.OOP.BankingSystem;

public class CheckingAccount implements Account{
    private int accountNumber;
    private int accountBalance;


    public CheckingAccount(int accountNumber, int accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    @Override
    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }


    @Override
    public void withdraw(double amount) {
        this.accountBalance -= amount;
    }

    @Override
    public int balanceInquiry() {
        return (getAccountNumber() == accountNumber)? getAccountBalance() : 0;
    }

    public String toString(){
        return "Checking Account Number= "+ this.accountNumber +" and Account balance= "+accountBalance;
    }



}
