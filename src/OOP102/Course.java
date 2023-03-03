package OOP102;

public class Course {
    private String courseName;
    private String code;
    private Insturcter insturcter; // Composition. (Course has a Instructer.)

    public Course (String courseName, String code, Insturcter insturcter){
        this.courseName = courseName;
        this.code = code;
        this.insturcter = insturcter;
    }

    public String getCourseName(){
        return this.courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    public Insturcter getInsturcter() {return this.insturcter;}
    public void setInsturcter(Insturcter insturcter) {this.insturcter = insturcter;}


    // Course uses a Student (Course sınıfı Studentr sınıfına bağlıdır.) Dependency.

    public double calcAvarage(Student[] students){
        //Student std4 = new Student("Mert","Bedir","3","Rize",55);

        double avarage = 0;

        for (int i = 0; i < students.length; i++) {
            avarage += students[i].getNote();
        }

        return avarage / students.length ;
    }
}
