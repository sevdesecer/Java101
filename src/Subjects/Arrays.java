package Subjects;

public class Arrays {
    public static void main(String[] args) {
        int [] list = new int [10];
        for (int i = 0 ; i < list.length ; i++ ){
            list [i] = (i * 10) + 10 ;
            System.out.println(list[i]);
        }
        String [] car = new String[3];
        car[0] = "Volvo";
        car[1] = "BMW";
        car[2] = "Porsche";
        for (int i = 0 ; i < car.length ; i++){
            System.out.println((i+1) + ". car is " + car[i] + ".");
        }
        for (String i : car){
            System.out.println(i);
            System.out.println("\n");
        }
        int [] list2 = {14,13,34,26};
        System.out.println(list2[2]);
        System.out.println(list2.length);

    }
}
