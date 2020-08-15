package com.example.uiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SimilarityTest3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_similarity_test3);
        Button btn = (Button) findViewById(R.id.ctBtn3);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent int1 = new Intent(getApplicationContext(), ContinuationTest1.class);
                startActivity(int1);
            }
        });
    }
}
