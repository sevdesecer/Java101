package Exercises.StudentInfoSystem;

public class Student {
    Course Math;
    Course Physics;
    Course Chemistry;

    String name;
    String ID_no;
    String classes;

    double avarage;

    boolean isPass;

    Student(String name, String ID_no, String classes, Course Physics, Course Chemistry, Course Math){
        this.name = name;
        this.ID_no = ID_no;
        this.classes = classes;

        this.Math = Math;
        this.Physics = Physics;
        this.Chemistry = Chemistry ;

        calcAvarage();

        this.avarage = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(int Math, int Physics, int Chemistry){
        if (Math >= 0 && Math <= 100) {
        this.Math.note = Math;
    }

        if (Physics >= 0 && Physics <= 100) {
            this.Physics.note = Physics;
        }

        if (Chemistry >= 0 && Chemistry <= 100) {
            this.Chemistry.note = Chemistry;
        }

    }
    public void isPass() {
        if (this.Math.note == 0 || this.Physics.note == 0 || this.Chemistry.note == 0) {
            System.out.println("The notes are not integer value.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Avarage : " + this.avarage);
            if (this.isPass) {
                System.out.println("Passed the class. ");
            } else {
                System.out.println("Failed the class. ");
            }
        }
    }
    public void calcAvarage() {
        this.avarage = (this.Physics.note + this.Chemistry.note + this.Math.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 50;
    }
    void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math's note : " + this.Math.note);
        System.out.println("Physics's note : " + this.Physics.note);
        System.out.println("Chemistry's note : " + this.Chemistry.note);
    }

}
