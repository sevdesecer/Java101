import java.util.Scanner;

public class OddCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a small number: ");
        int sValue = input.nextInt(); // sValue = small value //
        System.out.println("Please enter a big number: ");
        int bValue = input.nextInt(); // bValue = big  value //
        // swap process
        if (bValue < sValue){
            int temp = sValue;
            sValue = bValue;
            bValue= temp;
        }
        System.out.println("Loop-based solution = The number of odds in range [ " + sValue + "," + bValue + " ] = " + loopBasedCount(sValue,bValue));
        System.out.println("Math-based solution = The number of odds in range [ " + sValue + "," + bValue + " ] = " + mathBasedCount(sValue,bValue));
    }
    public static int loopBasedCount(int sValue, int bValue){
        int odd = 0 ;
        for (int i = sValue ; i >= sValue && i <= bValue ; i++ ){
            if (!(i % 2 == 0) ){
                odd++ ;
            }
        }
        return odd;
    }
    public static int mathBasedCount(int sValue, int bValue){
        if (sValue % 2 == 0 && bValue % 2 == 0 ){
            return  ((bValue - sValue)/2 );
        }
        else {
            return ((bValue - sValue )/2 ) +1;
        }
    }
}
