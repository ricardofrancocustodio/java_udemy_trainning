package JavaUdemyTrainning.EstruturaForExercicios;

import java.util.Scanner;

public class ForExercicio_1 {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int res = 0;

        int n = scanner.nextInt();

            for (int i=0; i < n; i++){
                int x = scanner.nextInt();
                  res += x;

            }

                System.out.println(res);

        scanner.close();
    }
}
