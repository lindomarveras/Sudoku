package com.android.ejemplos.sudoku;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BoardGameActivity extends AppCompatActivity {

    private CellFragment cell_1_1;
    private CellFragment cell_1_2;
    private CellFragment cell_1_3;
    private CellFragment cell_1_4;
    private CellFragment cell_1_5;
    private CellFragment cell_1_6;
    private CellFragment cell_1_7;
    private CellFragment cell_1_8;
    private CellFragment cell_1_9;

    private CellFragment cell_2_1;
    private CellFragment cell_2_2;
    private CellFragment cell_2_3;
    private CellFragment cell_2_4;
    private CellFragment cell_2_5;
    private CellFragment cell_2_6;
    private CellFragment cell_2_7;
    private CellFragment cell_2_8;
    private CellFragment cell_2_9;

    private CellFragment cell_3_1;
    private CellFragment cell_3_2;
    private CellFragment cell_3_3;
    private CellFragment cell_3_4;
    private CellFragment cell_3_5;
    private CellFragment cell_3_6;
    private CellFragment cell_3_7;
    private CellFragment cell_3_8;
    private CellFragment cell_3_9;

    private CellFragment cell_4_1;
    private CellFragment cell_4_2;
    private CellFragment cell_4_3;
    private CellFragment cell_4_4;
    private CellFragment cell_4_5;
    private CellFragment cell_4_6;
    private CellFragment cell_4_7;
    private CellFragment cell_4_8;
    private CellFragment cell_4_9;

    private CellFragment cell_5_1;
    private CellFragment cell_5_2;
    private CellFragment cell_5_3;
    private CellFragment cell_5_4;
    private CellFragment cell_5_5;
    private CellFragment cell_5_6;
    private CellFragment cell_5_7;
    private CellFragment cell_5_8;
    private CellFragment cell_5_9;

    private CellFragment cell_6_1;
    private CellFragment cell_6_2;
    private CellFragment cell_6_3;
    private CellFragment cell_6_4;
    private CellFragment cell_6_5;
    private CellFragment cell_6_6;
    private CellFragment cell_6_7;
    private CellFragment cell_6_8;
    private CellFragment cell_6_9;

    private CellFragment cell_7_1;
    private CellFragment cell_7_2;
    private CellFragment cell_7_3;
    private CellFragment cell_7_4;
    private CellFragment cell_7_5;
    private CellFragment cell_7_6;
    private CellFragment cell_7_7;
    private CellFragment cell_7_8;
    private CellFragment cell_7_9;

    private CellFragment cell_8_1;
    private CellFragment cell_8_2;
    private CellFragment cell_8_3;
    private CellFragment cell_8_4;
    private CellFragment cell_8_5;
    private CellFragment cell_8_6;
    private CellFragment cell_8_7;
    private CellFragment cell_8_8;
    private CellFragment cell_8_9;

    private CellFragment cell_9_1;
    private CellFragment cell_9_2;
    private CellFragment cell_9_3;
    private CellFragment cell_9_4;
    private CellFragment cell_9_5;
    private CellFragment cell_9_6;
    private CellFragment cell_9_7;
    private CellFragment cell_9_8;
    private CellFragment cell_9_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_game);

        cell_1_1 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_1_1);
        cell_1_2 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_1_2);
        cell_1_3 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_1_3);
        cell_1_4 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_1_4);
        cell_1_5 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_1_5);
        cell_1_6 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_1_6);
        cell_1_7 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_1_7);
        cell_1_8 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_1_8);
        cell_1_9 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_1_9);

        cell_2_1 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_2_1);
        cell_2_2 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_2_2);
        cell_2_3 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_2_3);
        cell_2_4 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_2_4);
        cell_2_5 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_2_5);
        cell_2_6 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_2_6);
        cell_2_7 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_2_7);
        cell_2_8 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_2_8);
        cell_2_9 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_2_9);

        cell_3_1 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_3_1);
        cell_3_2 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_3_2);
        cell_3_3 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_3_3);
        cell_3_4 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_3_4);
        cell_3_5 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_3_5);
        cell_3_6 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_3_6);
        cell_3_7 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_3_7);
        cell_3_8 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_3_8);
        cell_3_9 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_3_9);

        cell_4_1 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_4_1);
        cell_4_2 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_4_2);
        cell_4_3 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_4_3);
        cell_4_4 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_4_4);
        cell_4_5 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_4_5);
        cell_4_6 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_4_6);
        cell_4_7 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_4_7);
        cell_4_8 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_4_8);
        cell_4_9 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_4_9);

        cell_5_1 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_5_1);
        cell_5_2 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_5_2);
        cell_5_3 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_5_3);
        cell_5_4 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_5_4);
        cell_5_5 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_5_5);
        cell_5_6 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_5_6);
        cell_5_7 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_5_7);
        cell_5_8 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_5_8);
        cell_5_9 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_5_9);

        cell_6_1 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_6_1);
        cell_6_2 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_6_2);
        cell_6_3 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_6_3);
        cell_6_4 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_6_4);
        cell_6_5 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_6_5);
        cell_6_6 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_6_6);
        cell_6_7 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_6_7);
        cell_6_8 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_6_8);
        cell_6_9 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_6_9);

        cell_7_1 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_7_1);
        cell_7_2 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_7_2);
        cell_7_3 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_7_3);
        cell_7_4 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_7_4);
        cell_7_5 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_7_5);
        cell_7_6 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_7_6);
        cell_7_7 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_7_7);
        cell_7_8 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_7_8);
        cell_7_9 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_7_9);

        cell_8_1 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_8_1);
        cell_8_2 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_8_2);
        cell_8_3 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_8_3);
        cell_8_4 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_8_4);
        cell_8_5 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_8_5);
        cell_8_6 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_8_6);
        cell_8_7 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_8_7);
        cell_8_8 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_8_8);
        cell_8_9 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_8_9);

        cell_9_1 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_9_1);
        cell_9_2 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_9_2);
        cell_9_3 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_9_3);
        cell_9_4 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_9_4);
        cell_9_5 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_9_5);
        cell_9_6 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_9_6);
        cell_9_7 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_9_7);
        cell_9_8 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_9_8);
        cell_9_9 = (CellFragment) getSupportFragmentManager().findFragmentById(R.id.activity_board_game_cell_9_9);

        CellFragment arrayCell[] = {cell_1_1, cell_1_2, cell_1_3, cell_1_4, cell_1_5, cell_1_6, cell_1_7, cell_1_8, cell_1_9,
                                    cell_2_1, cell_2_2, cell_2_3, cell_2_4, cell_2_5, cell_2_6, cell_2_7, cell_2_8, cell_2_9,
                                    cell_3_1, cell_3_2, cell_3_3, cell_3_4, cell_3_5, cell_3_6, cell_3_7, cell_3_8, cell_3_9,
                                    cell_4_1, cell_4_2, cell_4_3, cell_4_4, cell_4_5, cell_4_6, cell_4_7, cell_4_8, cell_4_9,
                                    cell_5_1, cell_5_2, cell_5_3, cell_5_4, cell_5_5, cell_5_6, cell_5_7, cell_5_8, cell_5_9,
                                    cell_6_1, cell_6_2, cell_6_3, cell_6_4, cell_6_5, cell_6_6, cell_6_7, cell_6_8, cell_6_9,
                                    cell_7_1, cell_7_2, cell_7_3, cell_7_4, cell_7_5, cell_7_6, cell_7_7, cell_7_8, cell_7_9,
                                    cell_8_1, cell_8_2, cell_8_3, cell_8_4, cell_8_5, cell_8_6, cell_8_7, cell_8_8, cell_8_9,
                                    cell_9_1, cell_9_2, cell_9_3, cell_9_4, cell_9_5, cell_9_6, cell_9_7, cell_9_8, cell_9_9};

        for (CellFragment cell: arrayCell) {
            cell.setMainNumberWhenPressed();
        }
    }
}
