package JavaUdemyTrainning.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

            System.out.print("Quantos alunos serão digitados? ");
            int n =  scanner.nextInt();

            String [] nomes = new String[n];
            int [] notas1 = new int[n];
            int [] notas2 = new int[n];

            for(int i=0; i<n; i++){
                System.out.println("Digite nome, 1ª e 2ª nota do " + (i+1) + "º aluno:");
                nomes[i] += scanner.next();
                notas1[i] += scanner.nextDouble();
                notas2[i] += scanner.nextDouble();
            }

                /**
                 * Output: Alunos aprovados:
                 * nullnulljoao
                 * null
                 * */
                System.out.println("Alunos aprovados:");
                for(int i=0; i<nomes.length; i++){
                    System.out.println(aprovados(nomes, notas1, notas2)[i]);
                }



                scanner.close();

    }

    static String [] aprovados(String [] nomes, int [] notas1, int [] notas2){
        String [] resultado = new String[nomes.length];
        double nota;

        for (int i=0; i<nomes.length; i++){
            nota = (notas1[i] + notas2[i]) / (double)notas1.length;
            if(nota > 6.0){
                resultado[i] += nomes[i];
            }
        }

        return resultado;
    }
}
