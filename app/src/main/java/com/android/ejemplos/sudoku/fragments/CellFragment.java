package com.android.ejemplos.sudoku.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.ejemplos.sudoku.R;
import com.android.ejemplos.sudoku.util.Constants;
import com.android.ejemplos.sudoku.model.Sudoku;

public class CellFragment extends Fragment {


    public CellFragment() {
    }
    RelativeLayout layout;
    TextView mainNumber;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cell, container, false);

        mainNumber = (TextView) view.findViewById(R.id.frament_cell___main_number);
        layout = (RelativeLayout) view.findViewById(R.id.fragment_cell___layout);

        return view;
    }

    public void cellClicked(final int r, final int c) {
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkMove(view.getContext(), r, c);
            }
        });
    }

    private void checkMove(Context context, int r, int c) {
        if(!KeyboardFragment.currentNumber.equals("")) {
            if(KeyboardFragment.currentNumber.equals(Sudoku.boardGame[r][c])) {
                mainNumber.setText(KeyboardFragment.currentNumber);
                setBackgroundColor(R.drawable.corner_radius_painted);
            } else {
                if(Sudoku.life_counter == 0) {
                    AlertDialog.gameOver(context);
                } else {
                    LifeFragment.setIconImage(LifeFragment.arrayIcon[Sudoku.life_counter], R.drawable.heart_icon_empty);
                    Sudoku.life_counter = Sudoku.life_counter - 1;
                }
            }
        }
    }

    public void setBackgroundColor(int drawable) {
        layout.setBackgroundResource(drawable);
    }

    public void setMainNumber(String number) {
        mainNumber.setText(number);
    }
}
