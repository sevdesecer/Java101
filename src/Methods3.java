public class Methods3 {
    public static boolean Isitprimenumber(int n ) {
        for (int i = 2 ; i < n ; i++ ){
            if (n % i == 0) {
                return false ;
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        for (int i = 2 ; i <= 1000 ; i++ ) {
            if (Isitprimenumber(i)) {
                System.out.println(i);
            }
        }



    }
}
