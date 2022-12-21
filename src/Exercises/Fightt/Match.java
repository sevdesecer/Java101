package Exercises.Fightt;

public class Match {
    Fighter f1 ;
    Fighter f2 ;
    int minWeight;
    int maxWeight;

    Match(Fighter f1 , Fighter f2 , int minWeight , int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public void run (){
        if (isCheck()){
            while(this.f1.health > 0 && this.f2.health > 0 ){
                System.out.println("-----------NEW ROUND-----------");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()){
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if (isWin()){
                    break;
                }
                System.out.println(this.f1.name + " health: " + this.f1.health);
                System.out.println(this.f2.name + " health: " + this.f2.health);
            }
        }
        else {
            System.out.println("Exercises.Fightt.Fighter's weights do not match.");
        }
    }
    public boolean isCheck () {
        return ((this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight));
    }
    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " win !");
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(this.f1.name + " win !");
            return true ;

        }
        return false;

    }
}
