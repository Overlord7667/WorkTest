package com.betelgeuse.corp.worktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView textView = new TextView(this);
        //textView.setText("Привет Мир!");
        //textView.setTextSize(30);
        //textView.setTextColor();
        //setContentView(textView);

    }

    public void Button1(View view) {
        //Toast.makeText(this, "Вы нажали кнопку", Toast.LENGTH_LONG).show();
        //Snackbar.make(view, R.string.button_click, Snackbar.LENGTH_LONG).show();
        Snackbar.make(view, getString(R.string.message1) + "  " + count++, Snackbar.LENGTH_LONG).show();
//        Log.i("Button","Work on");
//        Log.e("Button","Work on");
//        Log.w("Button","Work on");
//        Log.d("Button","Work on");
    }

    public void Button2(View view) {
        //Toast.makeText(this, R.string.button_click2, Toast.LENGTH_LONG).show();
        Toast.makeText(this,getString(R.string.message2) + " " + count--, Toast.LENGTH_LONG).show();
//        Log.i("Button_2","Work on click");
//        Log.e("Button_2","Work on click");
//        Log.w("Button_2","Work on click");
//        Log.d("Button_2","Work on click");
    }
}