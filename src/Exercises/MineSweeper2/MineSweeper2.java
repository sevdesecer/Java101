package Exercises.MineSweeper2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper2 {
    int row;
    int col;
    String[][] board;
    String [][] minefield;
    MineSweeper2(int row, int col) {
        this.row = row;
        this.col = col;
        this.board = board(row,col);
        this.minefield=mine(row,col);
    }
    private String[][] board(int row, int column) {

        String[][] board = new String[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = "-";
            }
        }
        return board;
    }

    private String[][] mine(int row, int col) {

        int minefield = (row * col) / 4;

        String[][] mine = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mine[i][j] = "- ";
            }
        }

        for (int i = 0; i < minefield; i++) {
            Random rand = new Random();
            int rowr = rand.nextInt(row); // rowr = row random
            int colr = rand.nextInt(col); // colr = column random

            while (mine[rowr][colr].equals("* ")) {
                rowr = rand.nextInt(row);
                colr = rand.nextInt(col);
            }
            mine[rowr][colr] = "* ";
        }
        return mine;
    }

    public int countMines(String[][] minefield, int x /**row*/, int y /**col*/){
        int count = 0;

        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
              if((i < 0 || j < 0) || (i >= this.row|| j >= this.col))
                  break;
                else{
                    if (minefield[i][j].equals("* ")) {
                      count++;
                    }
              }
            }
        }
        return count;
    }

    public boolean doesFinish(String[][] minefield, int row, int col){
            return minefield[row][col].equals("* ");
        }

    public boolean start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n================ Welcome to Minesweeper ! ================\n");
        String[][] newBoard = this.board; //boş tahta
        String[][] newMine = this.minefield; //mayınlı tahta

        System.out.println(" <<= Mine Sweeper =>> ");
        for (int i = 0; i < newBoard.length; i++) {
            for (int j = 0; j < newBoard[i].length; j++) {
                System.out.print(newBoard[i][j] + " ");
            }
            System.out.println();
        }

        int totalBoxes = this.col * this.row;
        int mineNumber = this.col * this.row / 4;


        System.out.println("Please enter number of row: ");

        int guessRow = scanner.nextInt() - 1;


        while (!(guessRow >= 0 && guessRow < row)) {
            System.out.println("You entered an invalid value, please enter valid value in interval [1, " + (row) + "].");
            guessRow = scanner.nextInt() - 1;
        }

        System.out.print("Please enter number of column: ");

        int guessCol = scanner.nextInt() - 1;

        while (!(guessCol >= 0 && guessCol < col)) {
            System.out.println("You entered an invalid value, please enter valid value in interval [1, " + (col) + "].");
            guessCol = scanner.nextInt() - 1;
        }

        if (doesFinish(newMine,guessRow,guessCol)) {
            System.out.println("\nGAME OVER");

            for (int i = 0; i < newMine.length; i++) {
                for (int j = 0; j < newMine[i].length; j++) {
                    System.out.print(newMine[i][j] + " ");
                }
                System.out.println();
            }
            return true;
        }
        else{
            totalBoxes--;
            if (totalBoxes == mineNumber) {
                System.out.println("\nCONGRATULATIONS,YOU WON!!");
                for (int i = 0; i < newMine.length; i++) {
                    for (int j = 0; j < newMine[i].length; j++) {
                        System.out.print(newMine[i][j] + " ");
                    }
                    System.out.println();
                }
                return true;
            }
            else{
                newBoard[guessRow][guessCol]=String.valueOf(countMines(newMine,guessRow,guessCol));
                return false;
            }

        }
    }
}
