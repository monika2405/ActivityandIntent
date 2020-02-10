package com.staradmin.android.tugasweek3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mOne, mTwo, mThree;
    public static final String TEXTEXTRA = "extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOne = findViewById(R.id.one);
        mTwo = findViewById(R.id.two);
        mThree = findViewById(R.id.three);

        mOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(TEXTEXTRA,"Klik Button Pertama");
                startActivity(intent);
            }
        });

        mTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(TEXTEXTRA,"Klik Button Kedua");
                startActivity(intent);
            }
        });

        mThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(TEXTEXTRA,"Klik Button Ketiga");
                startActivity(intent);
            }
        });
    }
}
