package com.example.jimit.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {

    private String TAG = ActivityA.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ActivityA");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityA.this, ActivityB.class));
            }
        });
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: ActivityA");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: ActivityA");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: ActivityA");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: ActivityA");
        super.onPause();
    }
}
