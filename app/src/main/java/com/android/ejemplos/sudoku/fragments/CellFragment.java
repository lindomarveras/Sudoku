package com.android.ejemplos.sudoku.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.ejemplos.sudoku.R;
import com.android.ejemplos.sudoku.activities.BoardGameActivity;
import com.android.ejemplos.sudoku.model.Sudoku;
import com.android.ejemplos.sudoku.util.Animations;
import com.android.ejemplos.sudoku.util.Constants;

public class CellFragment extends Fragment {


    public CellFragment() {
    }

    TextView pencil1;
    TextView pencil2;
    TextView pencil3;
    TextView pencil4;
    TextView pencil5;
    TextView pencil6;
    TextView pencil7;
    TextView pencil8;
    TextView pencil9;

    TextView arrayPencil[] = new TextView[9];
    RelativeLayout layout;
    TextView mainNumber;

    private boolean booleanPaintedCell;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cell, container, false);

        mainNumber = (TextView) view.findViewById(R.id.frament_cell___main_number);
        layout = (RelativeLayout) view.findViewById(R.id.fragment_cell___layout);

        pencil1 = (TextView) view.findViewById(R.id.frament_cell___pencil_1);
        pencil2 = (TextView) view.findViewById(R.id.frament_cell___pencil_2);
        pencil3 = (TextView) view.findViewById(R.id.frament_cell___pencil_3);
        pencil4 = (TextView) view.findViewById(R.id.frament_cell___pencil_4);
        pencil5 = (TextView) view.findViewById(R.id.frament_cell___pencil_5);
        pencil6 = (TextView) view.findViewById(R.id.frament_cell___pencil_6);
        pencil7 = (TextView) view.findViewById(R.id.frament_cell___pencil_7);
        pencil8 = (TextView) view.findViewById(R.id.frament_cell___pencil_8);
        pencil9 = (TextView) view.findViewById(R.id.frament_cell___pencil_9);

        arrayPencil[0] = pencil1;
        arrayPencil[1] = pencil2;
        arrayPencil[2] = pencil3;
        arrayPencil[3] = pencil4;
        arrayPencil[4] = pencil5;
        arrayPencil[5] = pencil6;
        arrayPencil[6] = pencil7;
        arrayPencil[7] = pencil8;
        arrayPencil[8] = pencil9;

        return view;
    }

    public void cellClicked(final int r, final int c) {
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(!KeyboardFragment.currentNumber.equals("") && !booleanPaintedCell) {
                if (BoardGameActivity.penPencilOption == Constants.PEN_MODE) {
                    penMove(view.getContext(), r, c);
                } else if (BoardGameActivity.penPencilOption == Constants.PENCIL_MODE) {
                    pencilMove();
                }
            }
            }
        });
    }

    private void penMove(Context context, int r, int c) {
        setBooleanPaintedCell(true);
        resetPencilCell();
        if(Sudoku.completedBoardGame(BoardGameActivity.getArrayCellFragment())) {
            Sudoku.winGame(context);
        }
        if(KeyboardFragment.currentNumber.equals(Sudoku.boardGame[r][c])) {
            Animations.annimationCorrectCell(context, layout);
            mainNumber.setText(KeyboardFragment.currentNumber);
            setBackgroundColor(R.drawable.corner_radius_correct_cell);
        } else {
            Animations.animationIncorrectCell(context, layout);
            Animations.animationHeartEmpty(context, LifeFragment.arrayIcon[Sudoku.life_counter]);
            mainNumber.setText(Sudoku.boardGame[r][c]);
            setBackgroundColor(R.drawable.corner_radius_incorrect_cell);
            if(Sudoku.life_counter == 0) {
                Sudoku.loseGame(context);
            } else {
                Sudoku.life_counter = Sudoku.life_counter - 1;
            }
        }
    }

    private void pencilMove() {
        for (int i = 0; i < arrayPencil.length; i++) {
            if(KeyboardFragment.currentNumber.equals(Integer.toString(i + 1))) {
                if(arrayPencil[i].getVisibility() == View.VISIBLE) {
                    arrayPencil[i].setVisibility(View.INVISIBLE);
                } else if(arrayPencil[i].getVisibility() == View.INVISIBLE) {
                    arrayPencil[i].setVisibility(View.VISIBLE);
                }
            }
        }
    }

    public void resetPencilCell() {
        for (TextView pencil: arrayPencil) {
            pencil.setVisibility(View.INVISIBLE);
        }
    }

    public void setBackgroundColor(int drawable) {
        layout.setBackgroundResource(drawable);
    }

    public void setMainNumber(String number) {
        mainNumber.setText(number);
    }

    public void setBooleanPaintedCell(boolean booleanPaintedCell) {
        this.booleanPaintedCell = booleanPaintedCell;
    }

    public boolean isBooleanPaintedCell() {
        return booleanPaintedCell;
    }
}