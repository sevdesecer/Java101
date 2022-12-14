public class Arrays8 {
    public static void main(String[] args) {
        int[] list = {-67,67,89,-98,4,6,3,8};

        int min = list[0];
        int max = list[0];

        for ( int i : list ) {
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }
        System.out.println(" Minumum value is " + min);
        System.out.println(" Maximum value is " + max);
    }
}
