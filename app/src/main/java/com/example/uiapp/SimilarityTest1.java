package com.example.uiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SimilarityTest1 extends AppCompatActivity {

    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_similarity_test1);

        Button btn = (Button) findViewById(R.id.ctBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent int1 = new Intent(getApplicationContext(), SimilarityTest2.class);
                startActivity(int1);
            }
        });
    }

}
