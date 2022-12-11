import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter please number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter please number2: ");
        int number2 = scanner.nextInt();

        String process = """
                1.process = addition\s
                2.process = subtraction\s
                3.process = multiplication\s
                4.process = division\s
                5.process = remainder\s
                Enter q for quit.""".indent(1);

        System.out.println("***************");
        System.out.println("Process");
        System.out.println("***************");

        while (true) {
            System.out.println("Please enter one of number that you want to do process: ");
            process = scanner.nextLine();
            if (process.equals("1")) {
                System.out.println("addition : " + (number1 + number2));
            } else if (process.equals("2")) {
                System.out.println("subtraction : " + (number1 - number2));
            } else if (process.equals("3")) {
                System.out.println("multiplication : " + (number1 * number2));
            } else if (process.equals("4")) {
                System.out.println("division : " + (number1 / number2));
            } else if (process.equals("5")) {
                System.out.println("remainder : " + (number1 % number2));
            } else if (process.equals("q")) {
                System.out.println("Exiciting the process...");
            } else {
                System.out.println("invalid value");
            }


        }
    }
}
