package com.android.ejemplos.sudoku.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.ejemplos.sudoku.R;

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

    public void setMainNumberWhenPressed() {
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!KeyboardFragment.currentNumber.equals("")) {
                    mainNumber.setText(KeyboardFragment.currentNumber);
                    setBackgroundColor(R.drawable.corner_radius_painted);
                }
            }
        });
    }
    public void setBackgroundColor(int drawable) {
        layout.setBackgroundResource(drawable);
    }

    public void setMainNumber(String number) {
        mainNumber.setText(number);
    }
}
