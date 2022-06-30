package com.example.module_1_lesson_1_hw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String myText = new String("Hello world");
        Log.d("MYLOG", myText);

        myText = "Okay, new text printed.";
        Log.d("MYLOG", myText);

    }
}