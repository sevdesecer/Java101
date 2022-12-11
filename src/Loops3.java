import java.util.Scanner;

public class  Loops3 {
    public static void main(String[] args) {
        int n ;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a number : ");
            n = scanner.nextInt();
            if (n % 2 == 1 || n % 2 == -1){
                total += n ;
            }
        }
        while (n>0);
        System.out.println(" total : " + total );

    }
}
