package edu.washington.cathej.activityspy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("launching", "onCreate event fired");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("launching", "onStart event fired");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("launching", "onResume event fired");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("closing", "We're going down, Captain!");
    }
}
