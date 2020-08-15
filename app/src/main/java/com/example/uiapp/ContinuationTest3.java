package com.example.uiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContinuationTest3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_continuation_test3);

        Button btn = (Button) findViewById(R.id.ctBtn6);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent int1 = new Intent(getApplicationContext(), ContinuationTest4.class);
                startActivity(int1);
            }
        });
    }
}
