package com.example.goroscop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Dictionary;
import java.util.Hashtable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);
        Button b1 = findViewById(R.id.button);
        TextView tv = findViewById(R.id.textView3);

        String[] zodiacSigns = new String[12];
        zodiacSigns = getResources().getStringArray(R.array.signs);

        Dictionary<String, String> infoAboutZodiacSigns = new Hashtable<String, String>();
        for (int i=0;i<12;i++) {
            infoAboutZodiacSigns.put(zodiacSigns[i], getResources().getStringArray(R.array.description)[i]);
        }
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                com.example.goroscop.Button.onClick(infoAboutZodiacSigns, (String)spinner.getSelectedItem(), tv);
            }
        });
    }
}