package com.example.arithmeticapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class OddEven extends AppCompatActivity {
    AppCompatButton a1,a2;
    EditText b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_odd_even);
        a1=(AppCompatButton)findViewById(R.id.checkbtn);
        a2=(AppCompatButton)findViewById(R.id.backbtn);
        b1=(EditText) findViewById(R.id.num1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s1 = b1.getText().toString();
                    int num1 = Integer.parseInt(s1);
                    if(num1%2==0) {
                        String result = String.valueOf(num1);
                        Toast.makeText(getApplicationContext(), result + " is even", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        String result = String.valueOf(num1);
                        Toast.makeText(getApplicationContext(), result + " is odd", Toast.LENGTH_SHORT).show();
                    }
                }
                catch(Exception e)
                {
                    Toast.makeText(getApplicationContext(), "not valid", Toast.LENGTH_SHORT).show();
                }
            }

        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}