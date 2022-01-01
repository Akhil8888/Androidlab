package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView input1;
    TextView input2;
    Button sub;
    Button add;
    Button div;
    Button mul;
    float res=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 =findViewById(R.id.input1);
        input2=findViewById(R.id.input2);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        add=findViewById(R.id.add);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.valueOf(input1.getText().toString());
                float num2=Float.valueOf(input2.getText().toString());
                res=num1-num2;
                Toast.makeText(MainActivity.this, "Difference is  "+res, Toast.LENGTH_SHORT).show();
            }
            });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.valueOf(input1.getText().toString());
                float num2=Float.valueOf(input2.getText().toString());
                res=num1+num2;
                Toast.makeText(MainActivity.this, "sum is "+res, Toast.LENGTH_SHORT).show();
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.valueOf(input1.getText().toString());
                float num2=Float.valueOf(input2.getText().toString());
                res=num1/num2;
                Toast.makeText(MainActivity.this, "Division is "+res, Toast.LENGTH_SHORT).show();
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num1=Float.valueOf(input1.getText().toString());
                float num2=Float.valueOf(input2.getText().toString());
                res=num1*num2;
                Toast.makeText(MainActivity.this, "product is "+res, Toast.LENGTH_SHORT).show();
            }
        })


    ;}
}