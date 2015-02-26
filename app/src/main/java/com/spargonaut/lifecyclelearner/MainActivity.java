package com.spargonaut.lifecyclelearner;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "Hey hey!  we've called onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "Oh Wow!  we've called onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "Oh look,  now we're calling onResume()!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "hold up. wait a minute. we just called onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "Hit the brakes! onStop() just got called.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "Die die die, my darling! onDestroy() got called");
    }
}
