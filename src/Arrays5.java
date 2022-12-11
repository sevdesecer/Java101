public class Arrays5 {
    public static void main(String[] args) {
        //ForEach
        int [] list = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;
        for (int i : list){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println(sum);
    }

}
