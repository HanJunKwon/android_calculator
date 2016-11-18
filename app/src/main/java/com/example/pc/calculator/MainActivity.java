package com.example.pc.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    TextView tv1;

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
        tv1 = (TextView)findViewById(R.id.textView2);
    }

    void on(View v){
        int num1 = Integer.parseInt(n1.getText().toString());
        int num2 = Integer.parseInt(n2.getText().toString());
        int result = 0;
        // 더하기
        if(v.getId() == R.id.button){
            result = num1+ num2;
        }
        //뺴기
        else if(v.getId() == R.id.button2){
            result = num1 - num2;
        }
        //곱하기
        else if(v.getId() == R.id.button3){
            result = num1 * num2;
        }
        //나누기
        else if(v.getId() == R.id.button4){
            try {
                result = num1 / num2;
            }catch(ArithmeticException ae){
                Toast.makeText(this, "0으로 나누시면 안 됩니다.", Toast.LENGTH_SHORT).show();
                tv1.setText("계산 결과 : ");
                return;
            }
        }
        tv1.setText("계산 결과 : "+result);
    }
}
