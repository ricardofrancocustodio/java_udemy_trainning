package JavaUdemyTrainning.OOP.UniversitySystem;

import java.util.*;

/**
 * Implement appropriate attributes and methods for each class
 * to represent the relationships between them, such as a
 * professor teaching a course or a student enrolling in a course.
 *
 * */
public class University {

    List<String[]> enrollmentList = new ArrayList<>();

    public University(){}

    public void enrollCourse(Student student, String course, Professor professor){
        enrollmentList.add(new String [] {student.get_nameStudent(), course, professor.get_nameProfessor()});

    }

    public List<String[]> getEnrollmentList() { return enrollmentList; }

    @Override
    public String toString() {
        String result = "";
        for (String[] el: enrollmentList){
            result =  Arrays.toString(el);

        }

        return "University{" +
                "enrollmentList=" + result +
                '}';
    }
}
