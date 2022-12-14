import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int testing = 0;
        int selected;
        int [] wrong = new int[5];

        boolean isWin = false;
        boolean isWrong = false;

        //System.out.println(number);
        while (testing < 5){
            System.out.println("Please enter your guess: ");
            selected = scanner.nextInt();

            if (selected < 0 || selected > 500 ){
                System.out.println("Please enter interval of '1' and '500' values.");
                continue;
            }
            if (selected == number){
                System.out.println("Congratulations, right guess! The number is " + number);
                break;
            }
            else {
                wrong[testing] = selected;
                testing++ ;
                System.out.println("Wrong number :( ");

                if (selected > number){
                    System.out.println(selected + " is greater than secret number.");
                }
                else {
                    System.out.println(selected + " is smaller than secret number.");
                }
                System.out.println("Your remaining testing right is " + (5-testing));
            }
        }
        if (!isWin){
            System.out.println("Sorry, you lost, again play the guess number game.");
            if (!isWrong) {
                System.out.println("Your guess : " + Arrays.toString(wrong));
                System.out.println("The right number is " + number);
            }
        }

    }
}
