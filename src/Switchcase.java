import java.util.Scanner;

public class Switchcase {

    public static void main(String[] args) {
      /*
      Switch case
      */
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of process which you want to do: ");

        int process = input.nextInt();

        switch (process) {
            case 1 -> System.out.println("process 1 starting.");
            case 2 -> System.out.println("process 2 starting.");
            case 3 -> System.out.println("process 3 starting.");
            default -> System.out.println("invalid process");
        }
    }
}