package com.example.goroscop;

import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Dictionary;

public class Button {
    public static void onClick(Dictionary <String, String> info,String selected, TextView text) {
        String value = info.get(selected);
        text.setText(value);
    }
}
