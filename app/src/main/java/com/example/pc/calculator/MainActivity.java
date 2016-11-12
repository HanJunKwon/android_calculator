package com.example.pc.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    TextView tv1;

    int num1;
    int num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setNumber();
        setButton();
    }

    void setNumber(){
        n1= (EditText) findViewById(R.id.editText7);
        n2=(EditText) findViewById(R.id.editText8);
    }

    void setButton(){
    }

    void getNumber() {
        num1= Integer.parseInt(n1.getText().toString());
        num2 = Integer.parseInt(n2.getText().toString());
    }
}
