package Exercises.BeybladeGame;

import Subjects.While;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Welcome to the war of the beyblades... Get ready for struggle !!");
        System.out.println("Click q to log out.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which beyblade would you like to produce?");
        String process = scanner.nextLine();

        if (process.equals("q")){
        System.out.println("Exiting...");
        System.exit(0);

        }
        else{
            CompanyOfBeyblade company = new CompanyOfBeyblade();
            Beyblade beyblade = company.produceBeyblade(process);

            if (beyblade == null){
                System.out.println("Please enter valid beyblade name.");
            }
            else {
                beyblade.showInfo();
                beyblade.attack();
                beyblade.holyBeastAppears();
            }

            }

        }
    }
