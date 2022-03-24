package com.example.trialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
ImageButton b;
ImageButton b2;
ImageButton b3;
ImageButton s;
ImageButton groups;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main2);
        b = findViewById(R.id.logout);
        b.setOnClickListener(new View.OnClickListener()
        {
        @Override
        public void onClick(View v)
        {
            Intent i= new
                    Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
            Toast.makeText(MainActivity2.this, "You’ve been logged out", Toast.LENGTH_SHORT).show();
        }
        });
        b2 = findViewById(R.id.msg);
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i= new
                        Intent(getApplicationContext(),MainActivity3.class);
                startActivity(i);
            }
        });
        b3 = findViewById(R.id.notification);
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i= new
                        Intent(getApplicationContext(),notification.class);
                startActivity(i);
            }
        });
        s = findViewById(R.id.search);
        s.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i= new
                        Intent(getApplicationContext(),groups.class);
                startActivity(i);
            }
        });
        groups = findViewById(R.id.group);
        groups.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i= new
                        Intent(getApplicationContext(),realgroup.class);
                startActivity(i);
            }
        });

    }
}