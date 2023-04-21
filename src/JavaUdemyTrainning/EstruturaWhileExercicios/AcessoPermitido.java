package JavaUdemyTrainning.EstruturaWhileExercicios;

import java.util.Scanner;

public class AcessoPermitido {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

            int senha  = 2002;

                while(scanner.nextInt() != senha){
                    System.out.println("Senha inválida");
                }

                    System.out.println("Acesso permitido");

        scanner.close();

    }
}
