package Subjects;

public class Methods5 {
    public static void main(String[] args) {
        printPrimeBetween(14,72);
    }
    public static Boolean isPrime(int n ){
        for (int i = 2 ; i < n ; i++){
            if ( n % i == 0 ){
                return false;
            }
        }
        return true;
    }
    public static void printPrimeBetween(int start , int end){
        for (int i = start ; i < end ; i++){
            if (isPrime(i)){
                System.out.println( i + " ");
            }
        }
    }
}
