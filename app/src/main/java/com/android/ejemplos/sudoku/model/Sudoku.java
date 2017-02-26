package com.android.ejemplos.sudoku.model;

import android.content.Context;
import android.os.SystemClock;

import com.android.ejemplos.sudoku.R;
import com.android.ejemplos.sudoku.activities.BoardGameActivity;
import com.android.ejemplos.sudoku.fragments.BoardGameFragment;
import com.android.ejemplos.sudoku.fragments.KeyboardFragment;
import com.android.ejemplos.sudoku.fragments.LifeFragment;
import com.android.ejemplos.sudoku.util.AlertDialog;

public class Sudoku {
    private int lifeCounter = 4;
    private static String[][] boardGame = {{"8", "2", "7", "1", "5", "4", "3", "9", "6"},
                                           {"9", "6", "5", "3", "2", "7", "1", "4", "8"},
                                           {"3", "4", "1", "6", "8", "9", "7", "5", "2"},
                                           {"5", "9", "3", "4", "6", "8", "2", "7", "1"},
                                           {"4", "7", "2", "5", "1", "3", "6", "8", "9"},
                                           {"6", "1", "8", "9", "7", "2", "4", "3", "5"},
                                           {"7", "8", "6", "2", "3", "5", "9", "1", "4"},
                                           {"1", "5", "4", "7", "9", "6", "8", "2", "3"},
                                           {"2", "3", "9", "8", "4", "1", "5", "6", "7"}};

    public void resetGame(Context context, int numberOfCells, String level) {
        BoardGameFragment.generateBoardGame(numberOfCells);
        LifeFragment.restartIcons(context);
        lifeCounter = 4;
        BoardGameActivity.setTextLevel(level);
        BoardGameActivity.chronometer.setBase(SystemClock.elapsedRealtime());
        BoardGameActivity.chronometer.start();
        BoardGameActivity.penPencilButton.setText(R.string.activity_board_game_pen_text);
        BoardGameActivity.penPencilButton.setEnabled(true);
        KeyboardFragment.resetKeyboard();
        KeyboardFragment.setEnabledKeyboard(true);
    }

    public void winGame(Context context) {
        AlertDialog.winner(context);
        BoardGameActivity.chronometer.stop();
        BoardGameActivity.penPencilButton.setText(R.string.activity_board_game_pen_text);
        BoardGameActivity.penPencilButton.setEnabled(false);
        KeyboardFragment.resetKeyboard();
        KeyboardFragment.setEnabledKeyboard(false);
    }

    public void loseGame(Context context) {
        AlertDialog.gameOver(context);
        BoardGameFragment.setPaintedCellOptionToFalseInBoardBame(BoardGameFragment.getArrayCell());
        BoardGameActivity.chronometer.stop();
        BoardGameActivity.penPencilButton.setText(R.string.activity_board_game_pen_text);
        BoardGameActivity.penPencilButton.setEnabled(false);
        KeyboardFragment.resetKeyboard();
        KeyboardFragment.setEnabledKeyboard(false);
    }

    public int getLifeCounter() {
        return lifeCounter;
    }

    public void setLifeCounter(int life_counter) {
        this.lifeCounter = life_counter;
    }

    public static String[][] getBoardGame() {
        return boardGame;
    }
}