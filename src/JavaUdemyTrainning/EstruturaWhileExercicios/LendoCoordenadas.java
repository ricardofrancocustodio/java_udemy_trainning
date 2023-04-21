package JavaUdemyTrainning.EstruturaWhileExercicios;

import java.util.Scanner;

public class LendoCoordenadas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

            while(x != 0 && y != 0){

                if (x > 0 && y > 0){
                    System.out.println("primeiro quadrante");

                    }else if(x < 0 && y > 0){
                    System.out.println("segundo quadrante");

                    }else if(x < 0 && y < 0){
                    System.out.println("terceiro quadrante");

                    }else{
                    System.out.println("Quarto quadrante");
                }
                x = scanner.nextInt();
                y = scanner.nextInt();

            }
        scanner.close();
    }
}
