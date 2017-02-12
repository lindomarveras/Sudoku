package com.android.ejemplos.sudoku.util;

import android.content.Context;
import android.content.DialogInterface;

import com.android.ejemplos.sudoku.model.Sudoku;

public class AlertDialog {

    public static void gameOver(Context context) {

        android.support.v7.app.AlertDialog.Builder dialog = new android.support.v7.app.AlertDialog.Builder(context);

        dialog.setTitle("Game over");
        dialog.setMessage("Do you want to restart?");
        dialog.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Sudoku.restartApp();
            }
        });
        dialog.setNegativeButton(android.R.string.cancel,null);
        dialog.show();
    }
}
