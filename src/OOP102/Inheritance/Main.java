package OOP102.Inheritance;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Barış Atasoy", "barisatasoy@gmail.com", 0537);
        System.out.println(w1.getNameSurname());
        w1.enter();
        Academician a1 = new Academician("Sevde Secer", "sevdesecer@gmail.com", 0551, "CENG", "Associate Professor");
        a1.enter();
        a1.leave();
        a1.enterLesson();

        Lecturer l1 = new Lecturer("Ahmet Arslan", "aarslan@gmail.com", 0532, "CENG", "associate professor", 1);
        System.out.println(l1.getNameSurname());
        l1.enter(); // Academician classındaki enter kodunu çalıştırmış oldu.
    }
}
