package Exercises;

import java.util.Scanner;

public class Loops6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our bank.Our interest rate %12 ");
        int money,year ;
        System.out.println("Please enter that you want to deposit money : ");
        money = input.nextInt();
        System.out.println("Please enter that the amount of time you want to deposit : ");
        year = input.nextInt();

        double totalmoney = money ;
        double interestRate = 0.12 ;

        for (int i = 1 ; i <= year ; i++ ){

            totalmoney = ( totalmoney * interestRate ) + totalmoney  ;

            System.out.println( "total money at the end of  " + i + " year " + totalmoney );
        }



    }
}