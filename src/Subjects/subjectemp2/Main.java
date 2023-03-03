package Subjects.subjectemp2;

public class Main {
    public static void main(String[] args) {
        Course physics = new Course("Physics","phy-105",78);
        Course music = new Course("Music","msc-101",65);
        Course chmstry = new Course("Chemistry","chs-105",72);

        int [] notlar = {physics.note, music.note, chmstry.note};
        Course.calcAvarage(notlar);

    }
}
