import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int factorial = scanner.nextInt();
        int n = 1 ;
        for (int i = 1 ; i <= factorial ; i++){
            n = i * n ;
        }
        System.out.println("Factorial value : " + factorial + "! :  " + n );
    }

}

