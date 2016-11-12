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
        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        tv1 = (TextView)findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                getNumber();
                tv1.setText("계산 결과 : "+(num1+num2));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNumber();
                tv1.setText("계산 결과 : "+(num1-num2));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNumber();
                tv1.setText("계산 결과 : "+(num1*num2));
            }
        });
    }

    void getNumber() {
        num1= Integer.parseInt(n1.getText().toString());
        num2 = Integer.parseInt(n2.getText().toString());
    }
}
