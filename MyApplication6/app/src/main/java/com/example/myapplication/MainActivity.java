package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button login;
    String name="admin";
    String ps="1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        username =findViewById(R.id.username1);
        password=findViewById(R.id.password1);
        login=findViewById(R.id.login1);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inpname = username.getText().toString();
                String pwd = password.getText().toString();

                if (inpname.isEmpty() || pwd.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Fields are emplty ", Toast.LENGTH_SHORT).show();

                } else {
                    if (inpname.equals(name) && pwd.equals(ps)) {
                        Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    }
                }
                 if(!inpname.equals(name)) {
                    Toast.makeText(MainActivity.this, "Username Incorrect", Toast.LENGTH_SHORT).show();

                } else if (!pwd.equals(ps)) {
                    Toast.makeText(MainActivity.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
                }


            }

            });
            }
    }