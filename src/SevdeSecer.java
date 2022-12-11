import java.util.Scanner;
public class SevdeSecer
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);

        System.out.println("first number is x: ");
        int x = input.nextInt();

        System.out.println("second number is y: ");
        int y = input.nextInt();

        System.out.println("third number is z: ");
        int z = input.nextInt();

      int max  = -1 ;

      if ( x > y && x > z)
          max = x;
          else if (y > x && y > z)
              max = y;
          else if (z > y && z > x)
              max = z;
      else
          max = x = y = z;

          System.out.println("max value: " + max);

    }
}
