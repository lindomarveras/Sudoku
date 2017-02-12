package com.android.ejemplos.sudoku.model;

import com.android.ejemplos.sudoku.R;
import com.android.ejemplos.sudoku.activities.BoardGameActivity;
import com.android.ejemplos.sudoku.fragments.CellFragment;

import java.util.Random;

public class Sudoku {
    public static int life_couter = 4;
    public static String[][] boardGame = {{"8", "2", "7", "1", "5", "4", "3", "9", "6"},
            {"9", "6", "5", "3", "2", "7", "1", "4", "8"},
            {"3", "4", "1", "6", "8", "9", "7", "5", "2"},
            {"5", "9", "3", "4", "6", "8", "2", "7", "1"},
            {"4", "7", "2", "5", "1", "3", "6", "8", "9"},
            {"6", "1", "8", "9", "7", "2", "4", "3", "5"},
            {"7", "8", "6", "2", "3", "5", "9", "1", "4"},
            {"1", "5", "4", "7", "9", "6", "8", "2", "3"},
            {"2", "3", "9", "8", "4", "1", "5", "6", "7"}};

    public static void generateBoardGame(int numberOfCells) {


        CellFragment[][] arrayCellFragment = BoardGameActivity.getArrayCellFragment();

        clearBoardGame(arrayCellFragment);
        printBoardGame(arrayCellFragment, boardGame, numberOfCells);

    }

    private static void printBoardGame(CellFragment[][] arrayCellFragment, String[][] boardGame, int numberOfCells) {
        Random rndRow = new Random();
        Random rndColum = new Random();
        for (int i = 0; i < numberOfCells; i++) {
            int row = rndRow.nextInt(9);
            int colum = rndColum.nextInt(9);
            arrayCellFragment[row][colum].setMainNumber(boardGame[row][colum]);
            arrayCellFragment[row][colum].setBackgroundColor(R.drawable.corner_radius_painted);
        }
    }

    private static void clearBoardGame(CellFragment[][] arrayCellFragment) {
        for (int r = 0; r < arrayCellFragment.length; r++) {
            for (int c = 0; c < arrayCellFragment.length; c++) {
                arrayCellFragment[r][c].setMainNumber("");
                arrayCellFragment[r][c].setBackgroundColor(R.drawable.corner_radius_unpainted);
            }
        }
    }
}
