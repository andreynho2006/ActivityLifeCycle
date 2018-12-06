package com.example.asrock.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity2 extends Activity {

    final String TAG2 = "Activity 2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Log.d(TAG2, "STATUS: onCreate()");
    }

    public void goToActivity1(View view) {
        Intent intent = new Intent(this, Activity1.class);
        startActivity(intent);
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(TAG2, "STATUS: onRestart()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG2, "STATUS: onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG2, "STATUS: onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG2, "STATUS: onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG2, "STATUS: onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG2, "STATUS: onDestroy()");
    }
}
