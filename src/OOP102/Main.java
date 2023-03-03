package OOP102;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Berkay","Korkmaz","17","Ankara",97);
        Student std2 = new Student("Enes","Bektaş","78","İStanbul",109);
        Student std3 = new Student("Sinem","Kaya","12","Bursa",84);

        std2.setNote(900);
        System.out.println(std2.getNote());

        Insturcter insturcter = new Insturcter("Ahmet","Arslan","CENG");

        // Course has a instructer.(Sınıfın bir eğitmeni vardır.) Composition.

        Course math = new Course("MAT101","Mat", insturcter);
        System.out.println(math.getInsturcter().getDepartment());

        /*
        Student[] stu = {std1,std2,std3};
        System.out.println("The avarage : " + math.calcAvarage(stu));
         */

    }
}
