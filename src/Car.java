public class Car {
    String model;
    String color = " metallic grey ";
    int speed;
    int speedLimit = 360 ;

    public Car(String model, String color, int speedLimit) {
    this.model = model;
    this.color = color;
    this.speedLimit = speedLimit;
    }

    void increaseSpeed(int increament){
        if (( speed + increament) < speedLimit ) {
            this.speed += increament ;
        }
    }
    void decreaseSpeed(int decrease){
        if (speed > 0 ){
            this.speed -= decrease;
        }
    }
    void printSpeed(){
        System.out.println("Your speed is " + speed);

    }
    void printInfo(){
        System.out.println("Model \t:" + this.model);
        System.out.println("Color \t:" +  this.color);
        System.out.println("SpeedLimit \t:" + this.speedLimit);
    }

}
