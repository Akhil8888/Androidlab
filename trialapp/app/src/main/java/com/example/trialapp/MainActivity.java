package com.example.trialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b;
EditText name;
EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button);
        name=findViewById(R.id.name);
        password=findViewById(R.id.password);
        b.setOnClickListener(new View.OnClickListener()
        {
        @Override
        public void onClick(View v)
        {
            String pass="admin";
            String usernme="admin@gmail.com";
            String ipname=name.getText().toString();
            String inpass=password.getText().toString();
            if(ipname.isEmpty())
            {
                Toast.makeText(MainActivity.this, "Enter Email id", Toast.LENGTH_SHORT).show();

            }
          else  if (inpass.isEmpty())
            {
                Toast.makeText(MainActivity.this, "Enter password", Toast.LENGTH_SHORT).show();
            }
            else if(!usernme.matches(ipname))
            {
                Toast.makeText(MainActivity.this, "Enter a valid Email", Toast.LENGTH_SHORT).show();

            }
            else if(!pass.matches(inpass))
            {
                Toast.makeText(MainActivity.this, "Incorrect password", Toast.LENGTH_SHORT).show();

            }
            else{
            Intent i= new
                    Intent(getApplicationContext(),MainActivity2.class);
            startActivity(i);
        }}
    });
}
}