package Exercises.BeybladeGame;

public class Dragoon extends Beyblade{  // Kinomiya Takao

    private String holyBeast;
    private String hiddenTalent;

    public Dragoon (String beyblader, int rotationSpeed, int attackPower, String holyBeast, String hiddenTalent){
        super(beyblader,rotationSpeed,attackPower);

        this.holyBeast = holyBeast;
        this.hiddenTalent = hiddenTalent;
    }

    public String getHolyBeast(){
        return this.holyBeast;
    }
    public void setHolyBeast(String holyBeast){
        this.holyBeast = holyBeast;
    }
    public String getHiddenTalent(){
        return this.hiddenTalent;
    }
    public void setHiddenTalent(String hiddenTalent){
        this.hiddenTalent = hiddenTalent;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Holy Beast's name is : " + holyBeast);
        System.out.println("Hidden Talent is : " + hiddenTalent);

    }

    @Override
    public void holyBeastAppears() {
        super.holyBeastAppears();
        System.out.println(getBeyblader() + " reveals " + holyBeast + "." );
        System.out.println(getAttackPower() + "'s attack is : Ghost Tornado.");
    }
}
