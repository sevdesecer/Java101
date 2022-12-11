import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10: ");

        double b = s.nextDouble();

        while ( b > 10 || b < 1 ){

            System.out.println(b + " is not between 1 and 10.Please enter new number: ");

            b = s.nextDouble();

        }

        System.out.println( b + " is between 1 and 10.Thanks." );






    }
}
