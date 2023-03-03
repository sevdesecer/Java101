package Exercises.BeybladeGame;

public class Beyblade { // Fierce Battle
    private String beyblader;
    public int rotationSpeed;
    public int attackPower;

    public Beyblade(String beyblader, int rotationSpeed, int attackPower){
        this.beyblader = beyblader;
        this.rotationSpeed = rotationSpeed;
        this.attackPower = attackPower;
    }
    public String getBeyblader(){
        return this.beyblader;
    }
    public void setBeyblader(String beyblader){
        this.beyblader = beyblader;
    }

    public int getRotationSpeed() {
        return this.rotationSpeed;
    }

    public void setRotationSpeed(int rotationSpeed) {
        this.rotationSpeed = rotationSpeed;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void attack(){
        System.out.println(getBeyblader() + " attacked with " + this.attackPower + " and " + this.rotationSpeed + "." );
    }
    public void holyBeastAppears(){
        System.out.println("This beyblade has no holy beast.");
    }
    public void showInfo(){
        System.out.println("Beyblader's name is " + this.beyblader + ".");
        System.out.println("Beyblader's rotational speed is " + this.rotationSpeed + ".");
        System.out.println("Beyblader's attack power is " + this.attackPower + ".");
    }

}
