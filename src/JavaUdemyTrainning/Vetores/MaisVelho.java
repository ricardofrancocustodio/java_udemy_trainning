package JavaUdemyTrainning.Vetores;

import java.util.Scanner;

public class MaisVelho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = scanner.nextInt();
        String [] nomes =  new String[n];
        int [] idades = new int[n];

        for(int i=0; i<n; i++){
            System.out.println("Dados da " + (i+1) + " pessoa");

            System.out.print("Nome: ");
            String nome = scanner.next();
            nomes[i] += nome;

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            idades[i] += idade;
        }

        System.out.println("Pessoa mais velha: " + maisVelha(idades, nomes));

        }

    static String maisVelha(int [] idades, String [] nomes){
        String resultado = "";
        int older = idades[0];

            for(int i=1; i< idades.length; i++){
                if(idades[i] > older){
                    //older = idades[i];
                    resultado = nomes[i];
                }
            }

            // Output: null<junto com o resultado correto> (??)
            return resultado;
    }

}
