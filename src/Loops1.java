import java.util.Scanner;

public class
Loops1 {
    private static Object m;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 10000 ;
        String Process = """
                 1.Process = Balance Inquiry\s
                 2.Process = Withdraw money\s
                 3.Process = Deposit\s
                 Enter q for quit.""".indent(1);
        System.out.println("***************");
        System.out.println("Process");
        System.out.println("***************");

        while( true ) {
            System.out.println("Please enter that you want to do process number : ");
            String process = scanner.nextLine();
            if (Process.equals("q")){
                System.out.println("Exiciting the process...");
            break;}

            else if (Process.equals("1"))
                System.out.println("Your balance is : " + balance);
            else if (Process.equals("2")) {
                System.out.println("Please enter that you want to withdraw money ");
                int m = scanner.nextInt();
                scanner.nextLine();
                if ( m > balance ){
                    System.out.println(" Insufficient balance...");}
                else{
                    balance -= m ;
                    System.out.println("Your new balance is : " + balance);}
            }
            if (Process.equals("3")) {
                System.out.println("Please enter that you want to deposit money : ");
            int m2 = scanner.nextInt();
            scanner.nextLine();
            balance += m2;
            System.out.println("Your new balance is : " + balance);}
            else{
            System.out.println("process is not valid.");}

        }
    }
}
