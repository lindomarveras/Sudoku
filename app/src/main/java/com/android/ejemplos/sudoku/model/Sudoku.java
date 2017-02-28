package com.android.ejemplos.sudoku.model;

import android.content.Context;
import android.os.SystemClock;

import com.android.ejemplos.sudoku.R;
import com.android.ejemplos.sudoku.activities.GameActivity;
import com.android.ejemplos.sudoku.fragments.BoardGameFragment;
import com.android.ejemplos.sudoku.fragments.KeyboardFragment;
import com.android.ejemplos.sudoku.fragments.LifeFragment;
import com.android.ejemplos.sudoku.util.AlertDialog;

public class Sudoku {
    private static String[][] boardGame = {{"8", "2", "7", "1", "5", "4", "3", "9", "6"},
                                           {"9", "6", "5", "3", "2", "7", "1", "4", "8"},
                                           {"3", "4", "1", "6", "8", "9", "7", "5", "2"},
                                           {"5", "9", "3", "4", "6", "8", "2", "7", "1"},
                                           {"4", "7", "2", "5", "1", "3", "6", "8", "9"},
                                           {"6", "1", "8", "9", "7", "2", "4", "3", "5"},
                                           {"7", "8", "6", "2", "3", "5", "9", "1", "4"},
                                           {"1", "5", "4", "7", "9", "6", "8", "2", "3"},
                                           {"2", "3", "9", "8", "4", "1", "5", "6", "7"}};

    public static void resetGame(Context context, int numberOfCells, String level) {
        BoardGameFragment.generateBoardGame(numberOfCells);
        LifeFragment.restartLife(context);
        GameActivity.setTextLevel(level);
        GameActivity.chronometer.setBase(SystemClock.elapsedRealtime());
        GameActivity.chronometer.start();
        GameActivity.penPencilButton.setText(R.string.activity_board_game_pen_text);
        GameActivity.penPencilButton.setEnabled(true);
        KeyboardFragment.resetKeyboard();
        KeyboardFragment.setEnabledKeyboard(true);
    }

    public static void winGame(Context context) {
        AlertDialog.winner(context);
        GameActivity.chronometer.stop();
        GameActivity.penPencilButton.setText(R.string.activity_board_game_pen_text);
        GameActivity.penPencilButton.setEnabled(false);
        KeyboardFragment.resetKeyboard();
        KeyboardFragment.setEnabledKeyboard(false);
    }

    public static void loseGame(Context context) {
        AlertDialog.gameOver(context);
        BoardGameFragment.setPaintedCellOptionToFalseInBoardBame(BoardGameFragment.getArrayCell());
        GameActivity.chronometer.stop();
        GameActivity.penPencilButton.setText(R.string.activity_board_game_pen_text);
        GameActivity.penPencilButton.setEnabled(false);
        KeyboardFragment.resetKeyboard();
        KeyboardFragment.setEnabledKeyboard(false);
    }

    public static String[][] getBoardGame() {
        return boardGame;
    }
}