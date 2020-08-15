package com.example.uiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class ColourPicker extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_picker);

        b1 = (Button) findViewById(R.id.redBtn);
        b2 = (Button) findViewById(R.id.orangeBtn);
        b3 = (Button) findViewById(R.id.yellowBtn);
        b4 = (Button) findViewById(R.id.darkgreenBtn);
        b5 = (Button) findViewById(R.id.greenBtn);
        b6 = (Button) findViewById(R.id.springgreenBtn);
        b7 = (Button) findViewById(R.id.blueBtn);
        b8 = (Button) findViewById(R.id.azureBtn);
        b9 = (Button) findViewById(R.id.cyanBtn);
        b10 = (Button) findViewById(R.id.blackBtn);
        b11 = (Button) findViewById(R.id.greyBtn);
        b12 = (Button) findViewById(R.id.whiteBtn);
        b13 = (Button) findViewById(R.id.beginTestBtn);

        t1 = (TextView) findViewById(R.id.testColourText);

        b13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent int1 = new Intent(getApplicationContext(), SimilarityTest1.class);
                startActivity(int1);
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                t1.setTextColor(getResources().getColor(R.color.red));
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                t1.setTextColor(getResources().getColor(R.color.orange));
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                t1.setTextColor(getResources().getColor(R.color.yellow));
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                t1.setTextColor(getResources().getColor(R.color.darkgreen));
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                t1.setTextColor(getResources().getColor(R.color.green));
            }
        });

        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                t1.setTextColor(getResources().getColor(R.color.springGreen));
            }
        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                t1.setTextColor(getResources().getColor(R.color.blue));
            }
        });

        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                t1.setTextColor(getResources().getColor(R.color.azure));
            }
        });

        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                t1.setTextColor(getResources().getColor(R.color.cyan));
            }
        });

        b10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                t1.setTextColor(getResources().getColor(R.color.black));
            }
        });

        b11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                t1.setTextColor(getResources().getColor(R.color.grey));
            }
        });

        b12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                t1.setTextColor(getResources().getColor(R.color.white));

            }
        });


    }

}
