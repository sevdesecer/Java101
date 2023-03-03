package Exercises.BeybladeGame;

public class Dranzer extends Beyblade{ // Kai Hiwatari
    private String holyBeast;

    public Dranzer(String beyblader, int rotationSpeed, int attackPower, String holyBeast) {
        super(beyblader, rotationSpeed, attackPower);

        this.holyBeast = holyBeast;
    }

    public String getHolyBeast() {
        return this.holyBeast;
    }

    public void setHolyBeast(String holyBeast) {
        this.holyBeast = holyBeast;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Holy Beast's nae is : " + holyBeast);
    }
    @Override
    public void holyBeastAppears() {
        super.holyBeastAppears();
        System.out.println(getBeyblader() + " reveals " + holyBeast + "." );
        System.out.println(getAttackPower() + "'s attack is : Flame Sword.");
    }

}
