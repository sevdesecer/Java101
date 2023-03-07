package Exercises.GuerraMuerte;

public abstract class Monsters {

    private int id;
    private int damage;
    private int firstHealth;
    private int health;
    private int award;
    private String name;

    public Monsters(String name, int id, int firstHealth, int health,int damage, int award){
        this.name = name;
        this.id = id;
        this.firstHealth = firstHealth;
        this.health = health;
        this.damage = damage;
        this.award = award;
    }

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public int getId() {return this.id;}
    public void setId(int id) {this.id = id;}

    public int getDamage() {return damage;}
    public void setDamage(int damage) {this.damage = damage;}

    public int getFirstHealth() {return this.firstHealth;}
    public void setFirstHealth(int firstHealth) {this.firstHealth = firstHealth;}

    public int getHealth() {return this.health;}
    public void setHealth(int health) {this.health = health;}

    public int getAward() {return this.award;}
    public void setAward(int award) {this.award = award;}

}
