package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("DisplayMessageActivity onCreate", "activity created");
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        if (message.equals("")) {
            Log.e("DisplayMessageActivity onCreate", "message was an empty string");
        }
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
