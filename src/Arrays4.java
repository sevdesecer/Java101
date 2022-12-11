public class Arrays4{
    public static void main(String[] args) {
        int[][] matrix = new int[4][7];
        int number = 1;

        for (int x = 0; x < matrix.length; x++) {
            int[] row = matrix[x];

            for (int y = 0; y < row.length; y++) {
                row[y] = number;
                number++;
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println();
        }
    }
}
