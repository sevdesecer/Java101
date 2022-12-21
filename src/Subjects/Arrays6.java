package Subjects;

public class Arrays6 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0 ; j < matrix[i].length ; j++){
                //System.out.print(matrix[i][j] + " ");
            }
            //System.out.println();
        }
        for (int[] row : matrix){
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    }
