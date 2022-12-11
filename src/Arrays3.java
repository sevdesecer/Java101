public class Arrays3 {
    //Multi Dimension Arrays
    public static void main(String[] args) {
        int[] list = new int[5];
        int [][] matris = {
                {0,453,939,243,283,291},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045}
        };
        System.out.println(matris[2][3]);
        System.out.println(matris.length);
        System.out.println(matris[0].length);
    }
}
