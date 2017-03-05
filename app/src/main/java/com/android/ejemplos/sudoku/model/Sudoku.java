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
    private static int[][] boardGame;

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

    public static int[][] getBoardGame() {
        return boardGame;
    }

    public static void setBoardGame(int[][] boardGame) {
        Sudoku.boardGame = boardGame;
    }
}