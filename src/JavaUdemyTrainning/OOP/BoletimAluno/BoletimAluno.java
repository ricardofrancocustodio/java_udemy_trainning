package JavaUdemyTrainning.OOP.BoletimAluno;


public class BoletimAluno {

    private String aluno;
    private double grade1;
    private double grade2;
    private double grade3;


    public void setAluno(String aluno) {
        this.aluno = aluno;
    }


    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }


    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    public double finalGrade(){
        return (grade1 + grade2 + grade3) ;
    }

    public String approval(){
        String approval;

        if(finalGrade() >= 60) {
            approval = "PASS";
        }else{
            approval = "FAILED" + "\n" + "MISSING=" + (60 - finalGrade()) + " POINTS";
        }
        return approval;
    }

    public String toString(){
        return aluno +"'s FINAL GRADE = " + finalGrade() + " - " + approval();
    }

}
