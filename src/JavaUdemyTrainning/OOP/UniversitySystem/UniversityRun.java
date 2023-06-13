package JavaUdemyTrainning.OOP.UniversitySystem;

import java.util.Locale;
import java.util.Scanner;

public class UniversityRun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //fazer loop
        System.out.print("What is the name of the Professor? ");
        String nameProf = scanner.next();
        System.out.print("Academic subject: ");
        String academSubj = scanner.next().toUpperCase(Locale.ROOT);

        Professor professor = new Professor(1, nameProf);
        professor.linkProfToCourse(professor.get_nameProfessor(), academSubj);
        System.out.println(professor);

        System.out.println("-------------");
        //fazer loop
        System.out.print("What is the name of the Student? ");
        String nameStud = scanner.next();
        System.out.print("Course enrollment: ");
        String course = scanner.next().toUpperCase(Locale.ROOT);

        Student student = new Student(1, nameStud);
        System.out.println(student);
        University university = new University();
        university.enrollCourse(student, course, professor);
        System.out.println("-------------");
        System.out.println(university);



    }
}
