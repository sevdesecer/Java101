package Exercises;

import java.util.Scanner;

public class Loops4 {
        public static void main(String[] args) {
            //Fibonacci//
            int x = 1;
            int y = 0;
            int z = 0;
            System.out.println( y + "," + x );
            for (int i = 2 ; i <= 10 ; i++){
                y = x + z ;
                System.out.println(y);
                z = x ;
                x = y ;
            }
        }
    }




