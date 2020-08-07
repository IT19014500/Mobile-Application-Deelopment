package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {
    TextView txtView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        Log.i(
                "Lifecycle",
                "onCreate() invoked");

        txtView6 = findViewById(R.id.textView6);
        txtView6.setText(R.string.Msg2);

    }
    public void onStart()
    {
        super.onStart();
        Log.i(
                "Lifecycle",
                "onStart() invoked" );
    }
    public void onRestart()
    {
        super.onRestart();
        Log.i(
                "Lifecycle",
                "onRestart() invoked" );
    }
    public void onResume()
    {
        super.onResume();
        Log.i(
                "Lifecycle",
                "onResume() invoked" );
    }
    public void onPause()
    {
        super.onPause();
        Log.i(
                "Lifecycle",
                "onPause() invoked" );
    }
    public void onStop()
    {
        super.onStop();
        Log.i(
                "Lifecycle",
                "onStop() invoked" );
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.i(
                "Lifecycle",
                "onDestroy() invoked" );
    }
}