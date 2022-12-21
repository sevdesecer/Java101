package Subjects;

public class Methods2 {
    static int func( int n ) {
        System.out.println(n);
        if ( n == 1 ){
            return 1 ;
        }
        return func(n-1) + n  ;
    }
    public static void main(String[] args) {
        System.out.println(func(10));

    }
}
