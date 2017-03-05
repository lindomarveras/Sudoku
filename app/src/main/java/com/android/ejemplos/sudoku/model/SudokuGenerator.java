package com.android.ejemplos.sudoku.model;

import com.android.ejemplos.sudoku.util.Constants;

import java.util.Random;

public class SudokuGenerator {
    private static int[][] board;

    public SudokuGenerator() {
        board = new int[Constants.BOARD_WIDTH][Constants.BOARD_HEIGHT];
    }

    public static int[][] generateRandomBoardGame() {
        board = new int[Constants.BOARD_WIDTH][Constants.BOARD_HEIGHT];
        nextCell(0,0);
        return board;
    }

    private static boolean nextCell(int x, int y) {
        int nextX;
        int nextY = y;
        int[] toCheck = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random r = new Random();
        int tmp;
        int current;
        int top = toCheck.length;

        for(int i = top-1; i > 0; i--) {
            current = r.nextInt(i);
            tmp = toCheck[current];
            toCheck[current] = toCheck[i];
            toCheck[i] = tmp;
        }

        for(int i = 0; i < toCheck.length; i++) {
            if(legalMove(x, y, toCheck[i])) {
                board[x][y] = toCheck[i];
                if(x == 8) {
                    if(y == 8) {
                        return true;
                    } else {
                        nextX = 0;
                        nextY = y + 1;
                    }
                } else {
                    nextX = x + 1;
                }
                if(nextCell(nextX, nextY)) {
                    return true;
                }
            }
        }
        board[x][y] = 0;
        return false;
    }

    private static boolean legalMove(int x, int y, int current) {
        for(int i = 0; i < Constants.BOARD_WIDTH; i++) {
            if(current == board[x][i]) {
                return false;
            }
        }
        for(int i = 0; i < Constants.BOARD_HEIGHT; i++) {
            if(current == board[i][y]) {
                return false;
            }
        }
        int cornerX = 0;
        int cornerY = 0;
        if(x > 2) {
            if (x > 5) {
                cornerX = 6;
            } else {
                cornerX = 3;
            }
        }
        if(y > 2) {
            if (y > 5) {
                cornerY = 6;
            } else {
                cornerY = 3;
            }
        }
        for(int i=cornerX; i < 10 && i < cornerX+3; i++) {
            for (int j = cornerY; j < 10 && j < cornerY + 3; j++) {
                if (current == board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}