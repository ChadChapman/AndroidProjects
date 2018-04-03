package com.example.myfirstapp;

import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    TextView mTextView;

    String mAppState;

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
//            mAppState = savedInstanceState.getString(APP_STATE_KEY);
        }
        setContentView(R.layout.activity_main);
//        mTextView = (TextView) findViewById(R.id.text_view);

        Log.i("onCreate", "MyFirstApp was created!");

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
//        mTextView.setText(savedInstanceState.getString(TEXT_VIEW_KEY));
        if (savedInstanceState == null) {
            Log.e("onRestoreInstanceState", "savedInstanceState was equal to null!");
        }
        Log.i("onRestoreInstanceState", "instance state was restored");
        Log.d("onRestoreInstanceState", "Bundle= " + savedInstanceState.toString());
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
//        outState.putString(APP_STATE_KEY, mGameState);
//        outState.putString(TEXT_VIEw_KEY, mTextView.getText());

        super.onSaveInstanceState(outState);
        Log.w("onSaveInstanceState", "instance state is being saved!");
        Log.d("onSaveInstanceState", "outState= " + outState.toString());
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.v("onStart", "application is starting");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("onResume", "application is has now resumed");
        Log.w("onResume", "resumed application");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("onPause", "application has been paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        ContentValues values = new ContentValues();
//        values.put(NotePad.Notes.COLUMN_NAME_NOTE, getCurrentNoteText());
//        values.put(NotePad.Notes.COLUMN_NAME_TITLE, getCurrentNoteTitle());
        Log.w("onStop", "application has been stopped!");
        if (values == null) {
            Log.e("onStop", "uh-oh, content values were null!");
        } else {
            Log.e("onStop", "content values were not null!");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("onDestory", "oh noes! app has been destroyed!");
        Log.e("onDestroy", "app has been destroyed");
        Log.wtf("onDestroy", "noooo!! you must never destroy this app!");
    }
}
