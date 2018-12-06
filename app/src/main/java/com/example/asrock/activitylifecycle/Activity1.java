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
}
