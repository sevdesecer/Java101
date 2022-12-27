package Exercises.MineSweeper;

import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int row; // satır sayısı
    int columns; // sütun sayısı
    boolean[][] mines; // mayınların olduğu yerleri tutan dizi
    String[][] board; //oyun tahtası
    Scanner scanner;

    // Constructer methods
    public MineSweeper(int row, int columns) {
        this.row = row;
        this.columns = columns;
        mines = new boolean[row][columns];
        board = new String[row][columns];
        board = board(row, columns);

        //mayınları rastgele yerleştir.

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                double probability = Math.random();
                mines[i][j] = probability < 0.1;
            }
        }
    }

    public String[][] board(int row, int columns) {  // oyun tahtasını oluşturduğumuz metod.
        String[][] newBoard = new String[row][columns];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                newBoard[i][j] = "-";
            }
        }
        return newBoard;
    }

    public int countMines(int row, int col) {
        // Belirtilen satır ve sütunda kaç mayın var?
        int count = 0;

        // Belirtilen satır ve sütunda çevresindeki hücreleri dolaşma.

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {

                // Dolaşılan hücrelerin geçerli koordinatlarına sahip olup olmadığını kontrol eder.

                if (i >= 0 && i < row && j >= 0 && j < columns) {

                    // Dolaşılan hücrenin bir mayın olup olmadığını kontrol eder.

                    if (mines[i][j]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public void start() {
        // Print the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        // Check if the current position is a mine
        if (mines[row][columns]) {
            // If it is a mine, set the board position to "x" and print a game over message
            board[row][columns] = "x";
            System.out.println("You hit a mine! Game over.");
        } else {
            // If it is not a mine, count the number of mines in the surrounding cells
            int count = countMines(row, columns);
            // Set the board position to the count of surrounding mines
            board[row][columns] = String.valueOf((char) (count + '0'));
        }
    }
}