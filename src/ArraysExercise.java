import java.util.Scanner;

public class ArraysExercise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter how many item you want for your order (between 1-5): ");
        int l = input.nextInt();

        while(!(l >= 1 && l <= 5)){
            System.out.print("Please enter a valid value: ");
            l = input.nextInt();
        }
        String [] meal = new String[l];
        for(int i = 0; i < l; i++){
            System.out.print("Please enter " + (i+1) + ". order: ");
            meal[i] = input.next();
        }
        for (String i : meal){
            System.out.println(i);
        }
    }
}
