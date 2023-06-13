package JavaUdemyTrainning.OOP.UniversitySystem;

public class Student {

    private int _idStudent;
    private String _nameStudent;

    public Student(){}

    public Student(int idStudent, String nameStudent){
        this._idStudent = idStudent;
        this._nameStudent = nameStudent;
    }

    public int get_idStudent() {
        return _idStudent;
    }

    public void set_idStudent(int _idStudent) {
        this._idStudent = _idStudent;
    }

    public String get_nameStudent() {
        return _nameStudent;
    }

    public void set_nameStudent(String _nameStudent) {
        this._nameStudent = _nameStudent;
    }


    @Override
    public String toString() {
        return "Student{" +
                "_idStudent=" + _idStudent +
                ", _nameStudent='" + _nameStudent + '\'' +
                '}';
    }
}
