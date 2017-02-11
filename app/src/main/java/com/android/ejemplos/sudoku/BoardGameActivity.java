package com.android.ejemplos.sudoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BoardGameActivity extends AppCompatActivity {

    CellFragment reg1cel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_game);


    }
}
