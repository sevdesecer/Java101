import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        factorial ();
    }
        private static void factorial () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = input.nextInt();
        int factorial = 1 ;
        while( n > 0 ) {
            factorial *= n ;
            n-- ;
        }
        System.out.println("Your factorial value is " + factorial );
    }
}
