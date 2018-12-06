package com.example.asrock.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Activity1 extends Activity {

    final String TAG1 = "Activity 1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Log.d(TAG1, "STATUS: onCreate");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d(TAG1, "STATUS: onRestart()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG1, "STATUS: onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG1, "STATUS: onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG1, "STATUS: onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG1, "STATUS: onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG1, "STATUS: onDestroy()");
    }
}
