package com.example.stonkdoku;

import java.util.Arrays;

public class Board {
    private int[][] board = new int[9][9];
    public int[][] solution = new int[9][9];

    Board() {
        for (int i = 0; i < 9; i++){
            Arrays.fill(board[i], 0);
        }
        this.makePuzzle();
    }

    private boolean isBoxSafe() {

        return true;
    }

    private boolean isRowSafe(int rowNum, int num) {
        int i = 0;
        while (i < 9) {
            if (num == board[rowNum][i]){
                return false;
            }
            i++;
        }
        return true;
    }

    private boolean isColSafe(int colNum, int num) {
        int i = 0;
        while (i < 9) {
            if (num == board[i][colNum]){
                return false;
            }
            i++;
        }
        return true;
    }

    private int makePuzzle() {

        return 0;
    }

    public int printBoard(){ // this function prints the current table in a nice viewable fashion
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                System.out.print(board[i][j]);
                if (((j + 1) % 3) == 0) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            if (((i+1) % 3) == 0){
                System.out.print("\n");
            }
        }
        return 0;
    }
}