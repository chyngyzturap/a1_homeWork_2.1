package com.pharos.a1_homework_21;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String KEY = "key";
    private EditText numB1;
    private EditText numB2;
    private EditText numB3;
    private TextView sum;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numB1 = findViewById(R.id.num1);
        numB2 = findViewById(R.id.num2);
        numB3 = findViewById(R.id.num3);
        sum = findViewById(R.id.sumOf3);

    }


    public void result(View view) {
        int n1, n2, n3, s;
        String N1 = numB1.getText().toString();
        String N2 = numB2.getText().toString();
        String N3 = numB3.getText().toString();
        n1 = Integer.parseInt(N1);
        n2 = Integer.parseInt(N2);
        n3 = Integer.parseInt(N3);
        s = n1 + n2 + n3;
        String N = Integer.toString(s);
        sum.setText(N);
        counter = Integer.parseInt(N);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY, String.valueOf(counter));
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = Integer.parseInt(savedInstanceState.getString(KEY,""));
        sum.setText(String.valueOf(counter));
    }
}