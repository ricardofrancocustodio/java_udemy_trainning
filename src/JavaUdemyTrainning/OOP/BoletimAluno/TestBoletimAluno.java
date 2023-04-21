package JavaUdemyTrainning.OOP.BoletimAluno;

import java.util.Locale;
import java.util.Scanner;

public class TestBoletimAluno {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        BoletimAluno boletimAluno =  new BoletimAluno();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        boletimAluno.setAluno(scanner.next());
        System.out.print("Enter grade 1: ");
        boletimAluno.setGrade1(scanner.nextDouble());
        System.out.print("Enter grade 2: ");
        boletimAluno.setGrade2(scanner.nextDouble());
        System.out.print("Enter grade 3: ");
        boletimAluno.setGrade3(scanner.nextDouble());

        System.out.println(boletimAluno);

    }
}
