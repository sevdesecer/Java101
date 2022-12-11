import java.util.Random;
import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Random rand = new Random();
        int firstNumber = rand.nextInt(1001);
        int secondNumber = rand.nextInt(1001);
        int temp = firstNumber;
        if (firstNumber<secondNumber) {
            firstNumber = secondNumber;
            secondNumber = temp;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 -> Brute-Force Algorithm \n 2-> Euclidean Algorithm ");
        int chose= scanner.nextInt();

        if(chose == 1){
            int gcd = BruteForceAlgorithm(firstNumber,secondNumber);
            System.out.println("Greatest Common Divisor for " + firstNumber +" and "+secondNumber +" is "+ gcd);
        }
        else if(chose==2){
            int gcd = EuclideanAlgorithm(firstNumber,secondNumber);
            System.out.println("Greatest Common Divisor for " + firstNumber +" and "+secondNumber +" is "+ gcd);

        }
        else
            System.out.println("Please enter 1 or 2.");
    }

    public static int BruteForceAlgorithm(int x, int y) {
        int gcd;
        for (int smaller = y; true; smaller--){
            gcd = smaller;
            if (x%smaller == 0 && y%smaller == 0)
                break;
        }
        return gcd;
    }


    public static int EuclideanAlgorithm(int x,int y){
        int remainder = x%y;
        while(remainder != 0){
            x = y;
            y = remainder;
            remainder = x%y;
        }

        return y;
    }
}
