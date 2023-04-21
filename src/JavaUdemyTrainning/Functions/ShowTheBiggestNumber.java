package JavaUdemyTrainning.Functions;

import java.util.Scanner;

public class ShowTheBiggestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three number: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            int biggestNum = max(x,y,z);

                System.out.println("Higher: " + biggestNum);

        scanner.close();
    }

    /**
     * Static =  para que a função possa ser chamada independente da criação/instancia de um Objeto
     * */
    static int max(int a, int b, int c){

        int result = 0;

            if(a > b && a > c){
                result =  a;
            }else if(b > c){
                result =  b;
            }else{
                result =  c;
            }

            return result;

    }
}
