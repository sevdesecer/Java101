package Subjects;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String customerPassword = "S34B";


        while(true) {

            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = scanner.next();

            if(customerPassword.contentEquals(typedPassword)) {
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }
        }
    }
}
