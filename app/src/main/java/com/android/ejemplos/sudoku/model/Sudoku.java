package com.android.ejemplos.sudoku.model;

import android.content.Context;
import android.os.SystemClock;

import com.android.ejemplos.sudoku.R;
import com.android.ejemplos.sudoku.activities.BoardGameActivity;
import com.android.ejemplos.sudoku.fragments.CellFragment;
import com.android.ejemplos.sudoku.fragments.KeyboardFragment;
import com.android.ejemplos.sudoku.fragments.LifeFragment;
import com.android.ejemplos.sudoku.util.AlertDialog;
import com.android.ejemplos.sudoku.util.Animations;

import java.util.Random;

public class Sudoku {
    public static int life_counter = 4;
    public static String[][] boardGame = {{"8", "2", "7", "1", "5", "4", "3", "9", "6"},
                                          {"9", "6", "5", "3", "2", "7", "1", "4", "8"},
                                          {"3", "4", "1", "6", "8", "9", "7", "5", "2"},
                                          {"5", "9", "3", "4", "6", "8", "2", "7", "1"},
                                          {"4", "7", "2", "5", "1", "3", "6", "8", "9"},
                                          {"6", "1", "8", "9", "7", "2", "4", "3", "5"},
                                          {"7", "8", "6", "2", "3", "5", "9", "1", "4"},
                                          {"1", "5", "4", "7", "9", "6", "8", "2", "3"},
                                          {"2", "3", "9", "8", "4", "1", "5", "6", "7"}};

    public void generateBoardGame(Context context, int numberOfCells, String level) {
        CellFragment[][] arrayCellFragment = BoardGameActivity.getArrayCellFragment();
        clearBoardGame(arrayCellFragment);
        printRandomNumberInBoardGame(arrayCellFragment, boardGame, numberOfCells);
        LifeFragment.restartIcons(context);
        life_counter = 4;
        BoardGameActivity.setTextLevel(level);
        BoardGameActivity.chronometer.setBase(SystemClock.elapsedRealtime());
        BoardGameActivity.chronometer.start();
        BoardGameActivity.penPencilButton.setText(R.string.activity_board_game_pen_text);
        BoardGameActivity.penPencilButton.setEnabled(true);
        KeyboardFragment.resetKeyboard();
        KeyboardFragment.setEnabledKeyboard(true);
    }

    private static void printRandomNumberInBoardGame(CellFragment[][] arrayCellFragment, String[][] boardGame, int numberOfCells) {
        Random rndRow = new Random();
        Random rndColumn = new Random();
        for (int i = 0; i < numberOfCells; i++) {
            int r = rndRow.nextInt(9);
            int c = rndColumn.nextInt(9);
            arrayCellFragment[r][c].setMainNumber(boardGame[r][c]);
            arrayCellFragment[r][c].setBackgroundColor(R.drawable.corner_radius_initial_cell);
            arrayCellFragment[r][c].setBooleanPaintedCell(true);
        }
    }

    private static void clearBoardGame(CellFragment[][] arrayCellFragment) {
        for (int r = 0; r < arrayCellFragment.length; r++) {
            for (int c = 0; c < arrayCellFragment.length; c++) {
                arrayCellFragment[r][c].setMainNumber("");
                arrayCellFragment[r][c].setBackgroundColor(R.drawable.corner_radius_unpainted_cell);
                arrayCellFragment[r][c].resetPencilCell();
                arrayCellFragment[r][c].setBooleanPaintedCell(false);
            }
        }
    }

    public static boolean completedBoardGame(CellFragment[][] arrayCellFragment) {
        boolean completedBoardGame = true;
        for (int r = 0; r < arrayCellFragment.length; r++) {
            for (int c = 0; c < arrayCellFragment.length; c++) {
                if(!arrayCellFragment[r][c].isBooleanPaintedCell()) {
                    completedBoardGame = false;
                }
            }
        }
        return completedBoardGame;
    }

    public static void setPaintedCellOptionToFalseInBoardBame(CellFragment[][] arrayCellFragment) {
        for (int r = 0; r < arrayCellFragment.length; r++) {
            for (int c = 0; c < arrayCellFragment.length; c++) {
                arrayCellFragment[r][c].setBooleanPaintedCell(true);
            }
        }
    }

    public static void winGame(Context context) {
        AlertDialog.winner(context);
        BoardGameActivity.chronometer.stop();
        BoardGameActivity.penPencilButton.setText(R.string.activity_board_game_pen_text);
        BoardGameActivity.penPencilButton.setEnabled(false);
        KeyboardFragment.resetKeyboard();
        KeyboardFragment.setEnabledKeyboard(false);
    }

    public static void loseGame(Context context) {
        AlertDialog.gameOver(context);
        Sudoku.setPaintedCellOptionToFalseInBoardBame(BoardGameActivity.getArrayCellFragment());
        BoardGameActivity.chronometer.stop();
        BoardGameActivity.penPencilButton.setText(R.string.activity_board_game_pen_text);
        BoardGameActivity.penPencilButton.setEnabled(false);
        KeyboardFragment.resetKeyboard();
        KeyboardFragment.setEnabledKeyboard(false);
    }
}