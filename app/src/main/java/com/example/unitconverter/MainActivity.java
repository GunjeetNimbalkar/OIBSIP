package com.example.unitconverter;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton1, imageButton2, imageButton3, imageButton4;
    TextView txv;
    ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton1 = (ImageButton) findViewById(R.id.ibtn1);
        imageButton2 = (ImageButton) findViewById(R.id.ibtn2);
        imageButton3 = (ImageButton) findViewById(R.id.ibtn3);
        imageButton4 = (ImageButton) findViewById(R.id.ibtn4);


        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                Intent intent = new Intent(MainActivity.this,Massactivity.class);
                startActivity(intent);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                Intent intent = new Intent(MainActivity.this,Temperature.class);
                startActivity(intent);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                Intent intent = new Intent(MainActivity.this,Length.class);
                startActivity(intent);
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                Intent intent = new Intent(MainActivity.this,Volume.class);
                startActivity(intent);
            }
        });

    }
}