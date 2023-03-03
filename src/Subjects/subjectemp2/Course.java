package Subjects.subjectemp2;

public class Course {
    public String name;
    public String code;
    public int note;

    public Course(String name, String code, int note){
        this.name = name;
        this.code = code;
        this.note = note;
    }

    public static void calcAvarage (int[] notes){
        int total = 0;
        for (int i = 0; i < notes.length; i++){
            total += notes[i];
        }

        double avarage = total / notes.length;
        System.out.println("Your avarage is: " + avarage);
    }
}
