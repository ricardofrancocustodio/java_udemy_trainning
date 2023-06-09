package JavaUdemyTrainning.OOP.BankingSystem;

public class BankAccount {

    public static void main(String[] args) {

        SavingsAccount _savingsAccountRob =  new SavingsAccount(1, 1000);
        CheckingAccount _checkingAccountRob =  new CheckingAccount(1, 1000);

        CheckingAccount _checkingAccountJane =  new CheckingAccount(2, 2000);
        SavingsAccount _savingsAccountJane =  new SavingsAccount(2, 500);

        System.out.println(_savingsAccountJane);
        _savingsAccountJane.deposit(500);
        System.out.println(_savingsAccountJane);
        System.out.println("--------------");

        System.out.println(_savingsAccountRob);
        _savingsAccountRob.withdraw(500);
        System.out.println(_savingsAccountRob);
        System.out.println("--------------");

        System.out.println(_checkingAccountJane);
        System.out.println(_checkingAccountJane.balanceInquiry());
        System.out.println("--------------");

        System.out.println(_checkingAccountRob);
        System.out.println(_checkingAccountRob.balanceInquiry());

    }



}
