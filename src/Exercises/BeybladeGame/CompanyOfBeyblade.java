package Exercises.BeybladeGame;

public class CompanyOfBeyblade {
    public Beyblade produceBeyblade(String beyblade_type){

        if (beyblade_type.equals("Dragoon")){
            return new Dragoon("Takao",800,300,"Blue Dragon","Talk with Holy Beast");

        } else if (beyblade_type.equals("Dranzer")) {
            return new Dranzer("Kai",600,400,"Flame Sword");
        }
        else if (beyblade_type.equals("Driger")) {
            return new Driger("Rei", 800, 250, "Tiger Claw");
        }
        else if (beyblade_type.equals("Draciel")) {
            return new Draciel("Max", 400, 1000, "Black Turtle");
        }
        else {
            return null;
        }
    }
}
