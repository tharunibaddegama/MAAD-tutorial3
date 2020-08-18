package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    Button btnok;
    EditText num1, num2;
    int st1, st2;

    public static final String EXTRA_NUMBER1 = "com.example.application.EXTRA_NUMBER1";
    public static final String EXTRA_NUMBER2 = "com.example.application.EXTRA_NUMBER2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnok = findViewById(R.id.btnok);


        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(MainActivity.this,"Sending message",Toast.LENGTH_SHORT).show();


                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                st1 = Integer.parseInt(num1.getText().toString());
                st2 = Integer.parseInt(num2.getText().toString());
                i.putExtra(EXTRA_NUMBER1, st1);
                i.putExtra(EXTRA_NUMBER2 , st2);
                startActivity(i);


            }
        });

    }



}