package com.android.ejemplos.sudoku.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.SystemClock;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import com.android.ejemplos.sudoku.fragments.CellFragment;
import com.android.ejemplos.sudoku.R;
import com.android.ejemplos.sudoku.util.Constants;
import com.android.ejemplos.sudoku.model.Sudoku;

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

    Sudoku sudoku = new Sudoku();

    private static TextView textLevel;
    public static Button penPencilButton;
    public static int penPencilOption = Constants.PEN_MODE;
    public static Chronometer chronometer;

    private static CellFragment arrayCell[][] = new CellFragment[9][9];
    private Context context;

    private long lastStopTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_game);

        textLevel = (TextView) findViewById(R.id.activity_board_game_level_text);
        penPencilButton = (Button) findViewById(R.id.activity_board_game_pen_pencil_button);
        chronometer = (Chronometer) findViewById(R.id.activity_board_game___chronometer);

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

        arrayCell[0][0] = cell_1_1;
        arrayCell[0][1] = cell_1_2;
        arrayCell[0][2] = cell_1_3;
        arrayCell[0][3] = cell_1_4;
        arrayCell[0][4] = cell_1_5;
        arrayCell[0][5] = cell_1_6;
        arrayCell[0][6] = cell_1_7;
        arrayCell[0][7] = cell_1_8;
        arrayCell[0][8] = cell_1_9;

        arrayCell[1][0] = cell_2_1;
        arrayCell[1][1] = cell_2_2;
        arrayCell[1][2] = cell_2_3;
        arrayCell[1][3] = cell_2_4;
        arrayCell[1][4] = cell_2_5;
        arrayCell[1][5] = cell_2_6;
        arrayCell[1][6] = cell_2_7;
        arrayCell[1][7] = cell_2_8;
        arrayCell[1][8] = cell_2_9;

        arrayCell[2][0] = cell_3_1;
        arrayCell[2][1] = cell_3_2;
        arrayCell[2][2] = cell_3_3;
        arrayCell[2][3] = cell_3_4;
        arrayCell[2][4] = cell_3_5;
        arrayCell[2][5] = cell_3_6;
        arrayCell[2][6] = cell_3_7;
        arrayCell[2][7] = cell_3_8;
        arrayCell[2][8] = cell_3_9;

        arrayCell[3][0] = cell_4_1;
        arrayCell[3][1] = cell_4_2;
        arrayCell[3][2] = cell_4_3;
        arrayCell[3][3] = cell_4_4;
        arrayCell[3][4] = cell_4_5;
        arrayCell[3][5] = cell_4_6;
        arrayCell[3][6] = cell_4_7;
        arrayCell[3][7] = cell_4_8;
        arrayCell[3][8] = cell_4_9;

        arrayCell[4][0] = cell_5_1;
        arrayCell[4][1] = cell_5_2;
        arrayCell[4][2] = cell_5_3;
        arrayCell[4][3] = cell_5_4;
        arrayCell[4][4] = cell_5_5;
        arrayCell[4][5] = cell_5_6;
        arrayCell[4][6] = cell_5_7;
        arrayCell[4][7] = cell_5_8;
        arrayCell[4][8] = cell_5_9;

        arrayCell[5][0] = cell_6_1;
        arrayCell[5][1] = cell_6_2;
        arrayCell[5][2] = cell_6_3;
        arrayCell[5][3] = cell_6_4;
        arrayCell[5][4] = cell_6_5;
        arrayCell[5][5] = cell_6_6;
        arrayCell[5][6] = cell_6_7;
        arrayCell[5][7] = cell_6_8;
        arrayCell[5][8] = cell_6_9;

        arrayCell[6][0] = cell_7_1;
        arrayCell[6][1] = cell_7_2;
        arrayCell[6][2] = cell_7_3;
        arrayCell[6][3] = cell_7_4;
        arrayCell[6][4] = cell_7_5;
        arrayCell[6][5] = cell_7_6;
        arrayCell[6][6] = cell_7_7;
        arrayCell[6][7] = cell_7_8;
        arrayCell[6][8] = cell_7_9;

        arrayCell[7][0] = cell_8_1;
        arrayCell[7][1] = cell_8_2;
        arrayCell[7][2] = cell_8_3;
        arrayCell[7][3] = cell_8_4;
        arrayCell[7][4] = cell_8_5;
        arrayCell[7][5] = cell_8_6;
        arrayCell[7][6] = cell_8_7;
        arrayCell[7][7] = cell_8_8;
        arrayCell[7][8] = cell_8_9;

        arrayCell[8][0] = cell_9_1;
        arrayCell[8][1] = cell_9_2;
        arrayCell[8][2] = cell_9_3;
        arrayCell[8][3] = cell_9_4;
        arrayCell[8][4] = cell_9_5;
        arrayCell[8][5] = cell_9_6;
        arrayCell[8][6] = cell_9_7;
        arrayCell[8][7] = cell_9_8;
        arrayCell[8][8] = cell_9_9;

        context = getApplicationContext();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                arrayCell[r][c].cellClicked(sudoku, r, c);
            }
        }

        penPencilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(penPencilOption == Constants.PEN_MODE) {
                    penPencilOption = Constants.PENCIL_MODE;
                    penPencilButton.setText(getResources().getString(R.string.activity_board_game_pencil_text));
                } else if(penPencilOption == Constants.PENCIL_MODE) {
                    penPencilOption = Constants.PEN_MODE;
                    penPencilButton.setText(getResources().getString(R.string.activity_board_game_pen_text));
                }
            }
        });
        sudoku.generateBoardGame(context, Constants.MEDIUM_LEVEL_CELL_NUMBER, Constants.MEDIUM_LEVEL_TEXT);
    }

    @Override
    protected void onPause() {
        super.onPause();
        chronometer.stop();
        lastStopTime = SystemClock.elapsedRealtime();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (lastStopTime == 0) {    // On first start
            chronometer.setBase(SystemClock.elapsedRealtime());
        } else {                    // On resume after pause
            long intervalOnPause = (SystemClock.elapsedRealtime() - lastStopTime);
            chronometer.setBase(chronometer.getBase() + intervalOnPause);
        }
        chronometer.start();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.level_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_level___easy) {
            sudoku.generateBoardGame(context, Constants.EASY_LEVEL_CELL_NUMBER, Constants.EASY_LEVEL_TEXT);
        } else if (id == R.id.menu_level___medium) {
            sudoku.generateBoardGame(context, Constants.MEDIUM_LEVEL_CELL_NUMBER, Constants.MEDIUM_LEVEL_TEXT);
        } else if(id == R.id.menu_level___hard) {
            sudoku.generateBoardGame(context, Constants.HARD_LEVEL_CELL_NUMBER, Constants.HARD_LEVEL_TEXT);
        }
        return super.onOptionsItemSelected(item);
    }

    public static CellFragment[][] getArrayCellFragment() {
        return arrayCell;
    }

    public static void setTextLevel(String text) {
        textLevel.setText(text);
    }
}