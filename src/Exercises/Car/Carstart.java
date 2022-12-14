package Exercises.Car;

public class Carstart {
    public static void main(String[] args) {
        Car bmw = new Car( "BMW 320i", "metallic grey" , 260);
        bmw.printInfo();
        Car mercedes = new Car("G-63 AMG" , "black" , 280);
        mercedes.printInfo();
        Car porsche = new Car("Porsche 911 Turbo S" , "metallic grey" , 320);
        porsche.printInfo();

       /* mercedes.model = " G-63 AMG";
        mercedes.color = " black";
        System.out.print(mercedes.model);
        System.out.println(mercedes.color);

        porsche.model = " Porsche 911 Turbo S";
        System.out.print(porsche.model);
        System.out.println(porsche.speed);
        System.out.println(porsche.color);
        porsche.decreaseSpeed( 100 );
        System.out.println(porsche.speed);*/




    }
}
