package JavaUdemyTrainning.EstruturaWhileExercicios;

import java.util.Scanner;

public class PostoDeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

            while(x != 4){
                if (x > 0 && x < 4){
                    if (x == 1){
                        alcool += 1;
                    }else if (x == 2){
                        gasolina += 1;

                    }else if (x == 3){
                        diesel += 1;
                    }

                }

                x = scanner.nextInt();
            }

            System.out.println("muito obrigado" + "\n" +
                                    "Alcool: " + alcool + "\n" +
                                    "Gasolina: " + gasolina + "\n" +
                                    "Diesel: " + diesel);
            System.out.println();

        scanner.close();

    }
}
