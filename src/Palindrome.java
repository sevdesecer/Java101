import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a integer value: ");
        palindrome(scanner.nextLine());
    }
    public static void palindrome (String p){
        int i = 0;
        int l = p.length()-1;

        while (true){

            if(!(p.charAt(i) == p.charAt(l))){
                System.out.println("The number you entered is not palindrome.");
                break;
            }
            if (i == l || i+1 == l) {
                System.out.println("The number you entered is palindrome.");
                break;
            }
            i++;
            l--;
        }
    }
}
