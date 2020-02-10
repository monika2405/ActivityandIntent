package com.staradmin.android.tugasweek3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView mDisplay;
    private String mTextString;
    private Button mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mDisplay = findViewById(R.id.display);
        mBack = findViewById(R.id.back);

        Intent intent = getIntent();
        mTextString = intent.getStringExtra(MainActivity.TEXTEXTRA);

        mDisplay.setText(mTextString);

        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}
