import java.util.Arrays;
public class Arrays7Main {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7};
        double[] list2 = {3.4,5.5,4.7,1.9};

        HelperArray helper = new HelperArray();
        helper.print(list);
        System.out.println();

        System.out.println(HelperArray.search(list,5));
        System.out.println();

        // If we use "static" expression, we can write the same code as.
        HelperArray.print(list);
        System.out.println();

        //Arrays.toString()
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(list2));
        System.out.println();

        //Arrays.fill()
        Arrays.fill(list,22);
        System.out.println(Arrays.toString(list));
        Arrays.fill(list,1,5,4);
        System.out.println(Arrays.toString(list));
        System.out.println();

        //Arrays.sort()
        int[] list3 = {4,56,23,48,66,98,89,-857,-2,0,62};
        Arrays.sort(list3);
        System.out.println(Arrays.toString(list3));
        System.out.println();

        //Arrays.binarySearch()
        int[] list4 = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        Arrays.sort(list4);
        System.out.println(Arrays.toString(list4));
        System.out.println();

        int index = Arrays.binarySearch(list4,27);
        System.out.println("index of 27 is " + index);
        System.out.println();

        // Arrays.copyOf() and Arrays.copyOfRange() methods
        int[] list6 = {7,4,6,-4,454,645,-98,-77,675};
        int [] copylist = Arrays.copyOf(list6,4);
        System.out.println(Arrays.toString(copylist));
        System.out.println();
        int[] copyOfRangeArray = Arrays.copyOfRange(list6, 0,5);
        System.out.println(Arrays.toString(copyOfRangeArray));
        System.out.println();

        //Arrays.equals()
        int[] list7 = {1,2,3,4};
        int[] list8 = {1,2,3,4};
        int[] list9 = {1,2,3,4,5,6};
        System.out.println(Arrays.equals(list7,list8)); // true
        System.out.println(Arrays.equals(list7,list9)); // false



    }
}
