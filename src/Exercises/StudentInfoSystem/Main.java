package Exercises.StudentInfoSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Polin","Physics","4 years","0551 1345 337","polinpol@gmail.com");
        Teacher t2 = new Teacher("Marcell","Chemistry","12 years","0546 4729 867","marcellcell@icloud.com");
        Teacher t3 = new Teacher("Christian","Math","7 year","0567 5557 890","christiann@hotmail.com");
        // t1.print();

        Course Math = new Course("Math","103","Math");
        Course Physics = new Course("Physics","101","Physics" );
        Course Chemistry = new Course("Chemistry","102","Chemistry");

        Physics.addTeacher(t1);
        Chemistry.addTeacher(t2);
        Math.addTeacher(t3);

        Student s1 = new Student("Neils","12542157834","4", Math,Physics,Chemistry);
        s1.addBulkExamNote(80,90,60);
        s1.isPass();

        Student s2 = new Student("Henry","24764367898","3",Math,Physics,Chemistry);
        s2.addBulkExamNote(33,60,45);
        s2.isPass();

        Student s3 =new Student("Daniel","22257690834","6",Math,Physics,Chemistry);
        s3.addBulkExamNote(78,76,89);
        s3.isPass();


    }
}
