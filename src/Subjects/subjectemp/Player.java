package Subjects.subjectemp;

public class Player {
    public String name;
    public int id;
    public static String game = "Formula 1";
    public static int count = 0;

    public Player(String name,int id){
        this.id = id;
        this.name = name;
    }
    public void login(){
        count++;
    }

}
