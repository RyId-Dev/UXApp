package com.example.uiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class Explanation extends AppCompatActivity implements View.OnClickListener {

    TextView clrtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation);

        ImageButton imgbtn = (ImageButton) findViewById(R.id.similBtn);
        imgbtn.setOnClickListener(this);
        ImageButton imgbtn2 = (ImageButton) findViewById(R.id.contBtn);
        imgbtn2.setOnClickListener(this);
        ImageButton imgbtn3 = (ImageButton) findViewById(R.id.closBtn);
        imgbtn3.setOnClickListener(this);
        ImageButton imgbtn4 = (ImageButton) findViewById(R.id.proxBtn);
        imgbtn4.setOnClickListener(this);

        Button btn1 = (Button) findViewById(R.id.beginBtn);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
       switch (v.getId()) {
           case R.id.similBtn:
                Intent int1 = new Intent(this, SimilExp.class);
                startActivity(int1);
               break;

           case R.id.contBtn:
               Intent int2 = new Intent(this, ContExp.class);
               startActivity(int2);
               break;

           case R.id.closBtn:
               Intent int3 = new Intent(this, ClosExp.class);
               startActivity(int3);
               break;

           case R.id.proxBtn:
               Intent int4 = new Intent(this, ProxExp.class);
               startActivity(int4);
               break;

           case R.id.beginBtn:
               Intent int5 = new Intent(this, ColourPicker.class);
               startActivity(int5);
               break;

           default:
               break;
       }
    }
}