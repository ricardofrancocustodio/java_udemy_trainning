package JavaUdemyTrainning.OOP.Bank;

import java.math.BigDecimal;

public class Bank {

    private String accountName;
    private BigDecimal accountNumber;
    private BigDecimal balance = BigDecimal.valueOf(0);
    private BigDecimal tax = BigDecimal.valueOf(5);


    public Bank(){}

    public Bank(String accountName, BigDecimal accountNumber, BigDecimal initialDeposit){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        deposit(initialDeposit);
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public BigDecimal getAccountNumber() {
        return this.accountNumber;
    }

    public BigDecimal getBalance() { return this.balance; }

    public void setBalance(BigDecimal balance){ this.balance = balance; }

    public void deposit(BigDecimal amount){ setBalance(getBalance().add(amount)); }

    /**
     * adicionar o valor de $5 ao valor de saque (imposto)
     *
     **/
    public void withdraw(BigDecimal amount){
        setBalance(getBalance().subtract(amount.add(tax)));
    }


    public String toString(){
        return "Account " + getAccountNumber() + ", Holder: " + getAccountName() + ", Balance: $" + getBalance();
    }


}
