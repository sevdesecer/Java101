package Exercises;

import java.util.Scanner;

public class PalinromeInteger{
    public static boolean reverse (int number){
        int reversed = number ;
        int reverse = 0;
        while(number > 0){
            int remain = number % 10 ;
            number /= 10 ;
            reverse = reverse*10 + remain ;
        }
        return reverse == reversed;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: " );
        int input = scanner.nextInt();
        if (reverse(input)){
            System.out.println("It is a palindrome number.");
        }
        else
            System.out.println("It is not palindrome number.");

    }
}
