import java.util.Scanner;

public class Methods4 {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        System.out.println(Getname());
        System.out.println("Please enter your age: ");
        System.out.println(Getage());
    }
    public static String Getname(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name ;
    }
    public static int Getage(){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        return age ;
    }
}
