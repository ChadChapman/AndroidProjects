package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mTextView;

    String mAppState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
//            mAppState = savedInstanceState.getString(APP_STATE_KEY);
        }
        setContentView(R.layout.activity_main);
//        mTextView = (TextView) findViewById(R.id.text_view);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
//        mTextView.setText(savedInstanceState.getString(TEXT_VIEW_KEY));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
//        outState.putString(APP_STATE_KEY, mGameState);
//        outState.putString(TEXT_VIEw_KEY, mTextView.getText());

        super.onSaveInstanceState(outState);
    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
