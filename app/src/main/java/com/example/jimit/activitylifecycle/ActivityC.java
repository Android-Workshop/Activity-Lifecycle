package com.example.jimit.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityC extends AppCompatActivity {

    private static final String TAG = ActivityC.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ActivityC");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: ActivityC");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: ActivityC");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: ActivityC");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: ActivityC");
        super.onPause();
    }
}
