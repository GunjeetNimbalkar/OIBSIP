package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Length extends AppCompatActivity {
    EditText et1;
    Button bt1, bt2, bt3, bt4;
    TextView tx1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        final Button button, button1, button2, button3;
        final EditText ET;
        final TextView TV;

        button = (Button)findViewById(R.id.bt1);
        button1 = (Button)findViewById(R.id.bt2);
        button2 = (Button)findViewById(R.id.bt3);
        button3 = (Button)findViewById(R.id.bt4);
        ET = (EditText)findViewById(R.id.et1);
        TV = (TextView)findViewById(R.id.tx1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert = Double.parseDouble(ET.getText().toString());
                TV.setText(String.valueOf(convert * 100));
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert = Double.parseDouble(ET.getText().toString());
                TV.setText(String.valueOf(convert / 1000));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert = Double.parseDouble(ET.getText().toString());
                TV.setText(String.valueOf(convert / 1609.26939));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double convert = Double.parseDouble(ET.getText().toString());
                TV.setText(String.valueOf(convert * 3.28084));
            }
        });

    }
}