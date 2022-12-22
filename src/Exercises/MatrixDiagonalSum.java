package Exercises;

import java.util.Random;

public class MatrixDiagonalSum {
    public static int getRandomSize(){
        Random rand = new Random();
        return rand.nextInt(10) + 1; // We added 1 because 10 is not included.
    }
    public static int[][] generateMatrix(int n){
        int [][] matrix = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(20) + 1;
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int computeSum(int[][] matrix){

        int n = matrix.length;
        int[] LeftDiagonal = new int[n];
        int[] RightDiagonal = new int[n];
        int diagonalSum = 0;

        for (int i = 0; i < n; i++) {
            LeftDiagonal[i] = matrix[i][i];
            RightDiagonal[i] = matrix[i][n - i - 1];
        }

        for (int data : LeftDiagonal) {
            diagonalSum += data;
        }
        for (int data : RightDiagonal) {
            diagonalSum += data;
        }
        return diagonalSum;
    }

    public static void main(String[] args){

        int n = getRandomSize();

        int [][] matrix = generateMatrix(n);

        System.out.println("Matrix: ");
        printMatrix(matrix);

        int leftDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            leftDiagonalSum += matrix[i][i];
        }
        System.out.println("Sum of left diagonal: " + leftDiagonalSum);

        int rightDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            rightDiagonalSum += matrix[i][n - i - 1];
        }
        System.out.println("Sum of right diagonal: " + rightDiagonalSum);
    }

    }


