package com.example.jimit.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    private static final String TAG = ActivityB.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ActivityB");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityB.this, ActivityC.class));
            }
        });
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: ActivityB");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: ActivityB");
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: ActivityB");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: ActivityB");
        super.onPause();
    }
}
