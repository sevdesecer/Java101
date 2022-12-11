import java.util.Scanner;

public class Loops5 { // exponential numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a base for exponential numbers : ");
        int base = scanner.nextInt();
        System.out.println("Please enter an exponent for exponential numbers : ");
        int exp = scanner.nextInt();
        int result = 1 ;
        for (int i = 1 ; i <= exp ; i++){
            result *= base ;

        }
        System.out.println( result );
    }
}
