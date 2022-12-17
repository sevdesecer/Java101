package Exercises.StudentInfoSystem;

public class Teacher {
    String name ;
    String mpno ; // mpno = mobile phone number
    String branch ;
    String experience ;
    String mail;

    //Constructer method should be same name together class name.

    Teacher(String name,String branch,String experience,String mpno,String mail){
        this.name = name;
        this.branch = branch;
        this.experience = experience;
        this.mpno = mpno;
        this.mail = mail;
    }
    void print(){
        System.out.println("Teacher's name is " + this.name + ".");
        System.out.println("Teacher's branch is " + this.branch + ".");
        System.out.println("Teacher's experience is " + this.experience + ".");
        System.out.println("Teacher's mobile phone number is " + this.mpno + ".");
        System.out.println("Teacher's mail is " + this.mail + " .");

    }
}
