package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

        Button btnPlus,btnsub,btnmul,btndiv;
        EditText num3,num4;
        TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /*num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);

        st1 = getIntent().getExtras().getString("Value1");
        num3.setText(st1);

        st2= getIntent().getExtras().getString("Value2");
        num4.setText(st2);*/

        Intent i = getIntent();
        int st1 = i.getIntExtra(MainActivity.EXTRA_NUMBER1,0);
        int st2 = i.getIntExtra(MainActivity.EXTRA_NUMBER2,0);

            final EditText num3 = (EditText) findViewById(R.id.num3);
             final EditText num4 = (EditText) findViewById(R.id.num4);

             num3.setText(""+st1);
             num4.setText(""+st2);


             btnPlus = findViewById(R.id.btnplus);
             btnsub = findViewById(R.id.btnsub);
            btnmul = findViewById(R.id.btnmul);
            btndiv = findViewById(R.id.btndiv);

             result = findViewById(R.id.result);

             btnPlus.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     int st1 = Integer.parseInt(num3.getText().toString());
                     int st2 = Integer.parseInt(num4.getText().toString());
                     int sum = (st1+st2);
                     result.setText("Answer: " + String.valueOf(sum));
                 }
             });

             btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int st1 = Integer.parseInt(num3.getText().toString());
                int st2 = Integer.parseInt(num4.getText().toString());
                int sub = (st1-st2);
                result.setText("Answer: " + String.valueOf(sub));
            }
        });
             btnmul.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     int st1 = Integer.parseInt(num3.getText().toString());
                     int st2 = Integer.parseInt(num4.getText().toString());
                     int mul = (st1*st2);
                     result.setText("Answer: " + String.valueOf(mul));
                 }
             });

             btndiv.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     int st1 = Integer.parseInt(num3.getText().toString());
                     int st2 = Integer.parseInt(num4.getText().toString());
                     int div = (st1/st2);
                     result.setText("Answer: " + String.valueOf(div));
                 }
             });



    }
}