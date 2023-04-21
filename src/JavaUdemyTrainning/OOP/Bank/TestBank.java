package JavaUdemyTrainning.OOP.Bank;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class TestBank {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);
        Bank bank = new Bank();
        BigDecimal depositValue = BigDecimal.ZERO;

            System.out.println("Account Data: " + "\n" + bank + "\n");

            System.out.print("Enter account number: ");
            BigDecimal an = scanner.nextBigDecimal();

            System.out.print("Enter account holder: ");
            bank.setAccountName(scanner.next());

            System.out.print("Is there an initial deposit (y/n): ");
            String depositValueConfirmation = scanner.next();

                if(depositValueConfirmation.equals("y")){
                    System.out.print("Enter initial deposit value: ");
                    depositValue = scanner.nextBigDecimal();

                }

        /**
         * segunda instancia do Bank - construtor com parametros -  é aqui mesmo?
         *
         * Tive de instanciar aqui para conseguir pegar os valores digitados e setar como parâmetro do construtor
         */

            Bank bank2 = new Bank(bank.getAccountName(), an, depositValue);

            System.out.println("\n"+"Account Data: " + "\n" + bank2 + "\n");

            System.out.print("Enter a deposit value: ");
            bank2.deposit(scanner.nextBigDecimal());
            System.out.println("\n" + "Updated Account Data: \n" + bank2 + "\n");

            System.out.print("Enter a withdraw value: ");
            bank2.withdraw(scanner.nextBigDecimal());
            System.out.println("\n" + "Updated Account Data: \n" +  bank2);


        scanner.close();

    }


}
