package Subjects;

public class Arrays2 {
    //One Dimension Subjects.Arrays
    public static void main(String[] args) {
        double [] list1 = new double[5];
        list1 [0] = 4.1;
        list1 [3] = 5.7;
        for (int i = 0; i < list1.length ; i++ ){
            System.out.println(list1[i]);
        }
        System.out.println(list1[0]);
        System.out.println(list1.length);

        String[] days = new String[]{"Monday" , "Saturday"};
        System.out.println(days[1]);

    }
}
