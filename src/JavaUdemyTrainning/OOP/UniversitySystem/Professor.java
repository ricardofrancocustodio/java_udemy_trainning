package JavaUdemyTrainning.OOP.UniversitySystem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Professor {

    private String _nameProfessor;
    private int _idProfessor;
    Map<String, String> profAndCourse = new HashMap<>();

    public Professor(){}

    public Professor(int idProfessor, String nameProfessor){
        this._idProfessor = idProfessor;
        this._nameProfessor = nameProfessor;
    }

    public String get_nameProfessor() {
        return _nameProfessor;
    }

    public void set_nameProfessor(String _nameProfessor){
        this._nameProfessor = _nameProfessor;
    }

    public int get_idProfessor(){
        return _idProfessor;
    }

    //
    public void linkProfToCourse(String professor, String course){
        for (CourseList el: CourseList.values()){
            if (el.toString().equals(course)){
                profAndCourse.put(professor, course);
            }
        }
    }

    @Override
    public String toString() {
        return "Professor{" +
                "_idProfessor=" + _idProfessor +
                ", _nameProfessor='" + _nameProfessor + '\'' +
                ", profAndSubj=" + profAndCourse +
                '}';
    }
}
