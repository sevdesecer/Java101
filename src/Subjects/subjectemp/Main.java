package Subjects.subjectemp;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Charles Leclerc",16);
        System.out.println(p1.name);
        System.out.println(p1.id);
        System.out.println(p1.game); // game in nesnelerle alakası yok.
        p1.login();

        System.out.println();
        System.out.println("=========  New Driver  =========");
        System.out.println();

        Player p2 = new Player("Max Verstappen",33);
        System.out.println(p2.name);
        System.out.println(p2.id);
        System.out.println(p2.game);
        System.out.println(Player.count);
        p2.login();
        System.out.println(Player.count);
    }
}
