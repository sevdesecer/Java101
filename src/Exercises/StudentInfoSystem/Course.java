package Exercises.StudentInfoSystem;

public class Course {
    Teacher teacher ;
    String name ;
    String code ;
    String prefix ;
    int note ;

    Course(String name ,String code ,String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;

    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            System.out.println("Process is succesful.");

        }else{
            System.out.println("Teacher's branch does not match prefix.");
        }
    }
    void printInfoTeacher(){
        this.teacher.print();

    }
}
