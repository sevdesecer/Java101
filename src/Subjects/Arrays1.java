package Subjects;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter the 4 numbers you want to find the avarage of: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int [] list = {a,b,c,d};
        double sum = 0.0;

        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        double avarage = sum / list.length;
        System.out.println("The avarage of list is :" + avarage);
    }
}
