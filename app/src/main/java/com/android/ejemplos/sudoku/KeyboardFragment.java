package com.android.ejemplos.sudoku;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class KeyboardFragment extends Fragment {

    static String currentNumber;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    public KeyboardFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_keyboard, container, false);

        button1 = (Button) view.findViewById(R.id.fragment_keyboard_button_1);
        button2 = (Button) view.findViewById(R.id.fragment_keyboard_button_2);
        button3 = (Button) view.findViewById(R.id.fragment_keyboard_button_3);
        button4 = (Button) view.findViewById(R.id.fragment_keyboard_button_4);
        button5 = (Button) view.findViewById(R.id.fragment_keyboard_button_5);
        button6 = (Button) view.findViewById(R.id.fragment_keyboard_button_6);
        button7 = (Button) view.findViewById(R.id.fragment_keyboard_button_7);
        button8 = (Button) view.findViewById(R.id.fragment_keyboard_button_8);
        button9 = (Button) view.findViewById(R.id.fragment_keyboard_button_9);

        Button arrayButton[] = {button1, button2, button3, button4, button5, button6, button7, button8, button9};

        for (final Button button: arrayButton) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    currentNumber = button.getText().toString();
                }
            });
        }

        return view;
    }
}
